package tp7.ej3;

public class CondicionRiegoMenor extends Condicion {
    private int s;

    public CondicionRiegoMenor(int s) {
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
