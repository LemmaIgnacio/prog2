package final13febrero026.condiciones;
import final13febrero026.Elemento;
public class CondicionAND implements Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionAND(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Elemento e){
        return c1.cumple(e) && c2.cumple(e);
    }
}
