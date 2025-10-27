package tp7.ej2;

public class CondicionSinPalabraClave extends Condicion{
    private String palabraClave;

    
    public CondicionSinPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public String getPalabraDada() {
        return palabraClave;
    }


    public void setPalabraDada(String palabraClave) {
        this.palabraClave = palabraClave;
    }   

    @Override
    public boolean cumple(Documento d){
        return d.getPalabraClave().isEmpty();
    }
}



