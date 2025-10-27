package tp6;

public abstract class Item {
    protected String fechaVencimiento;
    protected Cliente clienteAquiler;

    public abstract boolean puedeAlquilar();

    public abstract void alquilar(Cliente c);

    public boolean estaVencido(String fechaActual){
        if (fechaVencimiento.equals(fechaActual)) {
            return false;
        }
        return true;
    }

    public Cliente getClienteAquiler() {
        return clienteAquiler;
    }
    
}
