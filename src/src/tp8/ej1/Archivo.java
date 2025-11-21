package tp8.ej1;

public class Archivo extends Elemento{
    private String ultModificacion;
    private int tamanio;
    public Archivo (String nombre, String fechaCreacion, String ultModificacion, int tamanio){
        super(nombre, fechaCreacion);
        this.ultModificacion = ultModificacion;
        this.tamanio = tamanio;
    }
    
    public String getUltModificacion(){
        return this.ultModificacion;
    }

    @Override
    public int getCantElementos(){
        return 1;
    }

    @Override
    public int getTamanio() { 
        return tamanio;
    }

}
