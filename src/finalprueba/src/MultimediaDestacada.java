import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class MultimediaDestacada extends Multimedia{
    private ContenidoDigital destacado;

    public MultimediaDestacada(int id, String titulo, Date publicacion, int tamanio, Estrategia e, ContenidoDigital destacado) {
        super(id, titulo, publicacion, tamanio, e);
        this.destacado = destacado;
    }

    @Override
    public ArrayList<ContenidoDigital> buscar (Condicion c){
        ArrayList<ContenidoDigital> res = super.buscar((c));
        Collections.sort(res);
        res.addFirst(destacado);
        return res;
    }
}
