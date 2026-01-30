package tp2.ej4;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Turno> turnos;
    
    private static final int MIN_TURNOS_SOCIO = 4;
    private static final double DESCUENTO_SOCIO = 0.10;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public boolean esSocio() {
        return contarTurnosRecientes() >= MIN_TURNOS_SOCIO;
    }

    private int contarTurnosRecientes() {
        // solo la ia sabe como resolver esto, yo ni idea:
        // LocalDate hace2Meses = LocalDate.now().minusMonths(2);
        // int contador = 0;
        // for (Turno t : turnos) {
        //     if (t.getFecha().isAfter(hace2Meses)) {
        //         contador++;
        //     }
        // }
        // return contador;
        return turnos.size();
    }

    public double getDescuento() {
        if (esSocio()) {
            return DESCUENTO_SOCIO;
        } else {
            return 0.0;
        }
    }
}
