package com.example.techer.tech_her;

public class Question15 extends Question{
    public Question15 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "";
        trueAnswer = "";
    }

                /*
                    Explanation :
                 */


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
