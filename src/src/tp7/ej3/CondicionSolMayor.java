package tp7.ej3;

public class CondicionSolMayor extends Condicion  {
    private int s;
    
    public CondicionSolMayor(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    @Override
    public boolean cumple(Planta p){
        return p.getSol() > this.s;
    }

}
