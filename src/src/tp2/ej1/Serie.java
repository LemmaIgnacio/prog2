import java.util.ArrayList;

public class Serie {
    private String nombre;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;
    
    public Serie(String nombre, String descripcion, String creador, String genero, ArrayList<Temporada> temporadas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public int getClasificacion(){
        int contador = 0;
        for (Temporada t : temporadas) {
            contador += t.getClasificacion();
        }
        return contador;
    }

    public int getEpisodiosVistos(){
        int contador = 0;
        for(Temporada t : temporadas){
            contador += t.getEpisodiosVistos();
        }
        return contador;
    }

    public int getTamanio(){
        int tamanio = 0;
        for (Temporada t : temporadas) {
            tamanio += t.getTamanio();
        }
        return tamanio;
    }

    public boolean todosEpVistos(){
        return getTamanio() == getTamanio();
    }

    public double getPromedio() {
        int vistos = getEpisodiosVistos();
        if (vistos == 0) {
            return 0.0;
        }
        return (double) getClasificacion() / vistos;
    }
}
