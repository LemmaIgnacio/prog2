package tp7.ej3;

public class CondicionSolMenor extends Condicion {
    private int s;

    public CondicionSolMenor(int s) {
        this.s = s;
    }

    @Override
    public boolean cumple(Planta p){
        return p.getSol() < this.s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

}
