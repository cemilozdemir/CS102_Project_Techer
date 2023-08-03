package com.example.techer.tech_her;

public class Question23 extends Question{
    public Question23 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =   "class evaluate \n" +
                         "    {\n" +
                         "        public static void main(String args[]) \n" +
                         "            {\n" +
                         "\t        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};\n" +
                         "\t        int n = 6;\n" +
                         "                n = arr[arr[n] / 2];\n" +
                         "\t        System.out.println(arr[n] / 2);\n" +
                         "            } \n" +
                         "    }";

        trueAnswer = "1";
    }

                /*
                D) 3
                B) 0
                C) 6 are the false answers
                    Explanation :  Array arr contains 10 elements. n contains 6 thus in next line n is given
                     value 3 printing arr[3]/2 i:e 3/2 = 1 because of int Value, by int values there is no rest.
                      If this values would be float the result would be 1.5.
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
