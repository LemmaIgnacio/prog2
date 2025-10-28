package tp7.ej5;

public class CondicionNot extends Condicion{
    private Condicion c;
    public boolean cumple(Pelicula c){
        return !this.c.cumple(c);
    }
}
