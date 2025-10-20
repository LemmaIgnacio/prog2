package tp3.ej1;
import java.util.ArrayList;

public class Encuesta {
    private int id;
    private ArrayList<String> preguntas;
    private Empleado empleado;
    private ArrayList<Persona> personas;
    private boolean completado;

    public Encuesta(int id, ArrayList<String> preguntas, Empleado empleado, ArrayList<Persona> personas,
            boolean completado) {
        this.id = id;
        this.preguntas = preguntas;
        this.empleado = empleado;
        this.personas = personas;
        this.completado = completado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public boolean completar (Persona p){
        if (fueRespondidaPor(p)) {
            completado = false;
        }else{
            empleado.aumentarEncuesta();
            personas.add(p);
            completado = true;

        }
        return completado;
    }

    public boolean fueRespondidaPor(Persona p) {
        boolean respondio = false;
        for (Persona persona : personas) {
            if (persona.getDni() == p.getDni()) {
                respondio = true;
            }
        }
        return respondio;
    }
    

}