package tp6.ej2;

import java.util.ArrayList;

public abstract class Proceso {
    protected ArrayList<Tarea> tareas;

    public Proceso(){
        tareas = new ArrayList<>();
    }

    public void addTarea(Tarea tarea) {
        int i = 0;
        while (i < tareas.size() && compare(tarea, tareas.get(i))) {
            i++;
        }
        tareas.add(i, tarea);
    }

    public abstract boolean compare(Tarea t1, Tarea t2);

}
