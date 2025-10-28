package tp7.ej5;

public class CondicionAND extends Condicion {
    private Condicion c1;
    private CondicionNot c2;

    public CondicionAND(Condicion c1, CondicionNot c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(CondicionNot c2) {
        this.c2 = c2;
    }
    
    @Override
    public boolean cumple(Pelicula p){
        return c1.cumple(p) && c2.cumple(p);
    }
}
