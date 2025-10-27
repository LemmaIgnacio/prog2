package tp6.ej3;

import java.time.LocalDate;

public class Camion extends ElementoEnCola {
    private LocalDate fechaCarga;

    public Camion(String nombre, LocalDate fechaCarga) {
        super(nombre);
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

        @Override
    public int getPrioridad() {
        return (int) fechaCarga.toEpochDay();
    }
}