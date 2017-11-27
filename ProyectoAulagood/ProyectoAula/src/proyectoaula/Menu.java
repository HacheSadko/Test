package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener
{
    JLabel Info;
    JButton Prof, Alum;
    public Menu()
    {
        setLayout(null);
        setBounds(300,150,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Prof=new JButton("Profesor");
        Prof.setBounds(100,150,100,30);
        add(Prof);
        Prof.addActionListener(this);
        
        Alum=new JButton("Alumno");
        Alum.setBounds(300,150,100,30);
        add(Alum);
        Alum.addActionListener(this);
        
        Info=new JLabel();
        Info.setBounds(150,50,200,30);
        Info.setText("Escoge como quieres iniciar:");
        add(Info);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Profesor"))
        {
            dispose();
            Comprobar prof=new Comprobar();
        }
        else
            if(e.getActionCommand().equals("Alumno"))
            {
                dispose();
                Alumno alum=new Alumno();
            }
    }
    
}