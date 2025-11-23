package sistemaArchivosTP9.condiciones;

import sistemaArchivosTP9.ElementoSA;

public class CondicionOR extends Condicion {
    Condicion cond1, cond2;

    public CondicionOR(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(ElementoSA archivo) {
        return cond1.cumple(archivo) || cond2.cumple(archivo);
    }
}
