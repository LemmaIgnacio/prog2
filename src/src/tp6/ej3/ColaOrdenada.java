package tp6.ej3;

import java.util.ArrayList;

public class ColaOrdenada {
    private ArrayList<ElementoEnCola> lista;

    public ColaOrdenada() {
        lista = new ArrayList<>();
    }

    public void agregar(ElementoEnCola e) {
        int i = 0;
        while (i < lista.size() && e.getPrioridad() < lista.get(i).getPrioridad()) {
            i++;
        }
        lista.add(i, e);
    }

    public ElementoEnCola sacar() {
        if (!lista.isEmpty()) {
            return lista.remove(0);
        }
        return null;
    }

    public void mostrar() {
        for (ElementoEnCola e : lista) {
            System.out.println(" - " + e.getNombre());
        }
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }
}
