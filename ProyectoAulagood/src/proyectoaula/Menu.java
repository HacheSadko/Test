package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame implements ActionListener
{
    JLabel Info,derecha,izquierda;
    JButton Prof, Alum, salir;
    int a=86, b = 7, c = 12;
    Icon seleccion1 = new ImageIcon("imagenes/abajo.gif");

    public Menu()
    {
        
        Font fuente = new Font("Calibri",3,15);
        Color guinda = new Color(a,b,c);
        setLayout(null);
        setBounds(300,150,450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(guinda);
        setTitle("Cuestionario de Física I");
        setVisible(true);
        
        Prof=new JButton("Profesor");
        Prof.setBounds(10,150,100,30);
        add(Prof);
        Prof.setBackground(Color.WHITE);
        Prof.addActionListener(this);
        
        Alum=new JButton("Alumno");
        Alum.setBounds(320,150,100,30);
        add(Alum);
        Alum.setBackground(Color.WHITE);
        Alum.addActionListener(this);
        
        Info=new JLabel();
        Info.setBounds(140,50,200,30);
        Info.setText("Escoge como quieres iniciar:");
        add(Info);
        Info.setFont(fuente);
        Info.setForeground(Color.white);
        
        derecha = new JLabel();
        derecha.setBounds(10, 0, 200, 150);
        derecha.setIcon(seleccion1);
        add(derecha);
        
        izquierda = new JLabel();
        izquierda.setBounds(310, 0, 200, 150);
        izquierda.setIcon(seleccion1);
        add(izquierda);
        
        salir=new JButton("Salir");
        salir.setBounds(165,200,100,30);
        add(salir);
        salir.addActionListener(this);
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
        
        else
            if(e.getActionCommand().equals("Salir"))
            {
                dispose();
                despedida salir = new despedida();
            }
    }
    
}