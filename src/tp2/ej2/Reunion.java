import java.time.LocalTime;
import java.util.ArrayList;
public class Reunion {
    private String lugar;
    private int duracion;
    private LocalTime horaInicio;
    private ArrayList<Usuario> usuarios;
    
    public Reunion(String lugar, int duracion, LocalTime horaInicio, ArrayList<Usuario> usuarios) {
        this.lugar = lugar;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.usuarios = usuarios;
    }

    public Reunion() {
        this("Lugar", 0, LocalTime.of(0,0), new ArrayList<Usuario>());
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Reunion [lugar=" + lugar + ", duracion=" + duracion + ", horaInicio=" + horaInicio + ", usuarios="
                + usuarios + "]";
    }

    
}
