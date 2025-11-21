package tp8.ej1;

public abstract class Elemento {
    protected String nombre;
    protected String fechaCreacion;

    public Elemento(String nombre, String fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getFechaCreacion(){
        return this.fechaCreacion;
    }

    public abstract int getTamanio();
    public abstract int getCantElementos();
}
