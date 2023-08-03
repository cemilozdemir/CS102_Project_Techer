package com.example.techer.tech_her;

public class Question6 extends Question {

    public Question6 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3)  {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        questionLine =  "What will be the output of the following program?\n" +
                        "class MyClass {\n" +
                        "\t public static void main(String[] args) {\n"+
                        "\t \t int i = 4;\n" +
                        "\t \t int j = 21;\n" +
                        "\t \t int k = ++i * 7 + 2 - j--;\n" +
                        "\t \t System.out.println(\"k = \" + k);\n" +
                        "\t \t }\n" +
                        "\t }\n" +
                        "}";
        isCorrect = false;
        trueAnswer = "16";

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
