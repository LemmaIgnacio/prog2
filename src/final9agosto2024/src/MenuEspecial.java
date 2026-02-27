public class MenuEspecial extends Menu {
    private Condicion condicion;

    public MenuEspecial(double descuento, Condicion condicion) {
        super(descuento);
        this.condicion = condicion;
    }

    @Override
    public void addElementos(Elemento e) {
        if (condicion.cumple(e)) {
            super.addElementos(e);
        }
    }
}