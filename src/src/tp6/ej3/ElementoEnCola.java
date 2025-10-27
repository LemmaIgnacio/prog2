package tp6.ej3;


public abstract class ElementoEnCola {
    private String nombre;

    public ElementoEnCola(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getPrioridad();
}
