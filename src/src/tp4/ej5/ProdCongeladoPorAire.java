package tp4.ej5;
// Los productos congelados por aire deben llevar la información de
//la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido
//de carbono y % de vapor de agua)
public class ProdCongeladoPorAire extends ProductoCongelado{
        private int nitrogeno;
        private int oxigeno;
        private int dioxidoCarbono;
        private int vaporAgua;
        
    public ProdCongeladoPorAire (String tipo, String fechaVencimiento, int nLote, String nombre, String fechaEnvasado, String granja,
                                int codSupervicion, int temperaturaRecomendada, int nitrogeno, int oxigeno, int dioxidoCarbono, int vaporAgua ){
        super(tipo, fechaVencimiento, nLote, nombre, fechaEnvasado, granja, codSupervicion, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public String composicionAire(){
        return nitrogeno + "% Nitrógeno, " + oxigeno + "% Oxígeno, " + dioxidoCarbono + "% Dióxido de Carbono, " + vaporAgua + "% Vapor de Agua";
    }

    @Override
    public String toString() {
    return "❄️ Producto Congelado por Aire\n" +
           "  Nombre: " + nombre + "\n" +
           "  Fecha de Envasado: " + fechaEnvasado + "\n" +
           "  Fecha de Vencimiento: " + fechaVencimiento + "\n" +
           "  Granja: " + granja + "\n" +
           "  Lote: " + nLote + "\n" +
           "  Supervisión: " + codSupervicion + "\n" +
           "  Temp. Recomendada: " + temperaturaRecomendada + "°C\n" +
           "  Composición del aire: " + composicionAire();
    }

    
}
