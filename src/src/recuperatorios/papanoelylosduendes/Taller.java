package recuperatorios.papanoelylosduendes;

import java.util.ArrayList;

public abstract class Taller {

    public abstract String getNombre();
    public abstract int getAniosXP();
    public abstract double getVelocidad();
    public abstract double getCreatividad();
    public abstract ArrayList<String> getHabilidades();
    public abstract ArrayList<Duende> buscar(Condicion c);
    public abstract Taller copiar();
    protected abstract Taller clonar();

}
