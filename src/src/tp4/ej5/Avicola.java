package tp4.ej5;

import java.util.ArrayList;

public class Avicola {
    private ArrayList<Producto> productos;

    public Avicola(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void mostrarProductos(){
        for(Producto productos : productos){
            System.out.println(productos);
        }
    }
}
