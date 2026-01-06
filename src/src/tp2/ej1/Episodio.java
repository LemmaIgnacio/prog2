public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int clasificacion;

    public Episodio(String titulo,String descripcion, boolean flag, int clasificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.clasificacion = clasificacion;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getClasificacion() {
        if (flag) {
            return clasificacion;    
        }
        return -1;   
    }

    public void setClasificacion(int clasificacion) {
        if (flag && clasificacion >= 0 && clasificacion <= 5) {
            this.clasificacion = clasificacion;
        }else{
            System.out.println("No se ha visto el episodio o se ha ingresado una clasificacion invalida (0-5)");
        }
    }

    public int getTamanio(){
        return 1;
    }
    
    
}
