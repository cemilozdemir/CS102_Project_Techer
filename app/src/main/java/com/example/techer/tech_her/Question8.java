package com.example.techer.tech_her;

public class Question8 extends Question {

    public Question8 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                       String falseAnswer2, String falseAnswer3) {

        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine = "Which is the Logical operator in Java that works with a Single Operand?";
                        /*
                        Logical AND
                        Logical OR
                        Logical Exclusive OR
                         */
        trueAnswer = "Logical NOT";
        isCorrect = false;
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


