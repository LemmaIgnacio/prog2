package tp2.ej3;
import java.util.ArrayList;
public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre, ArrayList<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public String provinciasConDeficit(){
        String resultado = "Provincias con deficit: \n";
        for (int i = 0; i < provincias.size(); i++) {
            if(provincias.get(i).tieneDeficit()){
                resultado += provincias.get(i).getNombre() + " " + provincias.get(i).ciudadesEnDeficit() + "\n";
            }
        }
        return resultado;
    }
    
}
