package recuperatorios.veinteveintidos;

import java.util.Comparator;

public class ComparadorXApellido implements Comparator<Cliente>{
    @Override
    public int compare(Cliente c1, Cliente c2) {
        int compApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (compApellido == 0) {
            return c1.getNombre().compareToIgnoreCase(c2.getNombre());
        }
        return compApellido;
    }
}
