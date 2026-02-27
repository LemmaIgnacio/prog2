import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private final int CALORIAS_MAXIMAS;
    private ArrayList<Elemento> listaComidas = new ArrayList<>();
    private Condicion preferencias;

    public Cliente(String nombre, int calorias, Condicion preferencias) {
        this.nombre = nombre;
        this.CALORIAS_MAXIMAS = calorias;
        this.preferencias = preferencias;
    }

    public void agregarComida(Elemento e) {
        listaComidas.add(e);
    }

    public ArrayList<Elemento> recomendar(ArrayList<Elemento> elementos) {
        ArrayList<Elemento> recomendaciones = new ArrayList<>();
        for (Elemento e : elementos) {
            if (!listaComidas.contains(e) && preferencias.cumple(e)) {
                recomendaciones.add(e);
            }
        }
        return recomendaciones;
    }
}