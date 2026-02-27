public class MonetizacionCompuesta implements Estrategia{
    Estrategia e1;
    Estrategia e2;

    public MonetizacionCompuesta(Estrategia e1, Estrategia e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    @Override
    public double calcularIngreso(ContenidoDigital c){
        return e1.calcularIngreso(c) + e2.calcularIngreso(c);
    }
}
