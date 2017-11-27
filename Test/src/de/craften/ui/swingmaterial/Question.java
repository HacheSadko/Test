package de.craften.ui.swingmaterial;

/*=======================================================================
=================    THIS IS THE MAIN MAIN   ============================
=========================================================================
    USE: $ javac TestApp.java && reset && java TestApp
*/

import javax.swing.*;                                                                   //I will need this
import java.awt.*;                                                                      //I will need this
import Material.*;                                                                      //Material Theme
import java.util.ArrayList;                                                             //Material Theme
import java.io.*;
import java.util.Scanner;                                                               //Material Theme

public class Question implements Serializable {

    private String QuestionSentence;                                                    //Question per se
    private ArrayList<String> AnswerOptions;                                            //All options
    private int CorrectOption;                                                          //Correct one

    boolean setAnswerOptions(ArrayList<String> Options) {                               //Set Answer options
        if (Options.size() != 3) return false;                                          //Only allow 3 options
        for (String Option : Options) if (Option.equals(null)) return false;            //Please not null :D
        AnswerOptions = Options;                                                        //All clear!
        return true;                                                                    //All happy
    }

    boolean setQuestionSentence(String Sentence) {                                      //Set Answer options
        if (Sentence.equals(null)) return false;                                        //If null kill him
        QuestionSentence = Sentence;                                                    //Else all ok!
        return true;                                                                    //return true
    }

    void setCorrectOption (int Correct) {CorrectOption = Correct;}                      //Simple setter

    int getCorrectOption(){return this.CorrectOption;}                                 //Simple getters
    ArrayList<String> getAnswerOptions(){return this.AnswerOptions;}                   //Simple getters
    String getQuestionSentence(){return this.QuestionSentence;}                        //Simple getters

}

