package Question;

import Enums.TrueFalseEnum;

import java.util.HashMap;
import java.util.Map;

public class TrueFalseQuestion extends Question {
    private Map<TrueFalseEnum, String> answerType;

    public TrueFalseQuestion() {
        this.answerType = new HashMap<>() {
            {
                put(TrueFalseEnum.D, "Doğru");
                put(TrueFalseEnum.Y, "Yanlış");
            }
        };
    }

    public Map<TrueFalseEnum, String> getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Map<TrueFalseEnum, String> answerType) {
        this.answerType = answerType;
    }
}
