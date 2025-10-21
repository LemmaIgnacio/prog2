package tp3.ej2;

public class Mueble {
    protected int peso;
    protected int costoFrabricacion;
    protected String tipoMadera;
    protected String color;
    protected boolean stock;

    public Mueble(int peso, int costoFrabricacion, String tipoMadera, String color, boolean stock) {
        this.peso = peso;
        this.costoFrabricacion = costoFrabricacion;
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.stock = stock;
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCostoFrabricacion() {
        return costoFrabricacion;
    }

    public void setCostoFrabricacion(int costoFrabricacion) {
        this.costoFrabricacion = costoFrabricacion;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }



    public int precioVenta (){
        if (stock) {
            return (int) ( costoFrabricacion * 1.35 );
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "peso=" + peso +
                ", costoFrabricacion=" + costoFrabricacion +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                ", precio de venta=" + precioVenta() +
                '}';
    }
}
