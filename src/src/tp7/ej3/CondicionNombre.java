package tp7.ej3;

public class CondicionNombre extends Condicion{
    private String nombre;

    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean cumple(Planta p){
        return p.getNombreCientifico().equals(nombre);
    }
}
