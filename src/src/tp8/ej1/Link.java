package tp8.ej1;

public class Link extends Elemento {
    public final static int tamanio = 1;
    public Link (String nombre, String fechaCreacion){
        super(nombre, fechaCreacion);
    }
    @Override
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public int getTamanio(){
        return tamanio;
    }

    @Override
    public int getCantElementos(){
        return 0;
    }

    @Override
    public String getFechaCreacion(){
        return this.fechaCreacion;
    }
}
