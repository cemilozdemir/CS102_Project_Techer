package com.example.techer.tech_her;

public class Question2 extends Question {

    private String questionLine;

    private boolean isCorrect;

    private String trueAnswer;
    private String falseAnswer1;
    private String falseAnswer2;
    private String falseAnswer3;

    public Question2 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3)  {

        super(questionLine,isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine = " long data type corresponds to 16 bit";
        isCorrect = false;
        trueAnswer = "F";
        falseAnswer1 = "T";

    }
        public String getQuestionLine() {
            return super.getQuestionLine();
    }

        public boolean getIsCorrect(){
            return super.getIsCorrect();
    }
        public String getTrueAnswer(){
            return super.getTrueAnswer();
    }

        // interface question method comes here
        // if isCorrect = true

}
