package tp8.ej4;

import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta {
    private int repeticiones;

    public TareaCompuestaRepetitiva(int repeticiones){
        this.repeticiones = repeticiones;
    }

    @Override
    public int getCosto(){
        return super.getCosto() * repeticiones;
    }

    @Override
    public int getTiempo(){
        return super.getTiempo() * repeticiones;
    }

    @Override
    public ArrayList<String> getAcciones(){
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < repeticiones; i++)
            res.addAll(super.getAcciones());
        return res;
    }

    @Override
    public int getSize() {
        return super.getSize() * repeticiones;
    }
}
