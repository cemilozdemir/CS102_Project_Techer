package com.example.techer.tech_her;

public class Question9 extends Question {

    public Question9 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                       String falseAnswer2, String falseAnswer3) {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "What is the output of the Java code snippet? \n" +
                        "byte a = 0b0000_0001;\n" +
                        "System.out.println(~a);";
                        /*
                        -1
                        254
                        127
                         */
        trueAnswer = "-2";
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