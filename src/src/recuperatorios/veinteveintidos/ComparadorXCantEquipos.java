package recuperatorios.veinteveintidos;

import java.util.Comparator;

public class ComparadorXCantEquipos implements Comparator<Cliente>{
    
    @Override
    public int compare(Cliente c1, Cliente c2) {
        int cant1 = c1.getCantidadEquipos();
        int cant2 = c2.getCantidadEquipos();
        // mayor a menor
        return Integer.compare(cant2, cant1);
    }

}
