package tp7.ej2;

import java.util.ArrayList;

public class Documento {
    private String nombre;
    private ArrayList<String> autores;
    private String contenidoTexual;
    private ArrayList<String> palabraClave;
    
    public Documento(String nombre, ArrayList<String> autores, String contenidoTexual, ArrayList<String> palabraClave) {
        this.nombre = nombre;
        this.autores = autores;
        this.contenidoTexual = contenidoTexual;
        this.palabraClave = palabraClave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenidoTexual() {
        return contenidoTexual;
    }

    public void setContenidoTexual(String contenidoTexual) {
        this.contenidoTexual = contenidoTexual;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores); 
    }
    
    public void setAutores(ArrayList<String> autores) {
        this.autores = new ArrayList<>(autores);
    }

    public ArrayList<String> getPalabraClave(){
        return new ArrayList<>(palabraClave);
    }

    public void setPalabraClave(ArrayList<String> palabraClave){
        this.palabraClave = new ArrayList<>(palabraClave);
    }

    
}
