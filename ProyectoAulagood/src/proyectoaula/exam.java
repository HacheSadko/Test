package proyectoaula;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class exam 
{
    public static void main(String[] args)
    {
        char opc;
	Scanner sc =new Scanner(System.in);
	String pregunta="",respuesta="";
	ArrayList <String> pregunt = new ArrayList();
        ArrayList <String> respuestaC = new ArrayList();
        ArrayList <String> respuestaI = new ArrayList();
        do
        {
            System.out.println("Ingreso un una pregunta: ");
            pregunta= sc.nextLine();
            pregunt.add(pregunta);
            for (int i = 0; i <= 2; i++) 
            {
             System.out.println("Ingresa la "+(++i)+" respuesta incorrecta");
             --i;
             respuesta=sc.nextLine();
             respuestaI.add(respuesta);
            }
            System.out.println("Ingresa la respuesta correcta");
            respuesta= sc.nextLine();
            respuestaC.add(respuesta);
            System.out.println("¿Agregar mas elementos?(s/n)");
            opc = sc.next().charAt(0);
            sc.nextLine();
        }while (opc=='s');
        try{
        FileOutputStream fos= new FileOutputStream("preguntas.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(pregunt);
        oos.close();
        fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        try{
        FileOutputStream fos= new FileOutputStream("resC.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(respuestaC);
        oos.close();
        fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        try{
        FileOutputStream fos= new FileOutputStream("resI.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(respuestaI);
        oos.close();
        fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
