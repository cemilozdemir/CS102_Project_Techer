package com.example.techer.tech_her;

public class Question20 extends Question {
    public Question20 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "";

        trueAnswer = "";
    }

                /*
                A) Hello
                B) run time error
                C) Hello world are the wrong answers
                    Explanation : Every final variable is compile time constant.
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
