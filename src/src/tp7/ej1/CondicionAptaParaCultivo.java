package tp7.ej1;

public class CondicionAptaParaCultivo extends Condicion {
    private Cultivo cultivo;

    public CondicionAptaParaCultivo(Cultivo c) {
        this.cultivo = c;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return !a.desaconsejadoEn(cultivo.getNombre());
    }
}
