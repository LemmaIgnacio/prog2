package tp8.ej4;
import java.util.ArrayList;
public class TareaCompuesta extends Tarea {

    protected ArrayList<Tarea> tareas = new ArrayList<>();

    public void addTarea(Tarea t){
        tareas.add(t);
    }

    @Override
    public int getCosto(){
        int total = 0;
        for (Tarea t : tareas)
            total += t.getCosto();
        return total;
    }

    @Override
    public int getTiempo(){
        int total = 0;
        for (Tarea t : tareas)
            total += t.getTiempo();
        return total + getSize() * 10;
    }

    @Override
    public ArrayList<String> getAcciones(){
        ArrayList<String> res = new ArrayList<>();
        for (Tarea t : tareas)
            res.addAll(t.getAcciones());
        return res;
    }

    @Override
    public int getSize() {
        int total = 0;
        for (Tarea t : tareas)
            total += t.getSize();
        return total;
    }
}

