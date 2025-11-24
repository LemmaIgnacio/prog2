package tp9.ej2;

public class CondicionDuracion extends Condicion {
    private int duracion;
    
    public CondicionDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override 
    public boolean cumple (Elemento e){
        return e.getDuracion() > duracion;
    }

    public int getDuracion() {
        return duracion;
    }

}
