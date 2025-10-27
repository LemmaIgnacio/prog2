package tp7.ej2;

public class CondicionTituloExacto extends Condicion {
    private String titulo;
    
    public CondicionTituloExacto(String titulo) {
        this.titulo = titulo;
    }
    
        public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento d){
        return d.getNombre().equals(titulo);
    }

}
