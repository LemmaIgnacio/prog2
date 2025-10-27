package tp7.ej1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void addEnfermedad(Enfermedad e) {
        enfermedadesFrecuentes.add(e);
    }

    public boolean esUtil(Agroquimico a) {
        if (a.desaconsejadoEn(nombre))
            return false;

        for (Enfermedad e : enfermedadesFrecuentes) {
            if (a.puedeTratar(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

