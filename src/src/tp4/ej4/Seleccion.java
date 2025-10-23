package tp4.ej4;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Integrante> integrantes;

    public Seleccion(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }
    
    public void eventoSolidario(){
        for (Integrante integrantes : integrantes) {
            integrantes.mostrarEstado();
        }
    }
}
