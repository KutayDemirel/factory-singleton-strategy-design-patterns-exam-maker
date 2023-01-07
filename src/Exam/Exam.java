package Exam;

import Question.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Exam {
    private int totalPoint = 0;
    private List<Question> allQuestions;
    private List<Question> examQuestions = new ArrayList<Question>();
    private final Random rand = new Random();


    public Exam(List<Question> questions) {
        this.allQuestions = questions;
    }

    public abstract void createRandomExam();

    public Question getRandomQuestion(List<Question> questions){
        if (questions.size() == 0) {
            return null;
        }
        return questions.get(getRand().nextInt(0, questions.size()));
    }

    public void printExamQuestion() {
        getExamQuestions().forEach(x -> {
            System.out.println("-------------------------------");
            System.out.println("Soru = " + x.getTitle());
            if (x instanceof MultipleChoiceQuestion) {
                System.out.println("Doğru Cevap şıkkı = " + ((MultipleChoiceQuestion) x).getRightAnswerChoice().toString());
            }
            System.out.println("Doğru Cevap = " + x.getRightAnswer());
            System.out.println("Puan = " + x.getPoint());
            System.out.println("Zorluk = " + x.getLevel().toString());
            System.out.println("-------------------------------");
        });
        System.out.println(getTotalPoint());
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public List<Question> getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(List<Question> allQuestions) {
        this.allQuestions = allQuestions;
    }

    public List<Question> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<Question> examQuestions) {
        this.examQuestions = examQuestions;
    }

    public Random getRand() {
        return rand;
    }
}

