import java.util.ArrayList;

public class Comida extends Elemento{
    private String nombre;
    private int tiempoPreparacion;
    private double precio;
    private int calorias;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public Comida(String nombre, int tiempoPreparacion, double precio, int calorias ){
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.precio = precio;
        this.calorias = calorias;
    }
    // getter y setters

    public void addIngrediente(String s){
        ingredientes.add(s);
    }

    @Override
    public ArrayList<Elemento> buscar (Condicion c){
        ArrayList<Elemento> salida = new ArrayList<>();
        if (c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public ArrayList<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }

}

// COMIDA (SIMPLE)
// ATRIBUTOS
//  NOMBRE STRING
//  TIMEPO PREPARACION INT
//  PRECIO INT
//  CALORIAS INT
//  LISTA DE INGREDIENTES (ARRAYLIST STRING)
//BUSCAR
//METODOS
// GETTER Y SETTERS DE TODOS