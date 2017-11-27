package proyectoaula;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class DesSer 
{
    public ArrayList<String> Quest= new ArrayList<>();
    public ArrayList<String> RespuestaC= new ArrayList<>();
    public ArrayList<String> RespuestaI= new ArrayList<>();
    private String[] OldQuest= new String[18];
    JLabel Preg1;
    JComboBox Res1;
    public void  ResC()
    {
        try
        {
            FileInputStream fis = new FileInputStream("resC.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            RespuestaC = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
          }
   }
    public void  Pegunt()
    {
        try
        {
            FileInputStream fis = new FileInputStream("preguntas.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Quest = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
          }
   } 
    public void  ResI()
    {
        try
        {
            FileInputStream fis = new FileInputStream("resI.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            RespuestaI = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
          }
   }   
   public JLabel NewQuest()
   {
       int random=(int)(Math.random()*(19-0)+0);
       String nue;
       nue=Quest.get(random);
       //for(String i:Quest)
       //{OldQuest[i]=Quest.get(i);}
       Preg1.setText(nue);
       return Preg1; 
   }
   public JComboBox NewAnswer()
   {
       Res1.removeAllItems();
       Res1.addItem("");
       Res1.addItem("qwe");
       Res1.addItem("qwd");
       Res1.addItem("dsf");
       Res1.addItem("asd");
       return Res1;
   }
}