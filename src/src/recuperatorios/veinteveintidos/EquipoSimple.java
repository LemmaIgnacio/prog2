package recuperatorios.veinteveintidos;

public class EquipoSimple extends Equipo {
    protected int valor;
    protected int antiguedad;
    protected String descripcion;

    public EquipoSimple(int valor, int antiguedad, int codigo, String descripcion) {
        super(codigo);
        this.valor = valor;
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
    }
    
    @Override
    public int getAntiguedad(){
        return antiguedad;
    }
        @Override
    public int getCodigo(){
        return codigo;
    }
        @Override
    public int getValor(){
        return valor;
    }
        @Override
    public String getDescripcion(){
        return descripcion;
    }
}
