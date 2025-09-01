import java.util.ArrayList;
public class Agenda {
    private ArrayList <Reunion> reuniones;
    private Usuario usuarioProprietario;
    
    
    public Agenda(ArrayList<Reunion> reuniones, Usuario usuarioProprietario) {
        this.reuniones = reuniones;
        this.usuarioProprietario = usuarioProprietario;
    }

    public Agenda() {
        this(new ArrayList<Reunion>(), new Usuario());
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }
    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }
    public Usuario getUsuarioProprietario() {
        return usuarioProprietario;
    }
    public void setUsuarioProprietario(Usuario usuarioProprietario) {
        this.usuarioProprietario = usuarioProprietario;
    }

    public boolean agregarReunion(Reunion nuevaReunion) {
        if (seSuperpone(nuevaReunion)) {
            System.out.println("No se puede agendar la reunion " + nuevaReunion.getLugar() +", ya hay una reunión en ese horario.");
            return false;
        } else {
            reuniones.add(nuevaReunion);
            System.out.println("Reunión agregada exitosamente: " + nuevaReunion.getLugar());
            return true;
        }
    }
    

    public boolean seSuperpone (Reunion nuevaReunion){
        boolean hayReunion = false;
        for(int i = 0; i < reuniones.size(); i++){
            Reunion existente = reuniones.get(i);
            if (nuevaReunion.getHoraInicio().isBefore(existente.getHoraInicio().plusMinutes(existente.getDuracion())) 
                    &&
                nuevaReunion.getHoraInicio().plusMinutes(nuevaReunion.getDuracion()).isAfter(existente.getHoraInicio())){
                hayReunion = true;
            }
        }
        return hayReunion;
    }

    public void mostrarAgenda() {
        for (int i = 0; i < reuniones.size(); i++) {
            Reunion r = reuniones.get(i);
            System.out.println("Reunión " + (i + 1) + ": " + r.getLugar() + 
                                " | hora inicio: " + r.getHoraInicio() + 
                                " | duración: " + r.getDuracion() + " min");
    
            System.out.println("Participantes:");
            for (int j = 0; j < r.getUsuarios().size(); j++) {
                Usuario u = r.getUsuarios().get(j);
                if (u.isEsAsistente()) {
                    System.out.println("Asistente: " + u.getNombre() + " | Email: " 
                        + u.getEmail() + " | Tel: " + u.getTelefono());
                } else {
                    System.out.println("Participante: " + u.getNombre());
                }
            }
            
            System.out.println();
        }
    }
    
    }
    
    


