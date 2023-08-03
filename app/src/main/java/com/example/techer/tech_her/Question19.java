package com.example.techer.tech_her;

public class Question19 extends Question {
    public Question19 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine ="What will be the output of the following Java program?\n \n" +
                      "public static void main(String args[]) \n" +
                      "\t{\n" +
                      "\tfinal int a=10,b=20;\n" +
                      "\twhile(a<b)\n" +
                      "\t{\n" +
                      "\tSystem.out.println(\"Hello\");\n" +
                      "\t}\n" +
                      "\tSystem.out.println(\"World\");\n"+
                      "\t} ";
        trueAnswer = "D) compile time error";
    }

                /*
                A) Hello
                B) run time error
                C) Hello world are the wrong answers
                    Explanation : Every final variable is compile time constant.
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
