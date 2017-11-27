package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
public class Profesor extends JFrame implements ActionListener 
{
    JTextField Boleta;
    JLabel Bolet;
    JButton BBuscar,BSalir;
    public Profesor()
    {
        setLayout(null);
        setBounds(300,150,700,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Bolet=new JLabel();
        Bolet.setBounds(130,60,80,30);
        Bolet.setText("Boleta: ");
        add(Bolet);
        
        Boleta=new JTextField();
        Boleta.setBounds(230,60,120,30);
        add(Boleta);
        
        BBuscar=new JButton("Buscar");
        BBuscar.setBounds(170,140,100,60);
        add(BBuscar);
        BBuscar.addActionListener(this);
        
        BSalir=new JButton("Salir");
        BSalir.setBounds(170,220,100,60);
        add(BSalir);
        BSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Salir"))
            dispose();
        else
            if(e.getActionCommand().equals("Buscar"))
                JOptionPane.showMessageDialog(null, "BOLETA");
    }
}
