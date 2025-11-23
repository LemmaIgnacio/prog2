package tp8.ej5;
import java.util.ArrayList;
public class PreguntaSimple extends Pregunta {
    private String enunciado;
    private int puntaje;
    private int tiempo;
    private ArrayList<String> conceptos;

    public PreguntaSimple(String enunciado, int puntaje, int tiempo){
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.conceptos = new ArrayList<>();
    }

    public void addConcepto(String p){
        conceptos.add(p);
    }

    public String getEnunciado(){
        return enunciado;
    }

    @Override
    public int getPuntaje(){
        return puntaje;
    }

    @Override
    public int getTiempo(){
        return tiempo;
    }

    @Override
    public ArrayList<String> getConceptos(){
        return new ArrayList<>(conceptos);
    }



}
