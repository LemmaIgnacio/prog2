package tp2.ej3;
import java.util.ArrayList;
public class Provincia {
    final static int POBLACION_MINIMA = 100000;
    private String nombre;
    private ArrayList<Ciudad> ciudades;



    public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }
    
    public Provincia() {
    }

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

    public boolean tieneDeficit(){
        int contador = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            if(ciudades.get(i).estaEnDeficit() && ciudades.get(i).getPoblacion() > POBLACION_MINIMA){
                contador++;
            }
        }
        return contador > (ciudades.size()/2);
    }

    public String ciudadesEnDeficit(){
        String resultado = "Ciudades en deficit: \n";
        for (int i = 0; i < ciudades.size(); i++) {
            if(ciudades.get(i).estaEnDeficit()){
                resultado += ciudades.get(i).getNombre() + "\n";
            }
        }
        return resultado;
    }

    


}
