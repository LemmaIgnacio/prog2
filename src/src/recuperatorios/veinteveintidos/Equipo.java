package recuperatorios.veinteveintidos;

public abstract class Equipo {
    protected int codigo;

    public Equipo(int codigo){
        this.codigo = codigo;
    }
    
    public abstract int getValor();
    public abstract int getAntiguedad();
    public abstract int getCodigo();
    public abstract String getDescripcion();

}


