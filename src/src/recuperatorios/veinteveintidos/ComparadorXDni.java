package recuperatorios.veinteveintidos;

import java.util.Comparator;

public class ComparadorXDni implements Comparator<Cliente> {
    
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return Integer.compare(c1.getDni(), c2.getDni());
    }
}
