import java.time.LocalTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Felipe", "+54 2494 12 3355", "felipe@gmail.com", true);
        Usuario u2 = new Usuario("Lula", "+54 11 87654321", "patitaslulaibanez@gmail.com", false);
        Usuario u3 = new Usuario("Manuuuuuuuuuuuuuuu", "+512 12211344", "manuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu@gmail.com", true);
        Usuario u4 = new Usuario("Jeremiah", "+234 44332211", "JeremiahFisher@gmail.com", false);

        ArrayList<Usuario> usuariosReunion1 = new ArrayList<>();
        usuariosReunion1.add(u1);
        usuariosReunion1.add(u2);
        Reunion r1 = new Reunion("Sala A", 120, LocalTime.of(10, 0), usuariosReunion1);

        ArrayList<Usuario> usuariosReunion2 = new ArrayList<>();
        usuariosReunion2.add(u3);
        usuariosReunion2.add(u4);
        usuariosReunion2.add(u1);
        usuariosReunion2.add(u2);
        Reunion r2 = new Reunion("Sala B", 30, LocalTime.of(18, 0), usuariosReunion2);

        ArrayList<Usuario> usuariosReunion3 = new ArrayList<>();
        usuariosReunion3.add(u3);
        usuariosReunion3.add(u4);
        Reunion r3 = new Reunion("Sala C", 45, LocalTime.of(10, 30), usuariosReunion2);

        ArrayList<Reunion> reuniones = new ArrayList<>();
        Agenda agenda = new Agenda(reuniones, u1);
        agenda.agregarReunion(r1);
        agenda.agregarReunion(r2);
        agenda.agregarReunion(r3); // Esta debería superponerse con r1
        
        agenda.mostrarAgenda();
        System.out.println("La reunion 3 se superpone con otra:  " + agenda.seSuperpone(r3));


    }
}
