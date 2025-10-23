package tp4.ej4;

public class Entrenador extends Integrante {
    public int idFed;
    public Entrenador(String name, String apellido, int numPassport, String bornDate, String estado, int idFed){
        super(name, apellido, numPassport, bornDate, estado);
        this.idFed = idFed;
    }
    public int getIdFed() {
        return idFed;
    }
    public void setIdFed(int idFed) {
        this.idFed = idFed;
    }
    
    @Override
    public String toString() {
        return "Entrenador [name=" + name + ", idFed=" + idFed + ", apellido=" + apellido + ", estado=" + estado + "]";
    }
    
}
