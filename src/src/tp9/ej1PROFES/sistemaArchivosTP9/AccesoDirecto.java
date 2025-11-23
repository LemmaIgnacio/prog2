package sistemaArchivosTP9;


public class AccesoDirecto extends ElementoSA {

    private static double tamanio = 1.0;
    private ElementoSA loQueApunta; //el destino del AD
    private static final String PREFIJO = "Acceso directo a ";

    public AccesoDirecto(ElementoSA loQueApunta) {
        super(PREFIJO +loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

}
