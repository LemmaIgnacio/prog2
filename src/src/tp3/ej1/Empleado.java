package tp3.ej1;

public class Empleado extends Persona{
    private int cantEncuestas;

    public Empleado(String nombre, int dni, int cantEncuestas) {
        super(nombre, dni);
        this.cantEncuestas = cantEncuestas;
    }

    public int getCantEncuestas() {
        return cantEncuestas;
    }

    public void setCantEncuestas(int cantEncuestas) {
        this.cantEncuestas = cantEncuestas;
    }
    
    public void aumentarEncuesta(){
        cantEncuestas++;
    }

    public boolean obtienePlus(){
        return cantEncuestas > 5;
    }
}
