package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
public class Comprobar extends JFrame implements ActionListener 
{
    JTextField Contraseña;
    JLabel InfContra;
    JButton Iniciar;
    public Comprobar()
    {
        setLayout(null);
        setBounds(300,150,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Contraseña=new JTextField();
        Contraseña.setBounds(300,50,120,30);
        add(Contraseña);
        
        InfContra=new JLabel();
        InfContra.setBounds(200,50,100,30);
        InfContra.setText("Contraseña:");
        add(InfContra);
        
        Iniciar=new JButton("Iniciar");
        Iniciar.setBounds(150,150,100,30);
        add(Iniciar);
        Iniciar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Datos nuevo=new Datos();
        nuevo.setPruebContra(Contraseña.getText());
        if(e.getActionCommand().equals("Iniciar"))
        {
            if(nuevo.getContraseña()==nuevo.getPruebContra())
            {
                dispose();
                Profesor Inicio=new Profesor();
            }
        }
    }
}
