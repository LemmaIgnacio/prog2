package tp4.ej1;

public class AlarmaSonora extends Alarma {
    private Luz z;
    public AlarmaSonora (boolean vidrioRoto, boolean puertaAbierta, boolean movimiento, Timbre t, Luz z){
        super(vidrioRoto, puertaAbierta, movimiento, t);
        this.z = z;
    }
    @Override
    public void comprobar(){
        vidrioRoto = estanRobando();
        puertaAbierta = estanRobando();
        movimiento = estanRobando();
        if (vidrioRoto || puertaAbierta || movimiento) {
            t.hacerSonar();
            z.encender();
        } else {
            System.out.println("Todo en orden.");
        }
    }
}
