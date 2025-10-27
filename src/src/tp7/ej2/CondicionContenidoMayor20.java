package tp7.ej2;

public class CondicionContenidoMayor20 extends Condicion {

    @Override
    public boolean cumple(Documento d){
        return d.getContenidoTexual().length() >= 20;
    }
}
