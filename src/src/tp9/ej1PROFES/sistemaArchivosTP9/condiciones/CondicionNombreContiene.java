package sistemaArchivosTP9.condiciones;

import sistemaArchivosTP9.ElementoSA;

public class CondicionNombreContiene extends Condicion {
    private String substringQueBusco;

    public CondicionNombreContiene(String substringQueBusco) {
        this.substringQueBusco = substringQueBusco;
    }

    @Override
    public boolean cumple(ElementoSA archivo) {
        return archivo.getNombre().contains(substringQueBusco);
    }
}
