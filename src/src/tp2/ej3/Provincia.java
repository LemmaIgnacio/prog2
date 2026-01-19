package tp2.ej3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }

    public int getTamanio(){
        int total = 0;
        for (Ciudad c : ciudades) {
            total += c.getTamanio();
        }
        return total;
    }

    public boolean provEnDeficit(){
        int contador = 0;
        for (Ciudad c : ciudades) {
            if(c.tieneDeficit()){
                contador++;
            }
        }
        if (contador >= getTamanio() / 2) {
            return true;
        }
        return false;
    }

    public String mostrarCiudades() {
        String resultado = "";
        for (Ciudad c : ciudades) {
            resultado += c.getNombre() + ", ";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Provincia [nombre=" + nombre + ", ciudades=" + mostrarCiudades() + ", provDeficit()=" + provEnDeficit() + "]";
    }

    
}
