package tp4.ej5;
//Los productos congelados deben llevar la fecha de
//envasado, el código del organismo de supervisión alimentaria, la granja de origen y la
//temperatura de mantenimiento recomendada.

public class ProductoCongelado extends Producto{
    public ProductoCongelado (String tipo, String fechaVencimiento, int nLote, String nombre, String fechaEnvasado, String granja,
                                int codSupervicion, int temperaturaRecomendada){
        super(tipo, fechaVencimiento, nLote, nombre, fechaEnvasado, granja, codSupervicion, temperaturaRecomendada);
    }
}
