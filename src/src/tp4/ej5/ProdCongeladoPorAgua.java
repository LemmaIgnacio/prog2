package tp4.ej5;
//Los productos congelados por agua deben llevar la
//información de la salinidad del agua con que se realizó la congelación en gramos de sal por
//litro de agua
public class ProdCongeladoPorAgua extends ProductoCongelado {
        private String infoSalinidad;
    public ProdCongeladoPorAgua (String tipo, String fechaVencimiento, int nLote, String nombre, String fechaEnvasado, String granja,
                                int codSupervicion, int temperaturaRecomendada, String infoSalinidad){
        super(tipo, fechaVencimiento, nLote, nombre, fechaEnvasado, granja, codSupervicion, temperaturaRecomendada);
        this.infoSalinidad = infoSalinidad;
    }
        @Override
        public String toString() {
         return "❄️ Producto Congelado por Agua\n" +
             "  Nombre: " + nombre + "\n" +
             "  Fecha de Envasado: " + fechaEnvasado + "\n" +
             "  Fecha de Vencimiento: " + fechaVencimiento + "\n" +
             "  Granja: " + granja + "\n" +
             "  Lote: " + nLote + "\n" +
             "  Supervisión: " + codSupervicion + "\n" +
             "  Temp. Recomendada: " + temperaturaRecomendada + "°C\n" +
             "  Salinidad del agua: " + infoSalinidad;
        }

    
}
