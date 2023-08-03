package com.example.techer.tech_her;

public class Question10 extends Question  {
    public Question10 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                       String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "";
        trueAnswer = "";
    }
    public String getQuestionLine() {
        return super.getQuestionLine();
    }

    public String getTrueAnswer(){
        return super.getTrueAnswer();
    }

    public boolean getIsCorrect() {
        return super.getIsCorrect();
    }
}
