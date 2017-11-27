package proyectoaula;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class despedida extends JFrame implements ActionListener{
    
   private JLabel adespedida, imagen, gracias,tenga, copyright1,copyright2;
   private Timer tiempo;
   private int contador;
   Font fuente = new Font("Times New Roman",3,20); 
   Font fuentes = new Font("Calibri",3,12);
   Font grueso = new Font("Times New Roman", 3, 28);
   int a = 86, b = 7, c= 12;
   Icon empresa = new ImageIcon("imagenes/novacoder.jpg");
   public despedida()
           
   {
        Color guinda = new Color(a,b,c);
        setLayout(null);
        setBounds(300,20,700,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(guinda);
        setTitle("Gracias por su preferencia");
        setVisible(true);
        
        adespedida=new JLabel();
        adespedida.setBounds(200,0,400,40);
        adespedida.setText("Hasta luego ");
        add(adespedida);
        adespedida.setFont(grueso);
        adespedida.setForeground(Color.white);
        
        gracias = new JLabel();
        gracias.setBounds(100, 70, 600,40);
        gracias.setText("Gracias por usar nuestro programa ");
        add(gracias);
        gracias.setFont(fuente);
        gracias.setForeground(Color.white);
        
        imagen=new JLabel();
        imagen.setBounds(100,150,550,320);//x,y,ancho,largo
        imagen.setIcon(empresa); 
        add(imagen);
        
        copyright1 = new JLabel();
        copyright1.setBounds(100, 500,300,20);
        copyright1.setText("Designed by NovaCoder © ");
        add(copyright1);
        copyright1.setFont(fuentes);
        copyright1.setForeground(Color.white);
        
        tiempo = new Timer(2000, this);
        tiempo.start();
        
        
        copyright2 = new JLabel();
        copyright2 = new JLabel();
        copyright2.setBounds(100, 550,600,20);
        copyright2.setText("Proyecto hecho sin fines de lucro, queda prohibido su uso con fines distintos a los establecidos en el programa");
        add(copyright2);
        copyright2.setFont(fuentes);
        copyright2.setForeground(Color.white);
   
   }
   
   
         
    @Override
    public void actionPerformed(ActionEvent e) {
        ++contador;
        if(contador == 1)
        {
            dispose();
        }
    }
}
