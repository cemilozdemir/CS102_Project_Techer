package com.example.techer.tech_her;
public class Question {
    // variables
   protected String questionLine;
    protected boolean isCorrect;
    protected String trueAnswer;
    protected String falseAnswer1;
    protected String falseAnswer2;
    protected String falseAnswer3;


    public Question (String questionLine, boolean isCorrect, String trueAnswer , String falseAnswer1, String falseAnswer2, String falseAnswer3)  {

        this.questionLine = questionLine;
        this.isCorrect = isCorrect;
        this.trueAnswer = trueAnswer;
        this.falseAnswer1 = falseAnswer1;
        this.falseAnswer2 = falseAnswer2;
        this.falseAnswer3 = falseAnswer3;

    }
    // get method for Question Line

    public String getQuestionLine() {
        return questionLine;
    }
    // set method for QuestionLine
    public void setQuestionLine (String questionLine) {
        this.questionLine = questionLine;
    }

    public String getTrueAnswer(){
        return trueAnswer;
    }

    public void setTrueAnswer( String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getFalseAnswer1(){
        return falseAnswer1;
    }

    public void setFalseAnswer1( String falseAnswer1) {
        this.falseAnswer1 = falseAnswer1;
    }

    public String getFalseAnswer2(){
        return falseAnswer2;
    }

    public void setFalseAnswer2( String falseAnswer2) {
        this.falseAnswer2 = falseAnswer2;
    }

    public String getFalseAnswer3(){
        return falseAnswer3;
    }

    public void setFalseAnswer3( String falseAnswer3) {
        this.falseAnswer3 = falseAnswer3;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }






    }

