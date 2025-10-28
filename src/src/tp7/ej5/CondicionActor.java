package tp7.ej5;

public class CondicionActor  extends Condicion{
    private String a;

    public CondicionActor(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
    @Override 
    public boolean cumple(Pelicula p){
        return p.getActores().contains(this.a);
    }
}
