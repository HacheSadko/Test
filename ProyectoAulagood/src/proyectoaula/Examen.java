package proyectoaula;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Examen extends JFrame implements ItemListener, ActionListener
{
    JButton boton;
    JLabel Preg1,imaginaldappl,Preg2;
    JRadioButton Res1;
    JRadioButton Res2;
    JRadioButton Res3;
    JRadioButton Res4;
    int a=86, b = 7, c = 12,buenas=0,malas=0;
    Icon icono = new ImageIcon("imagenes/cronometrito.gif"); 
    public Examen()
       {
        Font fuente = new Font("Calibri",3,15);
        Color guinda = new Color(a,b,c);        
        setLayout(null);
        setBounds(300,150,800,500);
        this.getContentPane().setBackground(guinda);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cuestionario");
        setVisible(true);
        
        Preg1=new JLabel();     
        Preg1.setBounds(50,30,800,60);
        Preg1.setText("1.-Es una cantidad escalar");
        add(Preg1);
        Preg1.setForeground(Color.white);
        Preg1.setFont(fuente);
        
        Preg2=new JLabel();     
        Preg2.setBounds(50,50,800,60);
        add(Preg2);
        Preg2.setForeground(Color.white);
        Preg2.setFont(fuente);
        
        Res1=new JRadioButton();
        Res1.setBounds(50,120,300,30); 
        Res1.setText("1");
        Res1.setFont(fuente);
        add(Res1);
        
        Res2=new JRadioButton();
        Res2.setBounds(50,140,300,30);
        Res1.setText("2");
        Res2.setFont(fuente);
        add(Res2);
        
        Res3=new JRadioButton();
        Res3.setBounds(50,160,300,30);
        Res1.setText("3");
        Res3.setFont(fuente);
        add(Res3);
        
        Res4=new JRadioButton();
        Res4.setBounds(50,180,300,30);  
        Res1.setText("4");
        Res4.setFont(fuente);
        add(Res4);
        
        boton = new JButton("Salir");
        boton.setBounds(50, 200, 100, 50);
        boton.addActionListener(this);
        add(boton);
        boton.setFont(fuente);
        
        imaginaldappl = new JLabel();
        imaginaldappl.setBounds(500, 50, 600, 300);
        imaginaldappl.setIcon(icono);
        add(imaginaldappl); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getStateChange()==ItemEvent.SELECTED)
        {
            
           if(e.getItem()=="Masa"||e.getItem()=="Todas las anteriores"
               ||e.getItem()=="750 USD"||e.getItem()=="En New York")
            {
                //JOptionPane.showMessageDialog(null,"Correcto");            
                ++buenas;
            }
            else
            {  
                 //JOptionPane.showMessageDialog(null,"Incorrecto");
                ++malas;   
            }                   
            dispose();
            JOptionPane.showMessageDialog(null, "Examen finalizado");
            Menu resgresa = new Menu();
           }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
            if(event.getActionCommand()=="Salir")
        {
            dispose();
            JOptionPane.showMessageDialog(null, "Examen finalizado");
            Menu resgresa = new Menu();
        }
    
    }
}
