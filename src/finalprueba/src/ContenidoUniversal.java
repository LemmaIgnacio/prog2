import java.util.Date;

public class ContenidoUniversal extends ContenidoSimple{
    public ContenidoUniversal(int id, String titulo, Date publicacion, int tamanio, int duracion, int reproducciones, Estrategia e) {
        super(id, titulo, publicacion, tamanio, duracion, reproducciones, e);
    }

    @Override
    public boolean tieneEtiqueta(String s){
        return true;
    }
}
