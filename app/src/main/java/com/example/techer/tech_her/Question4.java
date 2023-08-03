package com.example.techer.tech_her;

public class Question4 extends Question {

    public Question4 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3)  {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine = "What should be written in the space below \n There are ' ' types of variables";
        isCorrect = false;
        trueAnswer = "3";
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
