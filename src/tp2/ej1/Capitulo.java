public class Capitulo {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private double calificacion;


    //CONSTRUCTORES
    public Capitulo(String titulo){
        this.titulo = titulo;
        this.descripcion = " ";
        this.flag = false;
        this.calificacion = -1;
    }

    public Capitulo(String titulo, String descripcion, boolean flag, 
                    double calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = calificacion;
    }
    public Capitulo(String titulo, String descripcion){
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.flag = false;
            this.calificacion = -1;
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
    //Ingresar la calificación de un episodio. Si el valor ingresado como calificación
    public void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Syntax Error");
        }
    }

}
