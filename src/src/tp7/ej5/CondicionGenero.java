package tp7.ej5;

public class CondicionGenero extends Condicion {
    private String g;

    public CondicionGenero(String g) {
        this.g = g;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }
    
    @Override
    public boolean cumple(Pelicula p){
        return p.getGeneros().contains(this.g);
    }
}
