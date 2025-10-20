package tp3.ej1;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Encuesta> encuestas;
    
    public Empresa(String nombre, String direccion, String telefono, ArrayList<Encuesta> encuestas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.encuestas = encuestas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(ArrayList<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
    
    
}