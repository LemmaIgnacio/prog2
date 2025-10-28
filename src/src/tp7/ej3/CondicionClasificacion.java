package tp7.ej3;

public class CondicionClasificacion extends Condicion {
    private String clas;

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public CondicionClasificacion(String clas) {
        this.clas = clas;
    }
    
    @Override
    public boolean cumple(Planta p){
        return p.getClasificacionSuperior().equals(clas);
    }
}
