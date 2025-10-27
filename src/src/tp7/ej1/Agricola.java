package tp7.ej1;

import java.util.ArrayList;

public class Agricola {
    private ArrayList<Agroquimico> productos;

    public Agricola() {
        productos = new ArrayList<>();
    }

    public void addProducto(Agroquimico a) {
        productos.add(a);
    }

    public ArrayList<Agroquimico> buscar(Condicion c) {
        ArrayList<Agroquimico> resultado = new ArrayList<>();
        for (Agroquimico a : productos) {
            if (c.cumple(a)) {
                resultado.add(a);
            }
        }
        return resultado;
    }
}
