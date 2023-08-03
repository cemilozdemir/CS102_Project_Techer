package com.example.techer.tech_her;

public class Question1 extends Question{

    private String questionLine;

    private boolean answer;

    private String trueAnswer;

    private String falseAnswer1;

    private String falseAnswer2;

    private String falseAnswer3;


    public Question1 (String questionLine, boolean isCorrect, String trueAnswer, String falseAnswer1 ,
                      String falseAnswer2,String falseAnswer3)  {

        super(questionLine,isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine = "Which of the following rule is wrong when naming java variables?";
        trueAnswer = "Starting naming with a capital letter";
        falseAnswer1 = "Having underscore in the word";
        falseAnswer2 = "Having digits in the word";
        falseAnswer3 = "Writing the word without spaces";
        isCorrect = false;
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