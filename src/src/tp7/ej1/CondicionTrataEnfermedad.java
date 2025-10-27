package tp7.ej1;

public class CondicionTrataEnfermedad extends Condicion {
    private Enfermedad enfermedad;

    public CondicionTrataEnfermedad(Enfermedad e) {
        this.enfermedad = e;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return a.puedeTratar(enfermedad);
    }
}
