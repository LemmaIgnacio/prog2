package tp6.ej3;

public class Barco extends ElementoEnCola {
    
    private int capacidad;

    public Barco(String nombre, int capacidad) {
        super(nombre);
        this.capacidad = capacidad;
    }

    @Override
    public int getPrioridad() {
        return capacidad;
    }
}
