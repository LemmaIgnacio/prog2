package tp6.ej2;

public class ProcesoPorMemoria extends Proceso {

    @Override
    public boolean compare(Tarea t1, Tarea t2) {
        return t1.getMemoria() < t2.getMemoria();
    }
}


