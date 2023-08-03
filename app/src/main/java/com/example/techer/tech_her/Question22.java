package com.example.techer.tech_her;

public class Question22 extends Question{
    public Question22 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "What will be the output of the following Java code? \n" +
                "class array_output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            int array_variable [] = new int[10];\n" +
                "\t    for (int i = 0; i < 10; ++i) \n" +
                "            {\n" +
                "                array_variable[i] = i;\n" +
                "                System.out.print(array_variable[i] + \" \");\n" +
                "                i++;\n" +
                "            }\n" +
                "        } \n" +
                "    }";

        trueAnswer = "A) 0 2 4 6 8";
    }

                /*
                D) 0
                B) 1 3 5 7 9
                C) 0 1 2 3 4 5 6 7 8 9
                    Explanation :  When an array is declared using new operator then all of its elements are initialized to 0 automatically.
                                    for loop body is executed 5 times as whenever controls comes in the loop i value is incremented twice,
                                    first by i++ in body of loop then by ++i in increment condition of for loop.
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
