package tp9.ej2;

public class CondicionAnio extends Condicion{
    private int anio;
    
    public CondicionAnio(int anio) {
        this.anio = anio;
    }

    @Override 
    public boolean cumple (Elemento e){
        return e.getAnio() == anio;
    }

    public int getAnio() {
        return anio;
    }
}
