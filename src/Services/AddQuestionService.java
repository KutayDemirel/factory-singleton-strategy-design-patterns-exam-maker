package Services;

import Enums.MultipleChoiceEnum;
import Enums.QuestionLevelEnum;
import Enums.TrueFalseEnum;
import Question.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AddQuestionService {

    static void addMultipleChoiceQuestion(List<Question> questions) {
        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion();
        QuestionBank.input.nextLine();

        System.out.println("1 - Çoktan Seçmeli Soru :");
        String title = QuestionBank.input.nextLine();
        title = titleFormatter(title);
        multipleChoiceQuestion.setTitle(title);

        System.out.println(multipleChoiceQuestion.getTitle());
        Map<MultipleChoiceEnum, String> answers = new HashMap<>(MultipleChoiceEnum.values().length);
        System.out.println("Şıklar Ne olsun ?");
        for (MultipleChoiceEnum choice : MultipleChoiceEnum.values()) {
            System.out.print(choice.toString() + " şıkkı:");
            String answer = QuestionBank.input.nextLine();
            answers.put(choice, answer);
        }
        multipleChoiceQuestion.setAnswerType(answers);

        System.out.print("Doğru Cevap Hangisi ? Lütfen şık olarak giriniz:");
        while (true) {
            String rightAnswer = QuestionBank.input.nextLine();
            rightAnswer = rightAnswer.toUpperCase().replaceAll("\\s", "");
            if (rightAnswer.equals("A") || rightAnswer.equals("B") || rightAnswer.equals("C") || rightAnswer.equals("D")) {
                multipleChoiceQuestion.setRightAnswer(answers.get(MultipleChoiceEnum.valueOf(rightAnswer)));
                multipleChoiceQuestion.setRightAnswerChoice(MultipleChoiceEnum.valueOf(rightAnswer));
                break;
            }
            System.out.print("LÜTFEN! Şık olarak giriniz = ");
        }

        adjustQuestionLevel(multipleChoiceQuestion);
        questions.add(multipleChoiceQuestion);
        System.out.println("Sorunuz başarıyla eklendi");
    }

    static void addFillBlankQuestion(List<Question> questions) {
        FillBlankQuestion fillBlankQuestion = new FillBlankQuestion();
        QuestionBank.input.nextLine();
        System.out.println("Boşluk olacak yere alt tire koyunuz (_) !!");
        System.out.println("1 - Boşluk doldurma sorusunu giriniz :");
        String title = QuestionBank.input.nextLine();
        title = title.replaceAll("_", "______");

        title = titleFormatter(title);
        fillBlankQuestion.setTitle(title);
        System.out.println("Sorunun doğru cevabı nedir?");
        String answer = QuestionBank.input.nextLine();
//        answer = answer.toLowerCase();
//        boolean isCorrectSearch = answer.matches("^\S+$");
//        while (!isCorrectSearch) {
//            System.out.println("Lütfen sadece sayılardan ve harflerden oluşan bi arama yapınız!");
//            answer = QuestionBank.input.nextLine().toLowerCase();
//            isCorrectSearch = answer.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
//        }
        fillBlankQuestion.setRightAnswer(answer);

        adjustQuestionLevel(fillBlankQuestion);
        questions.add(fillBlankQuestion);
        System.out.println("Sorunuz başarıyla eklendi");

    }

    static void addTrueFalseQuestion(List<Question> questions) {
        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion();
        QuestionBank.input.nextLine();
        System.out.println("1 - Doğru Yanlış Sorusunu giriniz :");
        String title = QuestionBank.input.nextLine();
        title = titleFormatter(title);
        trueFalseQuestion.setTitle(title);
        while (true) {
            System.out.println("Sorunun doğru cevabı nedir? Doğru için D, Yanlış için Y giriniz");
            String answer = QuestionBank.input.nextLine();
            answer = answer.toUpperCase().replaceAll("\\s", "");
            if (answer.equals("Y") || answer.equals("D")) {
                trueFalseQuestion.setRightAnswer(trueFalseQuestion.getAnswerType().get(TrueFalseEnum.valueOf(answer)));
                break;
            }
        }

        adjustQuestionLevel(trueFalseQuestion);
        questions.add(trueFalseQuestion);
        System.out.println("Sorunuz başarıyla eklendi");
    }

    static void addClassicalQuestion(List<Question> questions) {
        ClassicalQuestion classicalQuestion = new ClassicalQuestion();
        QuestionBank.input.nextLine();

        System.out.println("1 - Klasik Soruyu giriniz :");
        String title = QuestionBank.input.nextLine();
        title = titleFormatter(title);
        classicalQuestion.setTitle(title);

        System.out.println("Sorunun doğru cevabı nedir?");
        String answer = QuestionBank.input.nextLine();
        classicalQuestion.setRightAnswer(answer);

        adjustQuestionLevel(classicalQuestion);
        questions.add(classicalQuestion);
        System.out.println("Sorunuz başarıyla eklendi");
    }

    static void adjustQuestionLevel(Question question) {
        System.out.println("Bu sorunun Zorluğu Nedir ?");
        boolean flag = false;
        while (!flag) {
            int questionLevel = 1;
            for (QuestionLevelEnum level : QuestionLevelEnum.values()) {
                System.out.println(questionLevel + " - " + level.toString());
                questionLevel++;
            }
            int levelPoint = QuestionBank.input.nextInt();
            switch (levelPoint) {
                case 1:
                    question.setPoint(20);
                    question.setLevel(QuestionLevelEnum.KOLAY);
                    flag = true;
                    break;
                case 2:
                    question.setPoint(40);
                    question.setLevel(QuestionLevelEnum.NORMAL);
                    flag = true;
                    break;
                case 3:
                    question.setPoint(50);
                    question.setLevel(QuestionLevelEnum.ZOR);
                    flag = true;
                    break;
                default:
                    break;
            }
        }
    }

    static String titleFormatter(String title) {
        title = title.substring(0, 1).toUpperCase() + title.substring(1);
        if (!title.substring(title.length() - 1).equals("?")) {
            title = title.concat(" ?");
        }
        return title;
    }

}
