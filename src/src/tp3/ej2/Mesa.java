package tp3.ej2;

public class Mesa extends Mueble{
        
    public Mesa (int peso, int costoFrabricacion, String tipoMadera, String color, boolean stock){
        super(peso, costoFrabricacion, tipoMadera, color, stock);
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "peso=" + peso +
                ", costoFrabricacion=" + costoFrabricacion +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                ", precio de venta=" + precioVenta() +
                '}';
    }
}
