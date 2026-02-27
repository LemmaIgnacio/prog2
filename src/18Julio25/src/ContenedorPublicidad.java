import java.util.ArrayList;

public class ContenedorPublicidad extends Contenedor{
    private Elemento publicidad;

    public ContenedorPublicidad(String titulo, int descargas, Usuario u, int anio, Elemento publicidad) {
        super(titulo, descargas, u, anio);
        this.publicidad = publicidad;
    }

    @Override
    public ArrayList<Elemento> buscar (Condicion c) {
        ArrayList<Elemento> res = super.buscar(c);
        res.addFirst(publicidad);
        return res;
    }
}
