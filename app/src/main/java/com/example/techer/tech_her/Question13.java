package com.example.techer.tech_her;

public class Question13 extends Question{
    public Question13 ( String questionLine, boolean isCorrect, String trueAnswer,String falseAnswer1,
                        String falseAnswer2, String falseAnswer3) {
        super(questionLine, isCorrect, trueAnswer, falseAnswer1, falseAnswer2, falseAnswer3);
        isCorrect = false;
        questionLine =  "class selection_statements \n" +
        "{ \n" +
            "\tpublic static void main(String args[]) \n"  +
            "{ \n" +
                "\tint var1 = 5; \n" +
                "\tint var2 = 6; \n" +
                "\tif ((var2 = 1) == var1) \n" +
                    "\t\t System.out.print(var2); \n" +
                "\telse \n" +
                    " \t\tSystem.out.print(++var2);\n";
        trueAnswer = "2";
            }

                /*
                     1
                     3
                     4 - are the false answers - explanation - var2 is initialised to 1. The conditional statement returns false and the else part gets executed.
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
