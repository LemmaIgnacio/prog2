package final13febrero026;
import final13febrero026.condiciones.Condicion;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    protected String titulo;
    protected LocalDate fecha;

    public Elemento(String titulo, LocalDate fecha){
        this.titulo = titulo;
        this.fecha = fecha;
    }
//getters y setters de titulo y fecha

public abstract  int getCantFotos();
public abstract int getTamanio();
public abstract ArrayList<String> getListaPersonas();
public abstract Elemento copia(Condicion c);
public abstract Fotografia buscarPrimerFoto(Condicion c);
}
