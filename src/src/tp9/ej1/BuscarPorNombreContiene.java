package tp9.ej1;

public class BuscarPorNombreContiene extends Condicion {
    private String texto;

    public BuscarPorNombreContiene(String texto){
        this.texto = texto;
    }

    @Override
    public boolean cumple(SistemaArchivos e){
        return e.getNombre().contains(texto);
    }
}

