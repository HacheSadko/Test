/*=======================================================================
=================    THIS IS THE MAIN MAIN   ============================
=========================================================================
    USE: $ javac TestApp.java && reset && java TestApp
*/

import javax.swing.*;                                                                   //I will need this
import java.awt.*;                                                                      //I will need this
import java.util.*;                                                                     //I will need this
import java.util.Scanner;                                                               //I will need this
import java.io.*;

public class Test implements Serializable {

    private ArrayList<Question> QuestionOfTest;                                         //All that matters

    public Test (String FileName) {                                                     //Constructor
        QuestionOfTest = new ArrayList<Question>();

        if (FileName.equals(null)) return;
        if (FileName == "") return;

        try {
            FileInputStream File = new FileInputStream(FileName);
            ObjectInputStream ObjectInFile = new ObjectInputStream(File);

            this.QuestionOfTest = (ArrayList<Question>) ObjectInFile.readObject();
            ObjectInFile.close();
            File.close();
        }
        catch(Exception e){System.out.println(e); return;}
    }

    void WriteToFile(String FileName) {                                                 //Update data
        try {
            FileOutputStream File = new FileOutputStream(FileName);
            ObjectOutputStream ObjectInFile = new ObjectOutputStream(File);
            
            ObjectInFile.writeObject(this.QuestionOfTest);
            
            ObjectInFile.flush();
            ObjectInFile.close();
        }
        catch(Exception e){System.out.println(e); return;}
        
    }

    public void AddQuestion(Question Q) {QuestionOfTest.add(Q);}                        //Add questions to RAM  


    public static void main (String [] args) {                                            //The fucking main    
        

        Test NewTest = new Test("");

        Question Q1 = new Question();
        Q1.QuestionSentence = "2+2?";
        Q1.AnswerOptions = new ArrayList<String>(Arrays.asList("4", "3", "2", "1"));
        Q1.CorrectOption = 0;


        NewTest.AddQuestion(Q1);

        NewTest.WriteToFile("E0.txt");


        Test NewTest2 = new Test("E0.txt");

        for (Question Q: NewTest2.QuestionOfTest){
            System.out.println(Q.QuestionSentence);

            for (String S: Q.AnswerOptions) System.out.print(S + " ");
                
            System.out.println(Q.CorrectOption);
        }


        System.out.println("hola");

      }
}


