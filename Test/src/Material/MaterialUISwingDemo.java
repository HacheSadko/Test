package Material;

import javax.swing.*;
import java.awt.*;

public class MaterialUISwingDemo {
  
  public static void main (String [] args) {
    MaterialLookAndFeel ui = new MaterialLookAndFeel (GUITheme.DARK_THEME);
    
    JFrame frame = new JFrame ("Cuestionario");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    JButton button = new MaterialButton ("TEST");
    JLabel Quest = new JLabel();
    Quest.setBounds(r);
    Quest.setForeground(Color.white);
    Quest.setText("1.-Hola");
    
    frame.add (button, BorderLayout.NORTH);
    frame.setVisible (true);
  }
}