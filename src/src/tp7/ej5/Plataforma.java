package tp7.ej5;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;

    public Plataforma(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public ArrayList<Pelicula> getPeliculas(){
        return new ArrayList<>(peliculas);
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas){
        this.peliculas = new ArrayList<>(peliculas);
    }

    public ArrayList<Pelicula> buscar(Condicion c){
        ArrayList<Pelicula> copia = new ArrayList<>();
        for(Pelicula p : peliculas){
            if (c.cumple(p)) {
                copia.add(p);
            }
        }
        return copia;
    }
}
