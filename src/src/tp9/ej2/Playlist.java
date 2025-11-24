package tp9.ej2;
import java.util.ArrayList;
public class Playlist extends Elemento {
    protected String nombre;
    protected ArrayList<Elemento> listaReproduccion;
    protected boolean enPromocion;

    public Playlist(String nombre, boolean enPromocion) {
        this.nombre = nombre;
        this.listaReproduccion = new ArrayList<>();
        this.enPromocion = enPromocion;
    }
    public String getNombre() {
        return nombre;
    }
    public void addListaRep (Elemento e){
        listaReproduccion.add(e);
    }
    public ArrayList<Elemento> getListaRep(){
        return new ArrayList<>(listaReproduccion);
    }
    public boolean isEnPromocion() {
        return enPromocion;
    }
    @Override
    public int getDuracion(){
        int total = 0;
        for (Elemento e : listaReproduccion) {
            total += e.getDuracion();
        }
        return total;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c){
        ArrayList<Elemento> res = new ArrayList<>();
        if (enPromocion) {
            res.add(this);
        }
        for(Elemento e : listaReproduccion){
            if (c.cumple(e)) {
                res.addAll(e.buscar(c));
            }
        }
        return res;
    }

}
