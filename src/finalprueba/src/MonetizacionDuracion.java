public class MonetizacionDuracion implements Estrategia {
    @Override
    public double calcularIngreso(ContenidoDigital c){
        return c.getDuracion();
    }
}
