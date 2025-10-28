package tp7.ej5;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int fechaEstreno;
    private int duracion;
    private int edadMinima;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public ArrayList<String> getActores() {
        return new ArrayList<>(actores);
    }
    public void setActores(ArrayList<String> actores) {
        this.actores = new ArrayList<>(actores);
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }
    public void setGeneros(ArrayList<String> generos) {
        this.generos = new ArrayList<>(generos);
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getFechaEstreno() {
        return fechaEstreno;
    }
    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
}
