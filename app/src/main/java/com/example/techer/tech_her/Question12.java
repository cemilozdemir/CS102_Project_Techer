package com.example.techer.tech_her;

public class Question12 extends Question{
    public Question12 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "What is is the output of the Java program? \n" +
                        "int marks=85;\n" +
                        "if(marks >= 80)\n" +
                        "System.out.println(\"DISTINCTION\")\n" +
                        "else if(marks >=35)\n" +
                        "System.out.println(\"PASS\")";
                /*
                     PASS
                     Compiler error
                     None - are the false answers - explanation - It is okay to skip the ELSE statement.
                 */
        trueAnswer = "DISTINCTION";
    }
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
