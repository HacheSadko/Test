package de.craften.ui.swingmaterial;

/*=======================================================================
=================    THIS IS THE MAIN MAIN   ============================
=========================================================================
    USE: $ javac TestApp.java && reset && java TestApp
*/

import javax.swing.*;                                                                   //I will need this
import java.awt.*;                                                                      //I will need this
import Material.*;                                                                      //Material Theme
import test.MaterialButton;

public class TestApp {                                                                  //The Class

  public static void main (String [] args) {                                            //The fucking main    
    MaterialLookAndFeel UI = new MaterialLookAndFeel (GUITheme.DARK_THEME);             //Use this skin
    
    JFrame Frame = new JFrame ("Test App");                                             //Create a window
    Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                                      //Maximaize it!



    JButton Button = new MaterialButton ("TEST");                                       //Create a button
    Frame.add(Button, BorderLayout.NORTH);

    Frame.setVisible (true);                                                            //3, 2, 1 Action!
  }
}