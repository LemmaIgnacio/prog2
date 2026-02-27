public class CondicionAnio implements Condicion {
    private int fechaSalida;

    public CondicionAnio(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public boolean cumple(Elemento e){
        return e.getAnio() == fechaSalida;
    }

}
