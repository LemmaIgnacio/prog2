package tp6;

public class Pelicula extends Item{
    private String infoFilmografica;
    private static int cantidadCopias;

    

    public Pelicula(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }


    public String getInfoFilmografica() {
        return infoFilmografica;
    }

    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }


    public static int getCantidadCopias() {
        return cantidadCopias;
    }


    public static void setCantidadCopias(int cantidadCopias) {
        Pelicula.cantidadCopias = cantidadCopias;
    }


    @Override
    public boolean puedeAlquilar(){
        if (cantidadCopias <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public void alquilar(Cliente c) {
        if (puedeAlquilar()) {
            cantidadCopias--;
            c.agregarItemAlquilado(this);
        }
    }
}
