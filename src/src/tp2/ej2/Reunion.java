package tp2.ej2;

import java.util.ArrayList;

public class Reunion {
    private ArrayList<Asistente> participantes;
    private String lugar;
    private String tema;
    private int hora;
    private int duracion;

    public Reunion(String lugar, String tema, int hora, int duracion) {
        this.lugar = lugar;
        this.tema = tema;
        this.hora = hora;
        this.duracion = duracion;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Asistente asistente) {
        participantes.add(asistente);
    }

    public ArrayList<Asistente> getParticipantes() {
        return participantes;
    }

    public String getLugar() {
        return lugar;
    }

    public String getTema() {
        return tema;
    }

    public int getHora() {
        return hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getHoraFin() {
        return hora + duracion;
    }

    @Override
    public String toString() {
        String resultado = "Reunión: " + tema + "\n";
        resultado += "Lugar: " + lugar + "\n";
        resultado += "Hora: " + hora + ":00 a " + getHoraFin() + ":00\n";
        resultado += "Participantes:\n";
        for (Asistente a : participantes) {
            resultado += "  - " + a + "\n";
        }
        return resultado;
    }
}
