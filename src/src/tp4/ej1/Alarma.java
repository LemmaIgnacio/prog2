package tp4.ej1;

public class Alarma {
    protected boolean vidrioRoto;
    protected boolean puertaAbierta;
    protected boolean movimiento;
    protected Timbre t;
    
    public Alarma(boolean vidrioRoto, boolean puertaAbierta, boolean movimiento, Timbre t) {
        this.vidrioRoto = vidrioRoto;
        this.puertaAbierta = puertaAbierta;
        this.movimiento = movimiento;
        this.t = t;
    }

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }
    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    public boolean isMovimiento() {
        return movimiento;
    }
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public void comprobar(){
        vidrioRoto = estanRobando();
        puertaAbierta = estanRobando();
        movimiento = estanRobando();
        if (vidrioRoto || puertaAbierta || movimiento) {
            t.hacerSonar();
        } else {
            System.out.println("Todo en orden.");
        }
    }

    public boolean estanRobando(){
        int stealers = (int)(Math.random()*10) + 1;
        if (stealers > 2) {
            return true;
        }
        return false;
    }

}
