package tp7.ej2;

public class CondicionContenidoPalabraDada extends Condicion{
    private String palabraDada;

    
    public CondicionContenidoPalabraDada(String palabraDada) {
        this.palabraDada = palabraDada;
    }

    public String getPalabraDada() {
        return palabraDada;
    }


    public void setPalabraDada(String palabraDada) {
        this.palabraDada = palabraDada;
    }   

    @Override
    public boolean cumple(Documento d){
        return d.getContenidoTexual().contains(palabraDada);
    }
}


