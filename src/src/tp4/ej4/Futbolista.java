package tp4.ej4;

public class Futbolista extends Integrante{
    private int cantGoles;
    private String piernaHabil;
    
    public Futbolista(String name, String apellido, int numPassport, String bornDate, String estado, int cantGoles, String piernaHabil){
        super(name, apellido, numPassport, bornDate, estado);
        this.cantGoles = cantGoles;
        this.piernaHabil = piernaHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    @Override
    public String toString() {
        return "Futbolista [name=" + name + ", apellido=" + apellido + ", estado=" + estado + "]";
    }
    
}
