package recuperatorios.veinteveintidos;

import java.util.ArrayList;

public class Cliente{
    private String nombre;
    private int dni;
    private String apellido;
    private ArrayList<Equipo> equiposAlquilados;
    
    public Cliente(String nombre, int dni, String apellido, ArrayList<Equipo> equiposAlquilados) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.equiposAlquilados = equiposAlquilados;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

        public void alquilarEquipo(Equipo e) {
        // evita duplicados
        if (!equiposAlquilados.contains(e)) {
            equiposAlquilados.add(e);
        }
    }

    public int getCantidadEquipos() {
        return equiposAlquilados.size();
    }

    public ArrayList<Equipo> getEquiposAlquilados() {
        ArrayList<Equipo> copia = new ArrayList<>(equiposAlquilados);
        return copia;
    }
    
    
}
