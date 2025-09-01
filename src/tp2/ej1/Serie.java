import java.util.ArrayList;
public class Serie {
    private String nombre;
    private String genero;
    private String creador;

    //CONSTRUCTORES
    public Serie(String nombre, String genero, String creador) {
        this.nombre = nombre;
        this.genero = genero;
        this.creador = creador;
    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Obtener el total de episodios vistos de una serie.

    public int getEpVistos(ArrayList<Temporada> temporadas){
        int contador = 0;
        for(int i = 0; i < temporadas.size(); i++){
            contador += temporadas.get(i).getEpVistos();
        }
        return contador;
    }

    //Obtener el promedio de las calificaciones dadas para una serie.
    public double getPromedioCalificaciones(ArrayList<Temporada> temporadas){
        double suma = 0;
        double calificacion = 0;
        int contador = 0;
        for(int i = 0; i < temporadas.size(); i++){
            calificacion = temporadas.get(i).getPromedioCalificaciones();
            if( calificacion >= 0){
                suma += calificacion;
                contador++;
            }   
        }
        if (contador > 0) {
            return suma/contador;
        } else{
            return 0;
        }
    }

    //Determinar si se vio todos los episodios de la serie.

    public boolean  vioTodaSerie(ArrayList<Temporada> temporadas){
        boolean tempCompleta = false;
        for(int i = 0; i < temporadas.size(); i++){
            Temporada temp = temporadas.get(i);
            if(!temp.estaCompleta()){
                tempCompleta = false;
            }
        }
        return tempCompleta;
    }
    @Override
    public String toString() {
        return "Serie [nombre=" + nombre + ", genero=" + genero + ", creador=" + creador + "]";
    }

}
