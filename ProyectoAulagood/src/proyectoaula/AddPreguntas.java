package proyectoaula;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddPreguntas 
{
    public static void main(String[] args)
    {
    
        char opc;
    	
        Scanner sc =new Scanner(System.in);

        ArrayList<Question> NuevasPreguntas = new ArrayList<Question>();

        try {
            FileInputStream File = new FileInputStream("E0.txt");
            ObjectInputStream ObjectInFile = new ObjectInputStream(File);

            NuevasPreguntas = (ArrayList<Question>) ObjectInFile.readObject();
            ObjectInFile.close();
            File.close();
        }
        catch(Exception e){System.out.println(e); return;}
        
        for (Question Q: NuevasPreguntas)
            System.out.println(Q.QuestionSentence);

        do {
            System.out.println("Ingreso un una pregunta: ");

            Question Q1 = new Question();

            Q1.QuestionSentence = sc.nextLine();

            ArrayList<String> RespuestasIncorrectas = new ArrayList<String>();
            
            for (int i = 1; i <= 3; i++) 
            {
                System.out.println("Ingresa la "+ i + " respuesta incorrecta");
                String respuesta=sc.nextLine();
                RespuestasIncorrectas.add(respuesta);
            }

            System.out.println("Ingresa la respuesta correcta");
            String RespuestaCorrecta = sc.nextLine();

            System.out.println("¿Agregar mas elementos?(s/n)");
            opc = sc.next().charAt(0);
            sc.nextLine();
            
            RespuestasIncorrectas.add(RespuestaCorrecta);
            Collections.shuffle(RespuestasIncorrectas);

            int i = 0;
            for (String Respuesta : RespuestasIncorrectas)
                if (Respuesta.equals(RespuestaCorrecta)) Q1.CorrectOption = i;

            Q1.AnswerOptions = RespuestasIncorrectas;
            
            NuevasPreguntas.add(Q1);

            try {
                FileOutputStream File = new FileOutputStream("E0.txt");
                ObjectOutputStream ObjectInFile = new ObjectOutputStream(File);
                
                ObjectInFile.writeObject(NuevasPreguntas);
                
                ObjectInFile.flush();
                ObjectInFile.close();
            }
            catch(Exception e){System.out.println(e); return;}
        }
        while (opc=='s');

    }
}
