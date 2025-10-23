package tp4.ej2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Timbre t = new Timbre();
        Luz z = new Luz();

        ArrayList<String> sensoresCasa = new ArrayList<>();
        sensoresCasa.add("vidrioRoto");
        sensoresCasa.add("puertaAbierta");
        sensoresCasa.add("movimiento");

        Sensor s1 = new Sensor(sensoresCasa, "casa");
        ArrayList<Sensor> listaSensores = new ArrayList<>();
        listaSensores.add(s1);
        Alarma a1 = new Alarma(t, listaSensores);
        a1.comprobar();
        System.err.println("---------");
        AlarmaSonora as1 = new AlarmaSonora(t, listaSensores, z);
        as1.comprobar();
    }

}
