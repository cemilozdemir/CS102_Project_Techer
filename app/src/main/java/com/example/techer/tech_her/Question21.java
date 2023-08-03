package com.example.techer.tech_her;

public class Question21 extends Question{
    public Question21 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "What will be the output of the following Java code?\n" +
                "\n" +
                "    int arr[] = new int [5];\n" +
                "    System.out.print(arr);";

        trueAnswer = "D) Class name@ hashcode in hexadecimal form";
    }

                /*
                A) 0
                B) value stored in arr[0]
                C) 00000
                    Explanation :  If we trying to print any reference variable internally, toString() will be called which is implemented to return the String in following form:
                                    classname@hashcode in hexadecimal form
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

