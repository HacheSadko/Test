package proyectoaula;

import java.util.ArrayList;

public class Datos
{
    private String Contraseña;
    private String PruebContra;
    private int boleta;
    private String examenes;

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getPruebContra() {
        return PruebContra;
    }

    public void setPruebContra(String PruebContra) {
        this.PruebContra = PruebContra;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
}