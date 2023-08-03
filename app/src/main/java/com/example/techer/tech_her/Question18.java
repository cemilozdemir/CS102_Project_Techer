package com.example.techer.tech_her;

public class Question18 extends Question{
    public Question18 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "Which statement should come to the blank that the following fragment prints out the even integers 0 2 4 6 8 10?\n \n" +
                "for ( int j = 0; j <= 10; _______   )\n" +
                "  System.out.print( j + \" \" );\n" +
                "System.out.println( );";
        trueAnswer = "j = j + 2";
    }

                /*
                A) j+2
                B) j = j + 2
                C) j++++
                D) ++j++
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
