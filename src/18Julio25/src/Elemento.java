import java.util.ArrayList;

public abstract class Elemento implements Comparable<Elemento>{
    protected String titulo;
    protected int descargas;
    protected Usuario u;
    protected int anio;

    public Elemento(String titulo, int descargas, Usuario u, int anio) {
        this.titulo = titulo;
        this.descargas = descargas;
        this.u = u;
        this.anio = anio;
    }

    public abstract boolean contienePalabraClave(String s);
    public abstract ArrayList<Elemento> buscar(Condicion c);
    public abstract int getDescargas();
    public abstract ArrayList<String> getPalabraClave();
    public abstract int getTamanio();
    public abstract int getAnio();
    @Override
    public int compareTo(Elemento otro){
        int res = this.getUsuario().getNombre().compareTo(otro.getUsuario().getNombre());
        if (res == 0){
            res = this.getUsuario().getEmail().compareTo(otro.getUsuario().getEmail());
        }
        return res;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getUsuario(){
        return u;
    }


}
