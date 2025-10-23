package tp4.ej5;
//Todos los productos llevan esta
// información común: fecha de vencimiento y número de lote
public class Producto {
    protected String tipo;
    protected String fechaVencimiento;
    protected int nLote;
    protected String nombre;
    protected String fechaEnvasado;
    protected String granja;
    protected int codSupervicion;
    protected int temperaturaRecomendada;
    
    public Producto(String tipo, String fechaVencimiento, int nLote, String nombre, String fechaEnvasado, 
                    String granja,  int codSupervicion, int temperaturaRecomendada) {
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
        this.nLote = nLote;
        this.nombre = nombre;
        this.fechaEnvasado = fechaEnvasado;
        this.granja = granja;
        this.codSupervicion = codSupervicion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getnLote() {
        return nLote;
    }

    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public int getCodSupervicion() {
        return codSupervicion;
    }

    public void setCodSupervicion(int codSupervicion) {
        this.codSupervicion = codSupervicion;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

        @Override
    public String toString() {
        return "📦 Producto " + tipo + "\n" +
               "  Nombre: " + nombre + "\n" +
               "  Fecha de Envasado: " + fechaEnvasado + "\n" +
               "  Fecha de Vencimiento: " + fechaVencimiento + "\n" +
               "  Granja: " + granja + "\n" +
               "  Lote: " + nLote + "\n" +
               "  Supervisión: " + codSupervicion + "\n" +
               "  Temp. Recomendada: " + temperaturaRecomendada + "°C";
    }
    
}
