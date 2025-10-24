package tp5.ej1;

public class Planta {
    private String nombreCientifico;
    private String normbre;
    private String paisOrigen;
    private String fechaCompra;
    private int id;
    private static int contador = 1;
    
    public Planta(String nombreCientifico, String normbre, String paisOrigen, String fechaCompra) {
        this.nombreCientifico = nombreCientifico;
        this.normbre = normbre;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
        this.id = contador;
        contador++;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNormbre() {
        return normbre;
    }

    public void setNormbre(String normbre) {
        this.normbre = normbre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Planta [Id " + getId() + ", nombreCientifico=" + nombreCientifico + ", normbre=" + normbre + ", paisOrigen=" + paisOrigen
                + ", fechaCompra=" + fechaCompra +"]";
    }

    
    

}
