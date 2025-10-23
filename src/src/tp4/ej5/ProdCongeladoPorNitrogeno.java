package tp4.ej5;
//Los productos congelados por nitrógeno deben llevar la información del método
//de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.
public class ProdCongeladoPorNitrogeno extends ProductoCongelado {
    private int tiempoExposicion;
    public ProdCongeladoPorNitrogeno (String tipo, String fechaVencimiento, int nLote, String nombre, String fechaEnvasado, String granja,
                                int codSupervicion, int temperaturaRecomendada, int tiempoExposicion){
        super(tipo, fechaVencimiento, nLote, nombre, fechaEnvasado, granja, codSupervicion, temperaturaRecomendada);
        this.tiempoExposicion = tiempoExposicion;
    }
    public int getTiempoExposicion() {
        return tiempoExposicion;
    }
    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }
    @Override
    public String toString() {
    return "❄️ Producto Congelado por Nitrógeno\n" +
           "  Nombre: " + nombre + "\n" +
           "  Fecha de Envasado: " + fechaEnvasado + "\n" +
           "  Fecha de Vencimiento: " + fechaVencimiento + "\n" +
           "  Granja: " + granja + "\n" +
           "  Lote: " + nLote + "\n" +
           "  Supervisión: " + codSupervicion + "\n" +
           "  Temp. Recomendada: " + temperaturaRecomendada + "°C\n" +
           "  Tiempo de exposición: " + tiempoExposicion + " seg.";
    }

    
}   
