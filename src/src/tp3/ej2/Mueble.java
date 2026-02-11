package tp3.ej2;

public class Mueble {
    private String nombre; // silla, mesa, banco
    private int peso;
    private double costo;
    private String madera;
    private String color;
    private boolean stock;
    private double margenVenta;

    public Mueble(String nombre, int peso, double costo, String madera, String color, boolean stock, double margenVenta) {
        this.nombre = nombre;
        this.peso = peso;
        this.costo = costo;
        this.madera = madera;
        this.color = color;
        this.stock = stock;
        this.margenVenta = margenVenta;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getMadera() {
        return madera;
    }
    public void setMadera(String madera) {
        this.madera = madera;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getStock() {
        return stock;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public double getMargenVenta() {
        return margenVenta;
    }
    public void setMargenVenta(double margenVenta) {
        this.margenVenta = margenVenta;
    }

    public double costoDeVenta(){
        return costo + (costo * margenVenta);
    }
}
