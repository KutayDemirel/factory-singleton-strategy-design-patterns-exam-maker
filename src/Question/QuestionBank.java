package Question;

import Application.Application;
import Difficulty.DifficultyStrategy;
import Difficulty.EasyStrategy;
import Difficulty.HardStrategy;
import Difficulty.MediumStrategy;
import Exam.FullClassicQuestionExam;
import Exam.FullMultipleChoiceExam;
import Exam.MixedExam;
import Exam.QuestionFactory;
import ExamTake.ExamTake;
import Services.*;
import InitialQuestions.InitialData;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionBank {
    private List<Question> questions;
    private List<Question> deletableQuestions;
    public static Scanner input = new Scanner(System.in);
    private static QuestionBank instance = null;

    public QuestionBank() {
        InitialData initialData = new InitialData();
        this.questions = initialData.getInitialData();
    }

    private synchronized static void createInstance() {
        if (instance == null)
            instance = new QuestionBank();
    }

    public static QuestionBank getInstance() {
        if (instance == null)
            createInstance();
        return instance;
    }

    public void showQuestions() {
        Collections.sort(getQuestions());
        System.out.println("--------------------------------------------------");
        getQuestions().forEach(x -> {
            System.out.println("Soru = " + x.getTitle());
            System.out.println("Puan = " + x.getPoint());
            if(x instanceof MultipleChoiceQuestion){
                System.out.println("Doğru Cevap şıkkı = "+ ((MultipleChoiceQuestion) x).getRightAnswerChoice().toString());
            }
            System.out.println("Doğru Cevap = " + x.getRightAnswer());
            System.out.println("Zorluk = " + x.getLevel().toString());
            System.out.println("DeleteCode = " + x.getDeleteCode());
            System.out.println("-------------------------------");
        });
    }

    public void addQuestionList() {
        boolean exit = false;
        while (!exit) {
            System.out.println("------- Hangi Soru Tarzı Eklemek istersiniz -------");
            System.out.println("1 - Çoktan Seçmeli Soru");
            System.out.println("2 - Klasik Soru");
            System.out.println("3 - Doğru Yanlış Sorusu");
            System.out.println("4 - Boşluk Doldurma Sorusu");
            System.out.println("0 - Çıkış -");
            System.out.println("-----------------------");
            System.out.print("Bir seçenek seçiniz:");
            int selectedOption = QuestionBank.input.nextInt();

            while (selectedOption < 0 || selectedOption > 4) {
                System.out.print("Geçerli sayı giriniz. Seçimin :");
                selectedOption = Application.input.nextInt();
            }
            switch (selectedOption) {
                case 1:
                    AddQuestionService.addMultipleChoiceQuestion(getQuestions());
                    break;
                case 2:
                    AddQuestionService.addClassicalQuestion(getQuestions());
                    break;
                case 3:
                    AddQuestionService.addTrueFalseQuestion(getQuestions());
                    break;
                case 4:
                    AddQuestionService.addFillBlankQuestion(getQuestions());
                    break;
                case 0:
                    QuestionBank.input.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Önceki Menüye döndün");
                    exit = true;
                    break;
            }
        }
    }

    public void searchQuestionTab() {
        boolean exit = false;
        while (!exit) {
            System.out.println("------- Soruları nasıl listelemek istersiniz -------");
            System.out.println("1 - Soruların hepsini listele");
            System.out.println("2 - Soru metni içinde arama");
            System.out.println("3 - Soru şıklarının metinleri içinde");
            System.out.println("4 - Doğru şıkları üzerinden arama");
            System.out.println("5 - Puan üzerinden arama");
            System.out.println("6 - Zorluk derecesi üzerinden listeleme");
            System.out.println("0 - Çıkış -");
            System.out.println("-----------------------");
            System.out.print("Bir seçenek seçiniz:");
            int selectedOption = QuestionBank.input.nextInt();

            while (selectedOption < 0 || selectedOption > 6) {
                System.out.print("Geçerli sayı giriniz. Seçimin :");
                selectedOption = Application.input.nextInt();
            }
            switch (selectedOption) {
                case 1:
                    showQuestions();
                    break;
                case 2:
                    QuestionBank.input.nextLine();
                    SearchQuestionService.searchWithWord(getQuestions());
                    break;
                case 3:
                    QuestionBank.input.nextLine();
                    SearchQuestionService.searchWithInChoices(getQuestions());
                    break;
                case 4:
                    QuestionBank.input.nextLine();
                    SearchQuestionService.searchWithInRightChoices(getQuestions());
                    break;
                case 5:
                    QuestionBank.input.nextLine();
                    SearchQuestionService.searchWithPoint(getQuestions());
                    break;
                case 6:
                    QuestionBank.input.nextLine();
                    SearchQuestionService.searchWithLevel(getQuestions());
                    break;
                case 0:
                    QuestionBank.input.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Önceki Menüye döndün");
                    exit = true;
                    break;
            }
        }
    }

    public void createExam(List<Question> questions){
        boolean exit = false;
        while (!exit) {
            System.out.println("------- Sınav Türünü Seçiniz -------");
            System.out.println("1 - Sadece Çoktan Seçmeli Sorulardan");
            System.out.println("2 - Sadece Klasik Sorulardan");
            System.out.println("3 - Tüm soru tiplerinden oluşan");
            System.out.println("0 - Çıkış -");
            System.out.println("-----------------------");
            System.out.print("Bir seçenek seçiniz:");
            int selectedOption = QuestionBank.input.nextInt();

            while (selectedOption < 0 || selectedOption > 3) {
                System.out.print("Geçerli sayı giriniz. Seçimin :");
                selectedOption = Application.input.nextInt();
            }
            QuestionFactory questionFactory = new QuestionFactory();
            switch (selectedOption) {
                case 1:
                    QuestionBank.input.nextLine();
                    questionFactory.createExam(new FullMultipleChoiceExam(questions));
                    break;
                case 2:
                    QuestionBank.input.nextLine();
                    questionFactory.createExam(new FullClassicQuestionExam(questions));
                    break;
                case 3:
                    QuestionBank.input.nextLine();
                    questionFactory.createExam(new MixedExam(questions));
                    break;
                case 0:
                    QuestionBank.input.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Önceki Menüye döndün");
                    exit = true;
                    break;
            }
        }
    }

    public void deleteQuestionTab() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Silinmesini istediğiniz soruyu bulmak için arama kelimesi giriniz");
        String deleteWord = QuestionBank.input.nextLine();

        deleteWord = deleteWord.toLowerCase();
        boolean isCorrectSearch = deleteWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        while (!isCorrectSearch) {
            System.out.println("Lütfen sadece sayılardan ve harflerden oluşan bi arama yapınız!");
            deleteWord = QuestionBank.input.nextLine().toLowerCase();
            isCorrectSearch = deleteWord.matches("[a-zA-Z0-9ğüşıöçĞÜŞİÖÇ]*");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println(deleteWord + " için arama yapılıyor");
        System.out.println("----------------------------------------------------------------");
        setDeletableQuestionList(deleteWord);
        if (getDeletableQuestions().size() == 0) {
            System.out.println("Aradığınız kelimeyi içeren soru bulunamadı");
            System.out.println("----------------------------------------------------------------");
            return;
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Silinmesini istediğiniz soruyu seçiniz :");
        int deletedQuestion = input.nextInt();
        input.nextLine(); // clearing cursor
        while (deletedQuestion < 0 || deletedQuestion > getDeletableQuestions().size()) {
            System.out.print("Geçerli sayı giriniz. Seçimin :");
            deletedQuestion = input.nextInt();
        }
        if (deletedQuestion == 0) {
            return;
        }

        try {
            int finalDeletedQuestion = deletedQuestion;
            Question removeQuestion = getDeletableQuestions().stream()
                    .filter(qe -> Integer.parseInt(qe.getDeleteCode()) == finalDeletedQuestion).findFirst().orElse(null);
            getQuestions().remove(removeQuestion);
        } catch (Exception ex) {
            System.out.println("Soru silinemedi");
        }
    }

    public void chooseDifficulty(QuestionBank initBank){
        boolean exit = false;
        while (!exit) {
            System.out.println("------- Sınav Zorluğunu Seçiniz -------");
            System.out.println("1 - Kolay Sorulardan");
            System.out.println("2 - Orta Sorulardan");
            System.out.println("3 - Zor Sorulardan");
            System.out.println("0 - Çıkış -");
            System.out.println("-----------------------");
            System.out.print("Bir seçenek seçiniz:");
            int selectedOption = QuestionBank.input.nextInt();

            while (selectedOption < 0 || selectedOption > 3) {
                System.out.print("Geçerli sayı giriniz. Seçimin :");
                selectedOption = Application.input.nextInt();
            }
            switch (selectedOption) {
                case 1:
                    QuestionBank.input.nextLine();
                    DifficultyStrategy easyStrategy = new EasyStrategy(getQuestions());
                    initBank.createExam(easyStrategy.getExamQuestions());
                    break;
                case 2:
                    QuestionBank.input.nextLine();
                    DifficultyStrategy mediumStrategy = new MediumStrategy(getQuestions());
                    initBank.createExam(mediumStrategy.getExamQuestions());
                    break;
                case 3:
                    QuestionBank.input.nextLine();
                    DifficultyStrategy hardStrategy = new HardStrategy(getQuestions());
                    initBank.createExam(hardStrategy.getExamQuestions());
                    break;
                case 0:
                    QuestionBank.input.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Önceki Menüye döndün");
                    exit = true;
                    break;
            }
        }
    }

    public void setDeletableQuestionList(String title) {
        final List<Question> deletableQuestions = questions.stream()
                .filter(q -> q.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());

        printDeletableQuestionList(deletableQuestions);
        setDeletableQuestions(deletableQuestions);
    }

    public void printDeletableQuestionList(List<Question> deletableQuestions) {
        int count = 1;
        for (Question q : deletableQuestions) {
            q.setDeleteCode(String.valueOf(count));
            System.out.println((Integer.toString(count).concat(" - ").concat(q.getTitle())));
            count++;
        }
        if (deletableQuestions.size() != 0)
            System.out.println("0 - Çıkış");
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getDeletableQuestions() {
        return deletableQuestions;
    }

    public void setDeletableQuestions(List<Question> deletableQuestions) {
        this.deletableQuestions = deletableQuestions;
    }
}

