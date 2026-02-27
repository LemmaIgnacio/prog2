public class MonetizacionPremium implements Estrategia {
    private int ingreso;
    private String etiqueta;

    public MonetizacionPremium(int ingreso, String etiqueta) {
        this.ingreso = ingreso;
        this.etiqueta = etiqueta;
    }

    @Override
    public double calcularIngreso(ContenidoDigital c){
        if(c.getEtiquetas().contains(etiqueta)){
            return ingreso;
        }
        return 0;
    }
}
