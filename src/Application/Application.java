package Application;

import Question.QuestionBank;

import java.util.Scanner;

public class Application {
    public static Scanner input = new Scanner(System.in);

    public void start() {
        QuestionBank initBank = QuestionBank.getInstance();

        boolean isFinish = false;
        while (!isFinish) {
            System.out.println("------- Soru Bankası -------");
            System.out.println("1 - Soru Bankasına soru ekleme");
            System.out.println("2 - Soru bankasından soru çıkarma");
            System.out.println("3 - Soru bankasındaki soruları listeleme");
            System.out.println("4 - Sınav oluşturma");
            System.out.println("0 - Çıkış -");
            System.out.println("-----------------------");
            System.out.print("Bir seçenek seçiniz:");
            int nextPlace = input.nextInt();
            switch (nextPlace) {
                case 0:
                    break;
                case 1:
                    initBank.addQuestionList();
                    break;
                case 2:
                    initBank.deleteQuestionTab();
                    break;
                case 3:
                    initBank.searchQuestionTab();
                    break;
                case 4:
                    initBank.chooseDifficulty(initBank);
//                    initBank.createExam();
                    break;
                default:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Geçersiz girdi girdiniz Soru Bankası sıfırlandı");
                    System.out.println("-----------------------------------------------");
                    start();
                    break;
            }

            if (nextPlace == 0) {
                System.out.println("Görüşmek Üzere");
                break;
            }
        }//finish while

    }
}
