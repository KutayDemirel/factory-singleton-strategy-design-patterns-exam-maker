package Exam;

import Question.*;

import java.util.List;
import java.util.stream.Collectors;

public class FullMultipleChoiceExam extends Exam {
    private int takersPoint = 0;
    public FullMultipleChoiceExam(List<Question> questions) {
        super(questions);
    }

    @Override
    public void createRandomExam() {
        List<Question> multipleChoiceQuestions = getAllQuestions().stream()
                .filter(x -> x instanceof MultipleChoiceQuestion).collect(Collectors.toList());
        while (true) {
            if (getTotalPoint() > 110) {
                Question lastQuestion = getExamQuestions().get(getExamQuestions().size() - 1);
                multipleChoiceQuestions.remove(lastQuestion);
                getExamQuestions().remove(lastQuestion);
                setTotalPoint(getTotalPoint() - lastQuestion.getPoint());
            }
            if (getTotalPoint() > 99) {
                break;
            }
            if (multipleChoiceQuestions.size() == 0) {
                System.out.println("----------------------------");
                System.out.println("Rastgele eklenecek soru kalmadı");
                System.out.println("Toplam puan = " + getTotalPoint());
                System.out.println("----------------------------");
                break;
            }
            Question randQuestion = getRandomQuestion(multipleChoiceQuestions);
            getExamQuestions().add(randQuestion);
            multipleChoiceQuestions.remove(randQuestion);
            setTotalPoint(getTotalPoint() + randQuestion.getPoint());
        }
    }

    public void examResult(){
        getExamQuestions().forEach(q -> {
            if(q.getTakersAnswer().equals(q.getRightAnswer())){
            this.setTakersPoint(this.getTakersPoint() + q.getPoint());
        }
        });
    }

    public int getTakersPoint() {
        return takersPoint;
    }

    public void setTakersPoint(int takersPoint) {
        this.takersPoint = takersPoint;
    }
}
