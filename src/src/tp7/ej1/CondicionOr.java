package tp7.ej1;

public class CondicionOr extends Condicion {
    private Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return c1.cumple(a) || c2.cumple(a);
    }
}
