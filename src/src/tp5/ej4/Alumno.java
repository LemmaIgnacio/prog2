package tp5.ej4;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private boolean linajeFamiliar;
    private ArrayList<Alumno> familiar;
    private boolean tieneCasa;

    public Alumno(String nombre, ArrayList<String> cualidades, boolean linajeFamiliar, ArrayList<Alumno> familiar) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.linajeFamiliar = linajeFamiliar;
        this.familiar = familiar;
        this.tieneCasa = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }

    public boolean isLinajeFamiliar() {
        return linajeFamiliar;
    }

    public void setLinajeFamiliar(boolean linajeFamiliar) {
        this.linajeFamiliar = linajeFamiliar;
    }

    public ArrayList<Alumno> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList<Alumno> familiar) {
        this.familiar = familiar;
    }

    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }


    
}
