package tp6.ej2;
import java.util.ArrayList;

public class CentroDeComputo {
    private ArrayList<Proceso> procesos = new ArrayList<>();

    public CentroDeComputo() {
        procesos = new ArrayList<>();
    }

    public ArrayList<Proceso> getProcesos(){
        return new ArrayList<>(procesos);
    }

    public void agregarProceso(Proceso p) {
        procesos.add(p);
    }

    public void mostrarProcesos() {
        for (Proceso p : getProcesos()) {
            System.out.println("Tareas en orden de ejecución (por memoria):");
            for (Tarea t : p.tareas) {
                System.out.println(t.getNombre() + " - Memoria: " + t.getMemoria());
            }
        }
    }
}
