import java.util.ArrayList;

public class Temporada {
    private String nombre;
    private ArrayList<Episodio> episodios;
    public Temporada(String nombre, ArrayList<Episodio> episodios) {
        this.nombre = nombre;
        this.episodios = episodios;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }
    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
    
    public int getEpisodiosVistos(){
        int contador = 0;
        for(Episodio p : episodios){
            if(p.isFlag()){
                contador++;
            }
        }
        return contador;
    }

    public int getClasificacion(){
        int contador = 0;
        for(Episodio p : episodios){
            if (p.isFlag()) {
                contador += p.getClasificacion();
            }
        }
        return contador;
    }

    public double getPromedio() {
        int vistos = getEpisodiosVistos();
        if (vistos == 0) {
            return 0.0;
        }
        return (double) getClasificacion() / vistos;
    }

    public int getTamanio(){
        int tamanio = 0;
        for(Episodio p : episodios){
                tamanio += p.getTamanio();
        }
        return tamanio;
    }
}
