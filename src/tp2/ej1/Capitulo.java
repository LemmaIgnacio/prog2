public class Capitulo {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private double calificacion;
    private static final int CALIFICACION_POR_DEFAULT = -1;

    //CONSTRUCTORES
    public Capitulo(String titulo) {
        this(titulo, " ", false, CALIFICACION_POR_DEFAULT);  
    }

    public Capitulo(String titulo, String descripcion) {
        this(titulo, descripcion, false, CALIFICACION_POR_DEFAULT);  
    }

    public Capitulo(String titulo, String descripcion, boolean flag, double calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = calificacion;
    }

    //GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Ingresar la calificación de un episodio. 
    //Si el valor ingresado como calificació
    //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior
    public void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("El capitulo: "+ this.titulo + " ha insertado una calificacion incorrecta (0-5)");
        }
    }

}
