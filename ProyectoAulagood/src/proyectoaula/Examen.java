

package proyectoaula;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class Examen extends JFrame implements Serializable {
    
    JButton BotonActualizar;                                                                 //Java swing           
    JLabel PreguntaInferfaz,ImagenCronometro,Preg2;                                     //Java swing   

    public ArrayList<Question> QuestionsOfTest;                                         //All that matters

    int CalificacionesBuenas, CalificacionesMalas;

    int PreguntaActual;
    
    ArrayList<String> Respuestas;

    ButtonGroup GrupoPosiblesRespuestas;
    ArrayList<JRadioButton> PosiblesRespuestas;

    public Examen() {

        QuestionsOfTest = new ArrayList<Question>();
        PosiblesRespuestas = new ArrayList<JRadioButton>();
        Respuestas = new ArrayList<String>();
        PreguntaActual = 0;

        try {
            FileInputStream File = new FileInputStream("E0.txt");
            ObjectInputStream ObjectInFile = new ObjectInputStream(File);

            this.QuestionsOfTest = (ArrayList<Question>) ObjectInFile.readObject();
            ObjectInFile.close();
            File.close();
        }
        catch(Exception e){System.out.println(e); return;}
        
        
        for (Question Q: QuestionsOfTest)
            System.out.println(Q.QuestionSentence);
            
        ActualizaInterfaz();
    }


    public void ActualizaInterfaz() {

        Font FuenteEstandar = new Font("Calibri",3,15);                         //Ventana en si          
        Color Guinda = new Color(86,7,12);                                      //Ventana en si          
        setLayout(null);                                                        //Ventana en si          
        setBounds(300,150,800,500);                                             //Ventana en si          
        this.getContentPane().setBackground(Guinda);                            //Ventana en si                  
        setDefaultCloseOperation(EXIT_ON_CLOSE);                                //Ventana en si              
        setTitle("Cuestionario");                                               //Ventana en si          
        setVisible(true);                                                       //Ventana en si      
        
        PreguntaInferfaz=new JLabel();                                          //Pregunta de la Interfaz      
        PreguntaInferfaz.setBounds(50,30,800,60);                               //Pregunta de la Interfaz 
        
        
        PreguntaInferfaz.setText(QuestionsOfTest.get(PreguntaActual).QuestionSentence);       //Pregunta de la Interfaz          
        PreguntaInferfaz.setForeground(Color.white);                            //Pregunta de la Interfaz      
        PreguntaInferfaz.setFont(FuenteEstandar);                               //Pregunta de la Interfaz  
        add(PreguntaInferfaz);                                                      

        GrupoPosiblesRespuestas = new ButtonGroup();
        
        for (int i = 0; i < 4; i++) {
            JRadioButton NuevoBoton = new JRadioButton();
            NuevoBoton.setBounds(50,(120)+(20*i),300,30); 
            NuevoBoton.setText(QuestionsOfTest.get(PreguntaActual).AnswerOptions.get(i));
            NuevoBoton.setFont(FuenteEstandar);
            GrupoPosiblesRespuestas.add(NuevoBoton);
            PosiblesRespuestas.add(NuevoBoton);

            add(NuevoBoton);
        }

        BotonActualizar = new JButton("Actualizar");
        BotonActualizar.setBounds(50, 220, 100, 50);
        BotonActualizar.setFont(FuenteEstandar);
        add(BotonActualizar);

        BotonActualizar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){

                int OpcionCorrecta = QuestionsOfTest.get(PreguntaActual).CorrectOption;

                String RespuestaDelAlumno = "No puse nada";
                String PreguntaActualString = QuestionsOfTest.get(PreguntaActual).QuestionSentence;
                for (JRadioButton Boton: PosiblesRespuestas ) {
                    if (Boton.isSelected()) RespuestaDelAlumno = Boton.getText();
                } 
                if (RespuestaDelAlumno == QuestionsOfTest.get(PreguntaActual).AnswerOptions.get(OpcionCorrecta)) {
                    CalificacionesBuenas++;
                    System.out.println("Una mas");
                    Respuestas.add(PreguntaActualString + " Respuesta Correcta: " + RespuestaDelAlumno);
                }
                else
                    Respuestas.add(PreguntaActualString + " Respuesta Incorrecta: " + RespuestaDelAlumno);


                //Para las nuevas preguntas
                if (PreguntaActual < (QuestionsOfTest.size()-1))
                    PreguntaActual++;
                else {
                    for (String Respuesta: Respuestas) System.out.println(Respuesta);
                    dispose();
                };

                PreguntaInferfaz.setText(QuestionsOfTest.get(PreguntaActual).QuestionSentence);       //Pregunta de la Interfaz          
                
                for (int i = 0; i < 4; i++ )
                    PosiblesRespuestas.get(i).setText(QuestionsOfTest.get(PreguntaActual).AnswerOptions.get(i));
    
                GrupoPosiblesRespuestas.clearSelection();

            }
        });

        ImagenCronometro = new JLabel();
        ImagenCronometro.setBounds(500, 50, 600, 300);
        ImagenCronometro.setIcon(new ImageIcon("imagenes/cronometrito.gif"));
        add(ImagenCronometro); 
    }

    public void AddQuestion(Question Q) {QuestionsOfTest.add(Q);}                        //Add questions to RAM  

    void WriteToFile() {                                                                //Update data
        try {
            FileOutputStream File = new FileOutputStream("E0.txt");
            ObjectOutputStream ObjectInFile = new ObjectOutputStream(File);
            
            ObjectInFile.writeObject(this.QuestionsOfTest);
            
            ObjectInFile.flush();
            ObjectInFile.close();
        }
        catch(Exception e){System.out.println(e); return;}
        
    }



}
