package tp7.ej5;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula p){
        return p.getTitulo().equals(this.titulo);
    }
}
