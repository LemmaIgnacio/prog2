package tp7.ej1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void addEstado(String estado) {
        estadosPatologicos.add(estado.toLowerCase());
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<>(estadosPatologicos);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
