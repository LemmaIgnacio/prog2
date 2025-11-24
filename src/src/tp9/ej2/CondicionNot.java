package tp9.ej2;

public class CondicionNot extends Condicion{
    Condicion c1;
    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }
    @Override 
    public boolean cumple (Elemento e){
        return !c1.cumple(e);
    }
}
