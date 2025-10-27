package tp6.ej2;

public class App {
    public static void main(String[] args) {
        Proceso p1 = new ProcesoPorMemoria(); // ordena por memoria

        Tarea t1 = new Tarea("Backup", 3, 512, 1.5);
        Tarea t2 = new Tarea("Antivirus", 5, 256, 0.8);
        Tarea t3 = new Tarea("Render", 2, 1024, 2.5);

        p1.addTarea(t1);
        p1.addTarea(t2);
        p1.addTarea(t3);

        CentroDeComputo centro = new CentroDeComputo();
        centro.agregarProceso(p1);
        centro.mostrarProcesos();
    }
}

