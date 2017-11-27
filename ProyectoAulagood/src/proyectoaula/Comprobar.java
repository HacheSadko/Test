package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Comprobar extends JFrame implements ActionListener 
{
    JTextField Contraseña;
    JLabel InfContra,dondevalaimagen;
    JButton Iniciar;
    int a=86, b = 7, c = 12;
    
    Icon iconitos = new ImageIcon("imagenes/candadito.jpg");
    public Comprobar()
    {
        
        Font fuente = new Font("Calibri",3,15);
        Color guinda = new Color(a,b,c); 
        setLayout(null);
        setBounds(300,150,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ingrese su contraseña");
        setVisible(true);
        
        Contraseña=new JPasswordField();
        Contraseña.setBounds(350,50,120,30);
        add(Contraseña);
        
        InfContra=new JLabel();
        InfContra.setBounds(250,50,100,30);
        InfContra.setText("Contraseña:");
        add(InfContra);
        InfContra.setFont(fuente);
        InfContra.setForeground(Color.RED);     
        
        Iniciar=new JButton("Iniciar");
        Iniciar.setBounds(150,200,100,30);
        add(Iniciar);
        Iniciar.addActionListener(this);
        Iniciar.setFont(fuente);
        Iniciar.setForeground(guinda);
        
        dondevalaimagen = new JLabel();
        dondevalaimagen.setBounds(0,0,450,150);
        dondevalaimagen.setIcon(iconitos);
        add(dondevalaimagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Iniciar"))
        {
            if(Contraseña.getText().equals("profesor"))
            {
                dispose();
                Profesor Inicio = new Profesor();
            }
            else
                JOptionPane.showMessageDialog(null,"contraseña incorrecta");
        }
    }
}
