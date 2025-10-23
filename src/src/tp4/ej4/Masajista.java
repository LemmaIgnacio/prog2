package tp4.ej4;

public class Masajista extends Integrante {
    public String titulo;
    public int exp;
    public Masajista(String name, String apellido, int numPassport, String bornDate, String estado, String titulo, int exp){
        super(name, apellido, numPassport, bornDate, estado);
        this.titulo = titulo;
        this.exp = exp;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    @Override
    public String toString() {
        return "Masajista [name=" + name + ", apellido=" + apellido + ", estado=" + estado + "]";
    }

    
}
