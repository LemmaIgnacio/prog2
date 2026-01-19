package tp2.ej3;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> provincias;

    public Pais(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }
    
    public void mostrarProvEnDeficit(){
        for (Provincia p : provincias) {
            if(p.provEnDeficit()){
                System.out.println(p);
            }
        }
    }

    public void mostrarCiudadesEnDeficit() {
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.tieneDeficit()) {
                    System.out.println(c);
                }
            }
        }
    }
}
