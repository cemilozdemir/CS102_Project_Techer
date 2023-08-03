package com.example.techer.tech_her;

public class Question7 extends Question {

    public Question7 (String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                      String falseAnswer2, String falseAnswer3) {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "5. Which of these statements is correct?\n";
             /* true and false are numeric values 1 and 0
                true and false are numeric values 0 and 1
                true is any non zero value and false is 0
                 */
        trueAnswer = "true and false are non numeric values"; // ( True and false are keywords, they are non numeric values which do not relate to zero or non zero numbers. true and false are boolean values.)

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
