package recuperatorios.papanoelylosduendes;

public class DuendeSupremo extends Duende{
    public DuendeSupremo(String nombre, int aniosXP, double velocidad, double creatividad){
        super(nombre, aniosXP, velocidad, creatividad);
    }

    @Override
    public double getVelocidad() { return super.getVelocidad() * 5; }

    @Override
    public double getCreatividad() { return super.getCreatividad() * 5; }

    @Override
    public int getAniosXP() { return super.getAniosXP() * 5; }

    @Override
    protected Taller clonar() {
        return new DuendeSupremo(this.nombre, this.aniosXP, this.velocidad, this.creatividad);
    }
}
