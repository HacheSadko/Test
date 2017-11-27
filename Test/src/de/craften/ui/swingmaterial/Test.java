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
import java.util.Scanner;                                                               //Material Theme
import java.io.*;

public class Test implements Serializable {

    private ArrayList<Question> QuestionOfTest;

    public Test (String QuestionFile) {
        try {
            FileInputStream File = new FileInputStream(QuestionFile);
            ObjectInputStream ObjectInFile = new ObjectInputStream(File);

            this.QuestionOfTest = (ArrayList<Question>) ObjectInFile.readObject();
            ObjectInFile.close();
            File.close();
        }
        catch(Exception e){System.out.println(e); return;}
    }

    public void addQuestion(Question Q) {QuestionOfTest.add(Q);}






    public static void main (String [] args) {                                            //The fucking main    
        
        MaterialWindow Frame = new MaterialWindow ();                                           //Create a window

        Test OldTest = new Test("Question.txt");

        for (Question Q : OldTest.QuestionOfTest) Text.setText(Text.getText() + Q.getQuestionSentence());


        Frame.setVisible (true);                                                          //3, 2, 1 Action!
      }
}


