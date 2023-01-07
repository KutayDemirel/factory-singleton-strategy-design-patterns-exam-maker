package Exam;

import Question.Question;

import java.util.List;
import java.util.stream.Collectors;

public class MixedExam extends Exam {
    public MixedExam(List<Question> questions) {
        super(questions);
    }

    @Override
    public void createRandomExam() {
        List<Question> mixedQuestions = getAllQuestions();
        while (true) {
            if (getTotalPoint() > 110) {
                Question lastQuestion = getExamQuestions().get(getExamQuestions().size() - 1);
                mixedQuestions.remove(lastQuestion);
                getExamQuestions().remove(lastQuestion);
                setTotalPoint(getTotalPoint() - lastQuestion.getPoint());
            }
            if (getTotalPoint() > 99) {
                break;
            }
            if (mixedQuestions.size() == 0) {
                System.out.println("----------------------------");
                System.out.println("Rastgele eklenecek soru kalmadı");
                System.out.println("Toplam puan = " + getTotalPoint());
                System.out.println("----------------------------");
                break;
            }
            Question randQuestion = getRandomQuestion(mixedQuestions);
            getExamQuestions().add(randQuestion);
            mixedQuestions.remove(randQuestion);
            setTotalPoint(getTotalPoint() + randQuestion.getPoint());
        }
    }
}


