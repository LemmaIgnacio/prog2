package tp3.ej2;

public class Banco extends Mueble {

    public Banco (int peso, int costoFrabricacion, String tipoMadera, String color, boolean stock){
        super(peso, costoFrabricacion, tipoMadera, color, stock);
    }
    
    @Override
    public String toString() {
        return "Banco{" +
                "peso=" + peso +
                ", costoFrabricacion=" + costoFrabricacion +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                ", precio de venta=" + precioVenta() +
                '}';
    }
}
