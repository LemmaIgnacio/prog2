package tp9.ej2;

public class Playlist3600 extends Playlist {
    private final static int DURACION_MAXIMA = 3600;
	public Playlist3600(String nombre, boolean enPromocion) {
		super(nombre, enPromocion);
	}

    @Override
    public void addListaRep (Elemento e){
        if (super.getDuracion() < DURACION_MAXIMA) {
            listaReproduccion.add(e);
        }
        
    }
	
}
