import java.util.ArrayList;

public  abstract class  Elemento {
    public abstract int getTiempoPreparacion();
    public abstract double getPrecio();
    public abstract int getCalorias();
    public abstract ArrayList<String> getIngredientes();
    public abstract ArrayList<Elemento> buscar (Condicion c);
}
//ELEMENTO ABSTRACTO
//GET TIEMPOPREPARACION
//GET PRECIO
//GET CALORIAS
//GET INGREDIENTES
//BUSCAR
