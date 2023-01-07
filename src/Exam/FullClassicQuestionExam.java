package Exam;

import Question.*;

import java.util.List;
import java.util.stream.Collectors;

public class FullClassicQuestionExam extends Exam {
    public FullClassicQuestionExam(List<Question> questions) {
        super(questions);
    }

    @Override
    public void createRandomExam() {
        List<Question> classicalQuestions = getAllQuestions().stream()
                .filter(x -> x instanceof ClassicalQuestion).collect(Collectors.toList());
        while (true) {
            if (getTotalPoint() > 110) {
                Question lastQuestion = getExamQuestions().get(getExamQuestions().size() - 1);
                classicalQuestions.remove(lastQuestion);
                getExamQuestions().remove(lastQuestion);
                setTotalPoint(getTotalPoint() - lastQuestion.getPoint());
            }
            if (getTotalPoint() > 99) {
                break;
            }
            if (classicalQuestions.size() == 0) {
                System.out.println("----------------------------");
                System.out.println("Rastgele eklenecek soru kalmadı");
                System.out.println("Toplam puan = " + getTotalPoint());
                System.out.println("----------------------------");
                break;
            }
            Question randQuestion = getRandomQuestion(classicalQuestions);
            getExamQuestions().add(randQuestion);
            classicalQuestions.remove(randQuestion);
            setTotalPoint(getTotalPoint() + randQuestion.getPoint());
        }
    }
}


