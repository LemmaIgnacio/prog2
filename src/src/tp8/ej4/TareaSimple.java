package tp8.ej4;

import java.util.ArrayList;

public class TareaSimple extends Tarea {
    private String accion;
    private int costo;
    private int tiempo;

    public TareaSimple(String accion, int costo, int tiempo){
        this.accion = accion;
        this.costo = costo;
        this.tiempo = tiempo;
    }

    @Override
    public int getCosto(){ return costo; }

    @Override
    public int getTiempo(){ return tiempo; }

    @Override
    public ArrayList<String> getAcciones(){
        ArrayList<String> res = new ArrayList<>();
        res.add(accion);
        return res;
    }

    @Override
    public int getSize(){
        return 1;
    }
}




