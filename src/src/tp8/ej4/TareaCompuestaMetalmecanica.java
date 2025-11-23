package tp8.ej4;

public class TareaCompuestaMetalmecanica extends TareaCompuesta{


    @Override
    public int getTiempo(){
        return super.getTiempo() + getSize() * 5; 
    }
}
