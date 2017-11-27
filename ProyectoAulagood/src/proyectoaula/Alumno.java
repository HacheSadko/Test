package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Alumno extends JFrame implements ActionListener
{
    JLabel Nombre,Grupo,Boleta,dondevalaimagen;
    JTextField BN,BG,BB;
    JButton Registro;
    int a = 86, b = 7, c= 12;
    Icon iconito = new ImageIcon("imagenes/registro.png");
    public Alumno()
    {    
        Font fuente = new Font("Calibri",3,15);
        Color guinda = new Color(a,b,c);
        setLayout(null);
        setBounds(300,150,500,400);
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Alumno");
        setVisible(true);
        
        Nombre=new JLabel();
        Nombre.setBounds(110,50,80,30);
        Nombre.setText("Nombre");
        add(Nombre);
        Nombre.setForeground(guinda);
        Nombre.setFont(fuente);
        
        Grupo=new JLabel();
        Grupo.setBounds(110,100,80,30);
        Grupo.setText("Grupo");
        add(Grupo);
        Grupo.setForeground(guinda);
        Grupo.setFont(fuente);
        
        Boleta=new JLabel();
        Boleta.setBounds(110,150,80,30);
        Boleta.setText("Boleta");
        add(Boleta);
        Boleta.setForeground(guinda);
        Boleta.setFont(fuente);
        
        BN=new JTextField();
        BN.setBounds(160,50,80,30);
        add(BN);
        
        BG=new JTextField();
        BG.setBounds(160,100,80,30);
        add(BG);
        
        BB=new JTextField();
        BB.setBounds(160,150,80,30);
        add(BB);
        
        Registro=new JButton("Iniciar");
        Registro.setBounds(150,280,100,30);
        add(Registro);
        Registro.addActionListener(this);
        Registro.setFont(fuente);
        
        dondevalaimagen = new JLabel();
        dondevalaimagen.setBounds(150, 0, 300, 300);
        dondevalaimagen.setIcon(iconito);
        add(dondevalaimagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getActionCommand()=="Iniciar")
        {                                         
            String texto= BB.getText();
            texto=texto.replaceAll(" ", "");
            String texto2= BN.getText();
            texto2=texto2.replaceAll(" ", "");
            String texto3= BG.getText();
            texto3=texto3.replaceAll(" ", "");
            if(texto.length()==0 || texto2.length()==0 || texto3.length()==0)
            {
            JOptionPane.showMessageDialog(null, "llena todos los campos");
            }
          else
          {
            dispose();
            Examen ex=new Examen();
          }
        }
    }
}