package tp5.ej1;

import java.util.ArrayList;

public class Jardin {
    private ArrayList<Planta> plantas;

    public Jardin(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public void mostrarPlantas(){
        for (Planta p : plantas) {
            System.err.println(p);
        }
    }
}
