package com.example.techer.tech_her;

public class Question24 extends Question{
    public Question24 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =   "Fill in the blank in the following code fragment so that each element of the array is assigned twice the value of its index.\n" +
                "\n" +
                "  int[] array = new int[10];\n" +
                "\n" +
                "  // scan the array\n" +
                "  for ( int index=0; index < array.length; index++ )\n" +
                "  { \n" +
                "     _______________________ \n" +
                "  }";

        trueAnswer = "D)array[ index ] = 2*index;";
    }

                /*
                A) index = 2*index;
                B) array[ 2*index ] = 2*index;
                C) array[ index ] = 2*array[ index ];
                    Explanation :  ...
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
