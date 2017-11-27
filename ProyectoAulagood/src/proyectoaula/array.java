package proyectoaula;

import java.util.ArrayList;

public class array {
     private ArrayList <Datos> alumnos = new ArrayList();
     
     public void altas(Datos contra)
     {
         alumnos.add(contra);
     }
     public Datos buscar(int clav)
    {
        int cuantos = 0;
        Datos aux = new Datos();
        cuantos = alumnos.size();
        for(int i = 0; i < cuantos; ++i)
            if (clav == alumnos.get(i).getBoleta())
            {
                aux = alumnos.get(i);
                break;
            }
         return null;
    }
     public Datos buscar2(int contra)
    {
        int cuantos = 0;
        Datos aux = new Datos();
        cuantos = alumnos.size();
        for(int i = 0; i < cuantos; ++i)
            if (alumnos.get(i).getPruebContra().equals(contra))
            {
                aux = alumnos.get(i);
                break;
            }
         return null;
    }
}
