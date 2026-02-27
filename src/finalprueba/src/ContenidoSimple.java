import java.util.ArrayList;
import java.util.Date;

public class ContenidoSimple extends ContenidoDigital {
    private final int duracion;
    private final int reproducciones;

    public ContenidoSimple(int id, String titulo, Date publicacion, int tamanio, int duracion, int reproducciones, Estrategia e) {
        super(id, titulo, publicacion, tamanio,e);
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }

    @Override
    public int cantidad(){
        return 1;
    }
    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public int getReproducciones() {
        return reproducciones;
    }
    @Override
    public  ArrayList<ContenidoDigital> buscar (Condicion c){
        ArrayList<ContenidoDigital> res = new ArrayList<>();
        if (c.cumple(this)){
            res.add(this);
        }
        return res;
    }

    @Override
    public ContenidoDigital copia (Condicion c){
        if (!c.cumple(this)){
            return null;
        }
        return new ContenidoSimple(getId(), getTitulo(), getPublicacion(),getTamanio(),getDuracion(),getReproducciones(), getE());
    }
}

