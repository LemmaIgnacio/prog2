package tp7.ej2;

public class CondicionAnd extends Condicion{
    private Condicion c1,c2;

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(Condicion c2) {
        this.c2 = c2;
    }

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    public boolean cumple(Documento d){
        return c1.cumple(d) && c2.cumple(d);
    }
}
