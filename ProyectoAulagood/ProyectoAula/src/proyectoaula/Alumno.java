package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
public class Alumno extends JFrame implements ActionListener
{
    JLabel Nombre,Grupo,Boleta;
    JTextField BN,BG,BB;
    JButton Registro;
    public Alumno()
    {    
        setLayout(null);
        setBounds(300,150,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Nombre=new JLabel();
        Nombre.setBounds(110,50,80,30);
        Nombre.setText("Nombre");
        add(Nombre);
        
        Grupo=new JLabel();
        Grupo.setBounds(110,100,80,30);
        Grupo.setText("Grupo");
        add(Grupo);
        
        Boleta=new JLabel();
        Boleta.setBounds(110,150,80,30);
        Boleta.setText("Boleta");
        add(Boleta);
        
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
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand()=="Iniciar")
        {
            dispose();
            Examen ex=new Examen();
        }
    }
}