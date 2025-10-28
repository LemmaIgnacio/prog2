package tp7.ej5;

public class CondicionDirector extends Condicion{
    private String d;

    public CondicionDirector(String d) {
        this.d = d;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public boolean cumple(Pelicula p){
        return p.getDirector().equals(this.d);
    }
    
}
