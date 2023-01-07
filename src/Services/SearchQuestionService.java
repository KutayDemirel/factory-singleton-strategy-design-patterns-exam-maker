package Services;

import Application.Application;
import Enums.MultipleChoiceEnum;
import Enums.QuestionLevelEnum;
import Question.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface SearchQuestionService {

    static void searchWithWord(List<Question> searchQuestions) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bulunmasını istediğiniz soruyu bulmak için arama kelimesi giriniz");
        String searchWord = QuestionBank.input.nextLine();

        searchWord = searchWord.toLowerCase();
        boolean isCorrectSearch = searchWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        while (!isCorrectSearch) {
            System.out.println("Lütfen sadece sayılardan ve harflerden oluşan bi arama yapınız!");
            searchWord = QuestionBank.input.nextLine().toLowerCase();
            isCorrectSearch = searchWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println(searchWord + " için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");
        String finalSearchWord = searchWord;
        final List<Question> searchQuestion = searchQuestions.stream()
                .filter(q -> q.getTitle().toLowerCase().contains(finalSearchWord.toLowerCase())).collect(Collectors.toList());
        if (searchQuestion.size() == 0) {
            System.out.println("Aradığınız kelimeyi içeren soru bulunamadı");
            System.out.println("----------------------------------------------------------------");
            return;
        }
        Collections.sort(searchQuestion);
        printQuestions(searchQuestion);
    }

    static void searchWithInChoices(List<Question> searchQuestions) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bulunmasını istediğiniz soruyu bulmak için arama kelimesi giriniz");
        String searchWord = QuestionBank.input.nextLine();

        searchWord = searchWord.toLowerCase();
        boolean isCorrectSearch = searchWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        while (!isCorrectSearch) {
            System.out.println("Lütfen sadece sayılardan ve harflerden oluşan bi arama yapınız!");
            searchWord = QuestionBank.input.nextLine().toLowerCase();
            isCorrectSearch = searchWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println(searchWord + " için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");

        // Getting multiple choice question
        List<Question> multipleChoiceQuestions = new ArrayList<>();
        for (Question q : searchQuestions) {
            if (q instanceof MultipleChoiceQuestion) {
                String finalSearchWord = searchWord;
                ((MultipleChoiceQuestion) q).getAnswerType().values().forEach(value -> {
                    if (value.toLowerCase().contains(finalSearchWord)) {
                        multipleChoiceQuestions.add((MultipleChoiceQuestion) q);
                    }
                });
            }
        }

        Collections.sort(multipleChoiceQuestions);
        if (multipleChoiceQuestions.size() != 0) {
            System.out.printf("Cevap şıkları arasında %s olan sorular getirildi", searchWord);
            System.out.println();
        }
        printQuestions(multipleChoiceQuestions);

    }

    static void searchWithInRightChoices(List<Question> searchQuestions) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Doğru şık üzerine Bulunmasını istediğiniz soruyu bulmak için şıkkı giriniz");
        String searchWord = QuestionBank.input.nextLine();

        searchWord = searchWord.toLowerCase();
        boolean isCorrectSearch = searchWord.matches("([abcdABCD])\\1*");
        while (!isCorrectSearch) {
            System.out.println("Lütfen sadece şıklardan oluşan bi arama yapınız!");
            searchWord = QuestionBank.input.nextLine().toLowerCase();
            isCorrectSearch = searchWord.matches("([abcdABCD])\\1*");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println(searchWord + " şıkkı için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");

        // Getting multiple choice question
        List<Question> multipleChoiceQuestions = new ArrayList<>();
        for (Question q : searchQuestions) {
            if (q instanceof MultipleChoiceQuestion) {
                if (((MultipleChoiceQuestion) q).getRightAnswerChoice().equals(MultipleChoiceEnum.valueOf(searchWord.toUpperCase()))) {
                    multipleChoiceQuestions.add((MultipleChoiceQuestion) q);
                }
            }
        }

        Collections.sort(multipleChoiceQuestions);
        if (multipleChoiceQuestions.size() != 0) {
            System.out.printf("Cevap şıkları arasında %s olan sorular getirildi", searchWord);
            System.out.println();
        }
        printQuestions(multipleChoiceQuestions);

    }

    static void searchWithPoint(List<Question> searchQuestions) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Puan üzerine Bulunmasını istediğiniz soruyu bulmak için puan giriniz");
        int searchPoint = QuestionBank.input.nextInt();
        while (searchPoint < 0 || searchPoint > 100) {
            System.out.print("Geçerli sayı giriniz. Seçimin :");
            searchPoint = Application.input.nextInt();
        }
        QuestionBank.input.nextLine();

        System.out.println("----------------------------------------------------------------");
        System.out.println(searchPoint + " puanı için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");

        // Getting multiple choice question
        List<Question> exactPointQuestions = new ArrayList<>();
        for (Question q : searchQuestions) {
            if (q.getPoint() == searchPoint) {
                exactPointQuestions.add(q);
            }
        }

        Collections.sort(exactPointQuestions);
        if (exactPointQuestions.size() != 0) {
            System.out.println("Puanı " + searchPoint +" olan sorular getirildi");
        }
        printQuestions(exactPointQuestions);

    }

    static void searchWithLevel(List<Question> searchQuestions) {
        QuestionLevelEnum searchLevel;
        int count = 1;
        System.out.println("----------------------------------------------------------------");
        System.out.println("Seviye üzerine Bulunmasını istediğiniz soruyu bulmak için seviye seçiniz");
        for(QuestionLevelEnum level : QuestionLevelEnum.values()){
            System.out.println(count + " " + level.toString());
            count++;
        }
        int searchLevelint = QuestionBank.input.nextInt();
        while (searchLevelint < 0 || searchLevelint > 3) {
            System.out.print("Geçerli sayı giriniz. Seçimin :");
            searchLevelint = Application.input.nextInt();
        }
        QuestionBank.input.nextLine();
        if(searchLevelint == 1){
            searchLevel = QuestionLevelEnum.KOLAY;
        }else if(searchLevelint == 2){
            searchLevel = QuestionLevelEnum.NORMAL;
        }else{
            searchLevel = QuestionLevelEnum.ZOR;
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println(searchLevel + " zorlukta sorular için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");

        // Getting multiple choice question
        List<Question> levelQuestions = new ArrayList<>();
        for (Question q : searchQuestions) {
            if (q.getLevel().equals(searchLevel)) {
                levelQuestions.add(q);
            }
        }

        Collections.sort(levelQuestions);
        if (levelQuestions.size() != 0) {
            System.out.println("Seviyesi " + searchLevel +" olan sorular getirildi");
        }
        printQuestions(levelQuestions);

    }

    static void printQuestions(List<Question> searchQuestions) {
        if (searchQuestions.size() == 0) {
            System.out.println("-------------------------------");
            System.out.println("Sorguyu içeren soru yoktur");
            System.out.println("-------------------------------");
        }
        searchQuestions.forEach(x -> {
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
    }
}
