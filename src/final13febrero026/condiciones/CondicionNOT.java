package final13febrero026.condiciones;

import final13febrero026.Elemento;

public class CondicionNOT implements Condicion{
    Condicion c1;

    public CondicionNOT(Condicion c1){
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Elemento e){
        return !c1.cumple(e);
    }

}
