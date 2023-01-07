package Difficulty;

import Enums.QuestionLevelEnum;
import Question.Question;

import java.util.List;
import java.util.stream.Collectors;

public class EasyStrategy implements DifficultyStrategy{
    private List<Question> questions;

    public EasyStrategy(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public List<Question> getExamQuestions() {
        return getQuestions().stream().filter(x -> QuestionLevelEnum.KOLAY.equals(x.getLevel()) || QuestionLevelEnum.NORMAL.equals(x.getLevel())).collect(Collectors.toList());
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
