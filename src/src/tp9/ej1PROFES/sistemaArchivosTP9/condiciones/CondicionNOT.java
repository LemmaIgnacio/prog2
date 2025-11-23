package sistemaArchivosTP9.condiciones;

import sistemaArchivosTP9.ElementoSA;

public class CondicionNOT extends Condicion {
    Condicion cond;

    public CondicionNOT(Condicion cond) {
        this.cond = cond;
    }

    @Override
    public boolean cumple(ElementoSA archivo) {
        return !cond.cumple(archivo);
    }
}
