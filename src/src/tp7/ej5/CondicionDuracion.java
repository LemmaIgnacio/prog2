package tp7.ej5;

public class CondicionDuracion extends Condicion {
    private int d;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public CondicionDuracion(int d) {
        this.d = d;
    }
    
    @Override
    public boolean cumple(Pelicula p){
        return p.getDuracion() > this.d;
    }
}
