package com.example.techer.tech_her;

public class Question16 extends Question{
    public Question16 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "What are the three general types of looping structures?\n \n" +
                "A) counting loop,  sentinel-controlled loop,  and result-controlled loop.\n" +
                "B) infinite loop, counting loop, nested loop\n" +
                "C) while loop, for loop, do loop\n" +
                "D) count up loop, count down loop, infinite loop";
        trueAnswer = "A";
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
