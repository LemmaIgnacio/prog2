package tp9.ej2;
import java.util.ArrayList;
public class Audio extends Elemento {
    private int id;
    private String titulo;
    private int duracion;
    private String artista;
    private String album;
    private int anio;
    private String genero;
    
    public Audio(int id, String titulo, int duracion, String artista,
                String album, int anio, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c){
        ArrayList<Elemento> res = new ArrayList<>();
        if (c.cumple(this)) {
            res.add(this);
        }
        return res;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    public int getAnio(){
        return anio;
    }
    
    public String getArtista(){
        return artista;
    }

    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public String getAlbum() {return album;}
    public String getGenero() {return genero;}
}
