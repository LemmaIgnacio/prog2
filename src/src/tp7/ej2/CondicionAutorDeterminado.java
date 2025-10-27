package tp7.ej2;

public class CondicionAutorDeterminado extends Condicion {
    private String autor;
    
    public CondicionAutorDeterminado(String autor) {
        this.autor = autor;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public boolean cumple(Documento d){
        return d.getAutores().contains(autor);
    }

}
