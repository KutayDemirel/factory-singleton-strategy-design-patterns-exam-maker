package Question;

import Enums.QuestionLevelEnum;

public abstract class Question implements Comparable<Question> {
    private String deleteCode;
    private String title;
    private String rightAnswer;
    private String takersAnswer;
    private int point;
    private QuestionLevelEnum level;

    @Override
    public int compareTo(Question o) {
        if (this.point == o.point)
            return 0;
        else if (this.point > o.point)
            return 1;
        else
            return -1;
    }

    public String getDeleteCode() {
        return deleteCode;
    }

    public void setDeleteCode(String deleteCode) {
        this.deleteCode = deleteCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public QuestionLevelEnum getLevel() {
        return level;
    }

    public void setLevel(QuestionLevelEnum level) {
        this.level = level;
    }

    public String getTakersAnswer() {
        return takersAnswer;
    }

    public void setTakersAnswer(String takersAnswer) {
        this.takersAnswer = takersAnswer;
    }
}
