package tp7.ej3;

public class CondicionRiegoMayor extends Condicion {
    private int s;
    
    public CondicionRiegoMayor(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    @Override
    public boolean cumple (Planta p){
        return p.getRiego() < this.s;
    }
}
