package tp7.ej3;

public class CondicionTipo extends Condicion{
    private String t;
    
    public CondicionTipo(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public boolean cumple(Planta p){
        return p.getTipo().equals(t);
    }
}
