package tp7.ej3;

public class CondicionNombreVulgar extends Condicion {
    private String nombreV;


    public CondicionNombreVulgar(String nombreV) {
        this.nombreV = nombreV;
    }
    public String getNombreV() {
        return nombreV;
    }
    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    @Override
    public boolean cumple(Planta p){
        return p.getNombreVulgar().contains(nombreV);
    }

}
