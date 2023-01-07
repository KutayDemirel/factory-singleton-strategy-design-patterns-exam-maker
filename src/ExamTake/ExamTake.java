package ExamTake;

import Enums.MultipleChoiceEnum;
import Enums.TrueFalseEnum;
import Exam.*;
import Question.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ExamTake {
    private List<Question> examQuestions;
    private Exam exam;
    private final Random rand = new Random();

    public ExamTake(List<Question> examQuestions, Exam exam) {
        this.examQuestions = examQuestions;
        this.exam = exam;
    }

    public void doExam() {
        int count = 1;
        int randomNumber = rand.nextInt(0,999);

        try {
            FileWriter myWriter = new FileWriter(randomNumber + "-sinav.txt");
            myWriter.write("Sınava Hoşgeldiniz"+"\n");
            System.out.println("Sınava Hoşgeldiniz");
            for (Question q : getExamQuestions()) {
                String rightAnswer;
                System.out.println(count + " - " + q.getTitle());
                myWriter.write(count + " - " + q.getTitle()+"\n");
                if (q instanceof MultipleChoiceQuestion) {
                    Map<MultipleChoiceEnum, String> questionResults = ((MultipleChoiceQuestion) q).getAnswerType();
                    sortByKey(((MultipleChoiceQuestion) q).getAnswerType()).forEach(k -> System.out.println(k.toString() + " - " + questionResults.get(k)));
                    System.out.print("Cevabın nedir =");
                    myWriter.write("Cevabın nedir ="+"\n");
                    while (true) {
                        rightAnswer = QuestionBank.input.nextLine();
                        rightAnswer = rightAnswer.toUpperCase().replaceAll("\\s", "");
                        if (rightAnswer.equals("A") || rightAnswer.equals("B") || rightAnswer.equals("C") || rightAnswer.equals("D")) {
                            q.setTakersAnswer(questionResults.get(MultipleChoiceEnum.valueOf(rightAnswer)));
                            myWriter.write(q.getTakersAnswer()+"\n");
                            break;
                        }
                        System.out.print("LÜTFEN! Şık olarak giriniz = ");
                    }
                } else if (q instanceof TrueFalseQuestion) {
                    while (true) {
                        System.out.println("Sorunun doğru cevabı nedir? Doğru için D, Yanlış için Y giriniz");
                        rightAnswer = QuestionBank.input.nextLine();
                        rightAnswer = rightAnswer.toUpperCase().replaceAll("\\s", "");
                        if (rightAnswer.equals("Y") || rightAnswer.equals("D")) {
                            q.setTakersAnswer(((TrueFalseQuestion) q).getAnswerType().get(TrueFalseEnum.valueOf(rightAnswer)));
                            myWriter.write(q.getTakersAnswer()+"\n");
                            break;
                        }
                        System.out.print("Yalnızca Y veya D olarak giriniz =");
                    }
                } else if (q instanceof ClassicalQuestion) {
                    rightAnswer = QuestionBank.input.nextLine();
                    q.setTakersAnswer(rightAnswer);
                    myWriter.write(q.getTakersAnswer()+"\n");
                } else {
                    rightAnswer = QuestionBank.input.nextLine();
                    q.setTakersAnswer(rightAnswer);
                    myWriter.write(q.getTakersAnswer()+"\n");
                }
                count++;
            }

            if(getExam() instanceof FullMultipleChoiceExam){
                myWriter.write("Sınav Sonucun = ");
                myWriter.write(((FullMultipleChoiceExam) getExam()).getTakersPoint()+ "\n");
            }

            myWriter.flush();
            myWriter.close();
            System.out.println("Başarıyla Yazıldı.");
        } catch (IOException e) {
            System.out.println("Hata var.");
            e.printStackTrace();
        }


    }

    public ArrayList<MultipleChoiceEnum> sortByKey(Map<MultipleChoiceEnum, String> map) {
        ArrayList<MultipleChoiceEnum> sortedKeys
                = new ArrayList<>(map.keySet());

        Collections.sort(sortedKeys);

        return sortedKeys;
    }

    public List<Question> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<Question> examQuestions) {
        this.examQuestions = examQuestions;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
