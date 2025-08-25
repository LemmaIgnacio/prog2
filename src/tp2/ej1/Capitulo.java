public class Capitulo {
    String titulo;
    String descripcion;
    String flag;
    double calificacion;


    public Capitulo(String titulo){
        this.titulo = titulo;
        this.descripcion = " ";
        this.flag = "No visto";
        this.calificacion = -1;
    }

    public Capitulo(String titulo, String descripcion, String flag, 
                    double calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = calificacion;
    }

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

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Syntax Error");
        }
    }
}
