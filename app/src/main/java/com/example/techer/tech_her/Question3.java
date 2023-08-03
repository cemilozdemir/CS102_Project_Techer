package com.example.techer.tech_her;

public class Question3 extends Question {

    public Question3 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3)  {

        super(questionLine,isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine = "Which of the following variable descriptor is not a primitive type";
        isCorrect = false;
        trueAnswer = "string";
        falseAnswer1 = "int";
        falseAnswer2 = "boolean";
        falseAnswer3 = "char";

    }
    public String getQuestionLine() {
        return super.getQuestionLine();
    }

    public String getTrueAnswer(){
        return super.getTrueAnswer();
    }


    public String getFalseAnswer1(){
        return super.getFalseAnswer1();
    }


    public String getFalseAnswer2(){
        return super.getFalseAnswer2();
    }


    public String getFalseAnswer3(){
        return super.getFalseAnswer3();
    }

    public boolean getIsCorrect() {
        return super.getIsCorrect();
    }

}
