package tp2.ej4;
import java.time.LocalDateTime;
public class Turno {
    private int cantHoras;
    private int reserva;
    private LocalDateTime fechaHora;
    private Usuario Usuario;

    public Turno(int cantHoras, int reserva, LocalDateTime fechaHora) {
        this.cantHoras = cantHoras;
        this.reserva = reserva;
        this.fechaHora = fechaHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int precioPagar(){
        if(Usuario.isEsSocio()){
            return 1;
        }
        return 0;
    }

    
}
