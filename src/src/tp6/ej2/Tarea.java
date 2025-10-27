package tp6.ej2;

public class Tarea {
    private String nombre;
    private int prioridad;
    private double memoria;
    private double cpu;

    public Tarea(String nombre, int prioridad, double memoria, double cpu) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.memoria = memoria;
        this.cpu = cpu;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public double getMemoria() {
        return memoria;
    }

    public double getCpu() {
        return cpu;
    }
    public void ejecutarTarea() {
        System.out.println("Ejecutando tarea: " + nombre);
    }
}

