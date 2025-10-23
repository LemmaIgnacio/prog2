package tp4.ej6;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;

    public Empresa(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    
}
