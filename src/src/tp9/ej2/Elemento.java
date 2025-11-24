package tp9.ej2;

import java.util.ArrayList;

public abstract class Elemento {
    public abstract ArrayList<Elemento> buscar(Condicion c);
    public abstract int getDuracion();
}

