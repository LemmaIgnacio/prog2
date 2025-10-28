package tp7.ej5;

public class CondicionFechaEstreno extends Condicion{
    private int f;

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public CondicionFechaEstreno(int f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Pelicula p){
        return p.getFechaEstreno() > this.f;
    }
}
