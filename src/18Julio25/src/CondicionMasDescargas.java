

public class CondicionMasDescargas implements Condicion{
    private int cant;

    public CondicionMasDescargas(int cant) {
        this.cant = cant;
    }

    @Override
    public boolean cumple(Elemento e){
        return e.getDescargas() > cant;
    }
}
