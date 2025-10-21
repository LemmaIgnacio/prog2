package tp3.ej2;

public class Silla extends Mueble {
    
    public Silla (int peso, int costoFrabricacion, String tipoMadera, String color, boolean stock){
        super(peso, costoFrabricacion, tipoMadera, color, stock);
    }
    
    // que pasaria si  se agrega un producto cuyo precio de venta es del
    // mas del 10% del costo de fabricacion

    @Override
    public int precioVenta (){
        if (stock) {
            return (int) (costoFrabricacion * 1.10);
        }
        return 0;
    }

    public String toString() {
        return "Silla{" +
                "peso=" + peso +
                ", costoFrabricacion=" + costoFrabricacion +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                ", precio de venta=" + precioVenta() +
                '}';
    }
}
