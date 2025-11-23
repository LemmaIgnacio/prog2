package tp8.ej5;

public class UnidadSecuencial extends Unidad {

    @Override
    public int getPuntaje(){
        int total = 0;
        for(Pregunta p : preguntas){
            total += p.getPuntaje();
        }
        return total;
    }

    @Override
    public int getTiempo(){
        int total = 0;
        for(Pregunta p : preguntas){
            total += p.getTiempo();
        }
        return total;
    }

}
