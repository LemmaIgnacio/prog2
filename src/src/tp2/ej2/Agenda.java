package tp2.ej2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion r) {
        if (!hayConflicto(r.getHora())) {
            reuniones.add(r);
        }
    }

    public boolean hayConflicto(int hora) {
        boolean conflicto = false;
        for (Reunion r : reuniones) {
            if (r.getHora() == hora) {
                conflicto = true;
            }
        }
        return conflicto;
    }

    public void mostrarReuniones() {
        for (Reunion r : reuniones) {
            System.out.println(r);
        }
    }
}
