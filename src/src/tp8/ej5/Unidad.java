package tp8.ej5;

import java.util.ArrayList;

public abstract class Unidad extends Pregunta {
    protected ArrayList<Pregunta> preguntas;

    public Unidad(){
        this.preguntas = new ArrayList<>();
    }

    public void addPregunta(Pregunta p){
        preguntas.add(p);
    }

    public ArrayList<Pregunta> getPreguntas(){
        return new ArrayList<>(preguntas);
    }

    @Override
    public ArrayList<String> getConceptos(){
        ArrayList<String> res = new ArrayList<>();
        for(Pregunta p : preguntas){
            for(String concepto : p.getConceptos()){
                if (!res.contains(concepto)) {
                    res.add(concepto);
                }
            }
        }
        return res;
    }


    public abstract int getPuntaje();
    public abstract int getTiempo();

}
