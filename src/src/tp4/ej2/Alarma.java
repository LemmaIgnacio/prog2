package tp4.ej2;

import java.util.ArrayList;

public class Alarma {
    
    protected Timbre t;
    protected ArrayList<Sensor> sensores;

    public Alarma(Timbre t, ArrayList<Sensor> sensores) {
        this.t = t;
        this.sensores = sensores;
    }

    public Timbre getT() {
        return t;
    }

    public void setT(Timbre t) {
        this.t = t;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void comprobar (){
        for (Sensor sensor : sensores) {
            if (sensor.hayProblema()) {
                t.hacerSonar();
            }else{
                System.out.println("todo bien");
            }
        }
    }
    
    

} 