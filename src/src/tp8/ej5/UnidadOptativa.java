package tp8.ej5;

public class UnidadOptativa extends Unidad {

    @Override
    public int getPuntaje(){
        int mayor = 0;
        for(Pregunta p : preguntas){
            if (mayor < p.getPuntaje()) {
                mayor = p.getPuntaje();
            }
        }
        return mayor;
    }

    @Override
    public int getTiempo(){
        int mayor = 0;
        for(Pregunta p : preguntas){
            if (mayor < p.getTiempo()) {
                mayor = p.getTiempo();
            }
        }
        return mayor;
    }
}
