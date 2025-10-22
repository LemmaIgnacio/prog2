package tp4.ej1;

public class App {
    public static void main(String[] args) {
        Timbre t = new Timbre();
        Luz z = new Luz();
        Alarma a1 = new Alarma(false, false, false, t);
        a1.comprobar();
        System.err.println("---------");
        AlarmaSonora as1 = new AlarmaSonora(false, false, false, t, z);
        as1.comprobar();
    }

}
