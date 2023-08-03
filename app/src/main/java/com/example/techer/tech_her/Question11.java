package com.example.techer.tech_her;

public class Question11 extends Question{
    public Question11 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "int a=10;\n" +
                "if(a==9)\n" +
                "  System.out.println(\"OK \");\n" +
                "  System.out.println(\"MASTER\");\t\t\t\t\t\n" +
                "else\n" +
                "  System.out.println(\"BYE\");";
                /*
                "OK MASTER"
                "BYE"
                "NONE" are the wrong answers
                 */
        trueAnswer = "Compiler Error";
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
