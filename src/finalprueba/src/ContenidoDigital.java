import java.util.ArrayList;
import java.util.Date;

public abstract class ContenidoDigital implements Comparable<ContenidoDigital> {
    private int id;
    private String titulo;
    private Date publicacion;
    private int tamanio;
    private Estrategia e;
    private ArrayList<String> etiquetas = new ArrayList<>();

    public ContenidoDigital(int id, String titulo, Date publicacion, int tamanio, Estrategia e) {
        this.id = id;
        this.titulo = titulo;
        this.publicacion = publicacion;
        this.tamanio = tamanio;
        this.e = e;
    }
    public double monetizacion(ContenidoDigital c){
        return e.calcularIngreso(c);
    }

    public Estrategia getE() {return e;}
    public abstract ContenidoDigital copia (Condicion c);
    public abstract ArrayList<ContenidoDigital> buscar (Condicion c);
    public abstract int cantidad();
    public abstract int getDuracion();
    public abstract int getReproducciones();
    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public Date getPublicacion() {return publicacion;}
    public int getTamanio() {return tamanio;}

    public void addEtiqueta(String s){
        etiquetas.add(s);
    }
    public  ArrayList<String> getEtiquetas(){
        ArrayList<String> res = new ArrayList<>();
        res.addAll(etiquetas);
        return res;
    }
    public boolean tieneEtiqueta(String s){
        return etiquetas.contains(s);
    }
    @Override
    public int compareTo(ContenidoDigital otro){
        int res = this.getPublicacion().compareTo(otro.getPublicacion());
        if (res == 0){
            res = Integer.compare(this.getTamanio(), otro.getTamanio());
        }
        if (res == 0){
            res = Integer.compare(this.getReproducciones(), otro.getReproducciones());
        }
        return res;
    }

}


