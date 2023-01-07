package Difficulty;

import Enums.QuestionLevelEnum;
import Question.Question;

import java.util.List;
import java.util.stream.Collectors;

public class MediumStrategy implements DifficultyStrategy {
    private List<Question> questions;
    private List<Question> returnQuestions;

    public MediumStrategy(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public List<Question> getExamQuestions() {
        return getQuestions().stream().filter(x -> QuestionLevelEnum.ZOR.equals(x.getLevel()) || QuestionLevelEnum.NORMAL.equals(x.getLevel()) || QuestionLevelEnum.KOLAY.equals(x.getLevel())).collect(Collectors.toList());
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
