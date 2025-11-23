package sistemaArchivosTP9;

public class Archivo extends ElementoSA{
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }


}
