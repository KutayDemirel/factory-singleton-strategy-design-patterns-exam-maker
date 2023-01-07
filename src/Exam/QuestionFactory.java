package Exam;

import ExamTake.ExamTake;

public class QuestionFactory {

    public void createExam(Exam exam){
        exam.createRandomExam();
        ExamTake examTake = new ExamTake(exam.getExamQuestions(),exam);
        examTake.doExam();
    }
}
