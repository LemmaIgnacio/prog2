package tp7.ej3;

import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }
    
    public void setPlanta (ArrayList<Planta> plantas){
        this.plantas = new ArrayList<>(plantas);
    }

    public ArrayList<Planta> getPlantas(){
        return new ArrayList<>(plantas);
    }

    public ArrayList<Planta> buscar(Condicion c){
        ArrayList<Planta> r = new ArrayList<>();
        for(Planta p : plantas){
            if (c.cumple(p)) {
                r.add(p);
            }
        }
        return r;
    }

    public void mostrarPlantas(Condicion c) {
        for (Planta pl : buscar(c)) {
            System.out.println("- " + pl.getNombreCientifico());
        }
    }
}
