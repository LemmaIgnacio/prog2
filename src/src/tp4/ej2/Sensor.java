package tp4.ej2;

import java.util.ArrayList;

public class Sensor {
    private ArrayList<String> sensores;
    private String zona;

    public Sensor(ArrayList<String> sensores, String zona) {
        this.sensores = sensores;
        this.zona = zona;
    }

    
    public ArrayList<String> getSensores() {
        return sensores;
    }


    public void setSensores(ArrayList<String> sensores) {
        this.sensores = sensores;
    }


    public String getZona() {
        return zona;
    }


    public void setZona(String zona) {
        this.zona = zona;
    }


    public boolean hayProblema(){
        System.out.println(getZona());
        for(String sensor : sensores){
            if (3 < (int) (Math.random()*4 + 1)) {
                System.out.println(sensor + " detecto algo");
                return true;
            }else{
                System.out.println(sensor + " no problemas");
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "Sensor [sensores=" + sensores + "]";
    }

}
