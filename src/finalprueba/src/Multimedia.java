import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Multimedia extends ContenidoDigital{
    private ArrayList<ContenidoDigital> elementos = new ArrayList<>();

    public Multimedia(int id, String titulo, Date publicacion, int tamanio, Estrategia e) {
        super(id, titulo, publicacion, tamanio, e);
    }

    public void addElementos(ContenidoDigital c){
        elementos.add(c);
        Collections.sort(elementos);
    }

    public ArrayList<ContenidoDigital> primerContenido(Condicion c){
        ArrayList<ContenidoDigital> res = new ArrayList<>();
        for(ContenidoDigital e : elementos){
            if (c.cumple(e)){
                res.add(e);
                return res;
            }
        }
        return res;
    }

    @Override
    public ContenidoDigital copia (Condicion c){
        Multimedia copia = new Multimedia(getId(),getTitulo(),getPublicacion(),getTamanio(),getE());
        for (ContenidoDigital e : elementos){
            ContenidoDigital copiaHijo = e.copia(c);
            if (copiaHijo != null){
                copia.addElementos(copiaHijo);
            }
        }
        if (copia.elementos.isEmpty()){
            return null;
        }
        return copia;
    }

    @Override
    public  ArrayList<ContenidoDigital> buscar (Condicion c){
        ArrayList<ContenidoDigital> res = new ArrayList<>();
            for (ContenidoDigital e : elementos){
                res.addAll(e.buscar(c));
            }
            Collections.sort(res);
            return res;
    }

    @Override
    public int cantidad(){
        int total = 0;
        for (ContenidoDigital e : elementos){
            total += e.cantidad();
        }
        return total;
    }
    @Override
    public int getDuracion() { //asumo que esto es asi para calcular la monetizacion
        int total = 0;
        for (ContenidoDigital e : elementos){
            total += e.getDuracion();
        }
        return total;
    }

    @Override
    public int getTamanio(){
        int total = 0;
        for (ContenidoDigital e : elementos){
            total += e.getTamanio();
        }
        return total;
    }
    @Override
    public  ArrayList<String> getEtiquetas(){
        ArrayList<String> res = new ArrayList<>();
        for (ContenidoDigital e : elementos){
            for (String etiquetas : e.getEtiquetas()){
                if (!res.contains(etiquetas)){
                    res.add(etiquetas);
                }
            }
        }
        return res;
    }
    @Override
    public int getReproducciones() {
        int total = 0;
        for (ContenidoDigital e : elementos){
            total += e.getReproducciones();
        }
        return total;
    }
}
