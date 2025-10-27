package tp7.ej2;

public class CondicionPalabraDadaEnTitulo extends Condicion{
    private String palabraDada;

    
    public CondicionPalabraDadaEnTitulo(String palabraDada) {
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
        return d.getNombre().contains(palabraDada);
    }

}
