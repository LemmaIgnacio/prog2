package sistemaArchivosTP9.condiciones;
import sistemaArchivosTP9.ElementoSA;

public class CondicionNombreIgual extends Condicion {
    String nombreQueBusco;

    public CondicionNombreIgual(String nombreQueBusco) {
        this.nombreQueBusco = nombreQueBusco;
    }

    @Override
    public boolean cumple(ElementoSA elemento) {
        return elemento.getNombre().equals(nombreQueBusco);
    }
}
