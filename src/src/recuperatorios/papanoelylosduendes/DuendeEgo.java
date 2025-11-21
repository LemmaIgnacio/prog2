package recuperatorios.papanoelylosduendes;

public class DuendeEgo extends Duende {

    public DuendeEgo(String nombre, int aniosXP, double velocidad, double creatividad){
        super(nombre, aniosXP, velocidad, creatividad);
    }

    @Override
    public int getAniosXP(){
        return aniosXP*2;
    }

    @Override 
    public double getVelocidad(){
        return velocidad*2;
    }

    @Override
    public double getCreatividad(){
        return creatividad*2;
    }

    @Override
    public Taller clonar(){
        return new DuendeEgo(nombre, aniosXP, velocidad, creatividad);
    }
}
