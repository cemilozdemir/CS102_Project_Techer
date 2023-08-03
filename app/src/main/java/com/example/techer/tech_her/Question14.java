package com.example.techer.tech_her;

public class Question14 extends Question{
    public Question14 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "Which of this statement is incorrect? \n" +
                        "A) switch statement is more efficient than a set of nested ifs \n " +
                        "B) two case constants in the same switch can have identical values\n" +
                        "C) switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression \n" +
                        "D) it is possible to create a nested switch statements \n";
        trueAnswer = "B";
    }

                /*
                    Explanation : No two case constants in the same switch can have identical values.
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
