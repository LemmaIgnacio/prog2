package tp4.ej2;

import java.util.ArrayList;

public class AlarmaSonora extends Alarma {
    private Luz z;
    public AlarmaSonora (Timbre t, ArrayList<Sensor> sensores, Luz z){
        super(t, sensores);
        this.z = z;
    }
    @Override
     public void comprobar (){
        for (Sensor sensor : sensores) {
            if (sensor.hayProblema()) {
                t.hacerSonar();
                z.encender();
            }else{
                System.out.println("todo bien");
            }
        }
    }
}
