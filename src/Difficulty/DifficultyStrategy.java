package Difficulty;

import Question.Question;

import java.util.List;

public interface DifficultyStrategy {
    List<Question> getExamQuestions();
}
