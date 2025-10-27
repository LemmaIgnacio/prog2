package tp7.ej2;

public class CondicionNot extends Condicion{
    private Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Documento d){
        return !condicion.cumple(d);
    }
}
