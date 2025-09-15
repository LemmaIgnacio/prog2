public class Electrodomestico {
    
    String nombre;
    String color;
    double consumo;
    double precio;
    double peso;

    //constructor por default
    public Electrodomestico(String nombre){
        this.nombre = nombre;
        this.color = "gris plata";
        this.consumo = 10;
        this.precio = 100;
        this.peso = 2;
    }

    //constructor para completar los datos
    public Electrodomestico(String nombre, String color,
                            double consumo, double precio, double peso){

            this.nombre = nombre;
            this.color = color;
            this.consumo = consumo;
            this.precio = precio;
            this.peso = peso; 
    }

    //#1 Todos los métodos get y set.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    //#2 Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
    public boolean bajoConsumo(){
        return this.consumo <= 45;
    }

    //#3 Calcular el balance, el mismo es el resultado de dividir el costo por el peso
    public double balance(){
        if (this.peso > 0) {
            return this.precio/this.peso;
        }
        return -1;
    }

    //#4 Indicar si un producto es de alta gama, el balance es mayor que 3
    public boolean esGamaAlta(){
        return balance() > 3;
    }

    public String funcionalidades(){
        return "Electrodoméstico: " + this.nombre + "\n" +
            "Color: " + this.color + "\n" +
            "Consumo: " + this.consumo + " Kw \n" +
            "Precio: $" + this.precio + "\n" +
            "Peso: " + this.peso + " kg \n" +
            "¿Bajo consumo?: " + (bajoConsumo()) + "\n" +
            "Balance: " + balance() + "\n" +
            "¿Alta gama?: " + (esGamaAlta()) + "\n";
    }
}
