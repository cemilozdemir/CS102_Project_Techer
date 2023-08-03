package com.example.techer.tech_her;

public class Question5 extends Question{

    public Question5 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3)  {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine = ""; // 5th question hard question
        isCorrect = false;
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
