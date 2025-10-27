package tp6.ej1;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Item> items;
    private ArrayList <Cliente> clientes;

    public Videoclub(ArrayList<Item> items, ArrayList<Cliente> clientes) {
        this.items = items;
        this.clientes = clientes;
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }


    public void agregarItem(Item item) {
        items.add(item);
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void agregarItem(Cliente c) {
        clientes.add(c);
    }
    
}
