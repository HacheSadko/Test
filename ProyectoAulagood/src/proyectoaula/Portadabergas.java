package proyectoaula;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Portadabergas extends JFrame implements ActionListener{
     JLabel Info,Info2,Info3,Info4,Info5,Info6,Info7,Info8,etiqueta1,etiqueta2;
     JButton Entrar;
     ImageIcon img1 = new ImageIcon(this.getClass().getResource("../imagenes/ipn.jpg"));
     ImageIcon icono1;
     ImageIcon img2 = new ImageIcon(this.getClass().getResource("../imagenes/escudoCECyT9.png"));
     ImageIcon icono2;
    
         int red = 86;
         int green = 7;
         int blue = 12;

    public Portadabergas() {
        this.icono2 = new ImageIcon(img2.getImage().getScaledInstance(75,75, Image.SCALE_DEFAULT));
        this.icono1 = new ImageIcon(img1.getImage().getScaledInstance(60,75, Image.SCALE_DEFAULT));
    }
         
     public void entrar(){
         Color guinda = new Color(red,green,blue);
        setLayout(null);
        setBounds(200,100,500, 500);
        this.getContentPane().setBackground(guinda);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        etiqueta1 = new JLabel();
        etiqueta1.setBounds(10,20,60,75);
        etiqueta1.setIcon(icono1);
        add(etiqueta1);
        
        etiqueta2 = new JLabel();
        etiqueta2.setBounds(400,20,75,75);
        etiqueta2.setIcon(icono2);
        add(etiqueta2);
        
        
        Info=new JLabel();
        Info.setBounds(75,150,500,50);
        Info.setForeground(Color.WHITE);
        Font auxFont=Info.getFont();
        Info.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
        Info.setText("Simulador de evaluación de Fisica I");
        add(Info);
        
        Entrar=new JButton("Entrar");
        Entrar.setBounds(200,200,100,30);
        add(Entrar);
        Entrar.setBackground(Color.WHITE);
        Entrar.addActionListener(this);
        
        Info8=new JLabel();
        Info8.setBounds(15,330,200,50);
        Info8.setForeground(Color.WHITE);
        Info8.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info8.setText("Grupo: 3IM7");
        add(Info8);
        
        Info2=new JLabel();
        Info2.setBounds(15,350,200,50);
        Info2.setForeground(Color.WHITE);
        Info2.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info2.setText("Integrantes:");
        add(Info2);
        
        Info3=new JLabel();
        Info3.setBounds(15,360,200,50);
        Info3.setForeground(Color.WHITE);
        Info3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info3.setText("Hernandez Mayo Brenda Montserrat");
        add(Info3);
        
        Info4=new JLabel();
        Info4.setBounds(15,370,200,50);
        Info4.setForeground(Color.WHITE);
        Info4.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info4.setText("Rosas Hernandez Pablo Fernando");
        add(Info4);
        
        Info5=new JLabel();
        Info5.setBounds(15,380,200,50);
        Info5.setForeground(Color.WHITE);
        Info5.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info5.setText("Medina Sosa Rafael Hayyim");
        add(Info5);
        
        Info6=new JLabel();
        Info6.setBounds(15,390,200,50);
        Info6.setForeground(Color.WHITE);
        Info6.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info6.setText("Velasco Chavez Martín Ernesto");
        add(Info6);
        
        Info7=new JLabel();
        Info7.setBounds(15,400,200,50);
        Info7.setForeground(Color.WHITE);
        Info7.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
        Info7.setText("Ramírez Juarez Arturo Yamil");
        add(Info7); 
     setVisible(true);
       
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Entrar"))
        {
            dispose();
            Menu prof=new Menu();
        }
       
    }
    
}