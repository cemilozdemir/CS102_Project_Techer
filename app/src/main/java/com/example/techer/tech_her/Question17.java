package com.example.techer.tech_her;

public class Question17 extends Question{
    public Question17 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "What must the test be so that the following fragment prints out the integers 5 through and including 15?\n \n" +
                "for ( int j = 5;  ________ ; j++ )\n" +
                "{\n" +
                "  System.out.print( j + \" \" );\n" +
                "}\n" +
                "System.out.println( Please enter the answer without spaces.);";
        trueAnswer = "j<16";
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
