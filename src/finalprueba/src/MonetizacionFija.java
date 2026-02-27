public class MonetizacionFija implements Estrategia {
    private double fijo;
    private int minimo;

    public MonetizacionFija(double fijo, int minimo) {
        this.fijo = fijo;
        this.minimo = minimo;
    }
    @Override
    public double calcularIngreso(ContenidoDigital c){
        if (c.getReproducciones() > minimo){
            return fijo;
        }
        return 0;
    }
}
