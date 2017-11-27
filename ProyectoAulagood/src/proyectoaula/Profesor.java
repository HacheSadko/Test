package proyectoaula;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Profesor extends JFrame implements ActionListener 
{
    JTextField Boleta;
    JLabel Bolet,imagenacion;
    JButton BBuscar,BSalir;
    array array;
    int a=86, b = 7, c = 12;
    Icon imagen = new ImageIcon("imagenes/lupita.jpg");
    public Profesor()
    {
        Font fuente = new Font("Calibri",3,15);
        Color guinda = new Color(a,b,c);
        array = new array();
        setLayout(null);
        setBounds(300,150,500,400);
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Profesor");
        setVisible(true);
        
        Bolet=new JLabel();
        Bolet.setBounds(130,60,80,30);
        Bolet.setText("Boleta: ");
        add(Bolet);
        Bolet.setFont(fuente);
        Bolet.setForeground(Color.RED);
        
        Boleta=new JTextField();
        Boleta.setBounds(230,60,120,30);
        add(Boleta);
        
        BBuscar=new JButton("Buscar");
        BBuscar.setBounds(170,140,100,60);
        add(BBuscar);
        BBuscar.setBackground(Color.green);
        BBuscar.addActionListener(this);
        BBuscar.setFont(fuente);
        BBuscar.setForeground(Color.white);
        
        BSalir=new JButton("Salir");
        BSalir.setBounds(170,220,100,60);
        add(BSalir);
        BSalir.setBackground(Color.red);
        BSalir.addActionListener(this);
        BSalir.setFont(fuente);
        BSalir.setForeground(Color.white);
        
        imagenacion = new JLabel();
        imagenacion.setBounds(100, 0,400,350);
        imagenacion.setIcon(imagen);
        add(imagenacion);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Salir"))
        {
            dispose();
            Menu regresa = new Menu();
        }
        else
            if(e.getActionCommand().equals("Buscar"))
            {
                Datos ayuda = new Datos();
                ayuda = array.buscar(Integer.parseInt(Boleta.getText()));
                    Boleta.setText(ayuda.getExamenes());
            }
    }
}
