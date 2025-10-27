package tp7.ej1;

import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<String> cultivosDesaconsejados;
    private ArrayList<String> estadosQueTrata;

    public Agroquimico(String nombre) {
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosQueTrata = new ArrayList<>();
    }

    public String getNombre() { 
        return nombre; 
    }

    public void addCultivoDesaconsejado(String cultivo) {
        cultivosDesaconsejados.add(cultivo.toLowerCase());
    }

    public void addEstadoQueTrata(String estado) {
        estadosQueTrata.add(estado.toLowerCase());
    }

    public boolean desaconsejadoEn(String cultivo) {
        return cultivosDesaconsejados.contains(cultivo.toLowerCase());
    }

    public boolean puedeTratar(Enfermedad e) {
        boolean puedeTratar = true;
        for (String estado : e.getEstadosPatologicos()) {
            if (!estadosQueTrata.contains(estado.toLowerCase())) {
                return false;
            }
        }
        return puedeTratar;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
