package tp6.ej1;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Item> itemAlquilado;
    
    public Cliente(String nombre, ArrayList<Item> itemAlquilado) {
        this.nombre = nombre;
        this.itemAlquilado = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getItemAlquilado() {
        return new ArrayList<>(itemAlquilado);
    }

    public void setItemAlquilado(ArrayList<Item> itemAlquilado) {
        this.itemAlquilado = new ArrayList<>(itemAlquilado);
    }

    public void agregarItemAlquilado(Item item) {
        itemAlquilado.add(item);
    }
    public void devolverItem(Item item) {
        itemAlquilado.remove(item);
    }
}
