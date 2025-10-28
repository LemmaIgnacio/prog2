package tp7.ej3;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombreVulgar;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String tipo;
    private int riego;
    private int sol;

    public Planta(String nombreCientifico, ArrayList<String> nombreVulgar, String clasificacionSuperior, String familia,
            String clase, String tipo, int riego, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.tipo = tipo;
        this.riego = riego;
        this.sol = sol;
    }

    public ArrayList<String> getNombreVulgar(){
        return new ArrayList<>(nombreVulgar);
    }

    public void setNombreVulgar(ArrayList<String> nombreVulgar){
        this.nombreVulgar = new ArrayList<> (nombreVulgar);
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    
    
}
