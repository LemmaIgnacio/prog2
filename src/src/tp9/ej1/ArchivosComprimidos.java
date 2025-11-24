package tp9.ej1;

public class ArchivosComprimidos extends Directorio {

    private int tasaComprension;

    public ArchivosComprimidos(String nombre, int fechaCreacion, int tasa){
        super(nombre, fechaCreacion);
        this.tasaComprension = tasa;
    }

    @Override
    public int getTamanio(){
        return super.getTamanio() / tasaComprension;
    }


}
