package tp9.ej3;

public class Persona extends SE {
    private int dni;
    private boolean estaEnPadron;

    public Persona(int dni, boolean estaEnPadron) {
        this.dni = dni;
        this.estaEnPadron = estaEnPadron;
    }
    
    @Override
    public boolean estaEnPadron(){
        return estaEnPadron;
    }
}
