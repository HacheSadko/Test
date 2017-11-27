package proyectoaula;
import javax.swing.*;
import java.awt.event.*;
public class Examen extends JFrame implements ItemListener, ActionListener
{
    JButton boton;
    JLabel Preg1;
    JComboBox Res1;
    public Examen()
    {
        setLayout(null);
        setBounds(300,150,300,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Preg1=new JLabel();
        Preg1.setBounds(50,30,200,60);
        Preg1.setText("<html>1.-Cual es el comando utilizado para desplegar el contenido dentro del programa");
        add(Preg1);
        
        Res1=new JComboBox();
        Res1.setBounds(80,120,120,30);
        Res1.addItem("");
        Res1.addItem("for(int i=0;i<10;++i)");
        Res1.addItem("System.out.println()");
        add(Res1);
        Res1.setSelectedIndex(0);
        Res1.addItemListener(this);
        
        boton = new JButton("salir");
        boton.setBounds(100, 200, 100, 50);
        boton.addActionListener(this);
        add(boton);
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getStateChange()==ItemEvent.SELECTED)
        {
            if(e.getItem()=="System.out.println()")
                JOptionPane.showMessageDialog(null,"Correcto");
            else
                if(e.getItem()=="for(int i=0;i<10;++i)")
                    JOptionPane.showMessageDialog(null,"Incorrecto");
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand()=="salir")
        {
            dispose();
        }
    }
}
