package Question;


import Enums.MultipleChoiceEnum;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoiceQuestion extends Question{
    private Map<MultipleChoiceEnum,String> answerType = new HashMap<>(MultipleChoiceEnum.values().length);
    private MultipleChoiceEnum rightAnswerChoice;

    public Map<MultipleChoiceEnum, String> getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Map<MultipleChoiceEnum, String> answerType) {
        this.answerType = answerType;
    }

    public MultipleChoiceEnum getRightAnswerChoice() {
        return rightAnswerChoice;
    }

    public void setRightAnswerChoice(MultipleChoiceEnum rightAnswerChoice) {
        this.rightAnswerChoice = rightAnswerChoice;
    }
}
