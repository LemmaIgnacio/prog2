
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        Capitulo c1 = new Capitulo("Piloto");
        Capitulo c2 = new Capitulo("En la penumbra");
        Capitulo c3 = new Capitulo("Exterminio");
        Capitulo c4 = new Capitulo("Solos en la nada");
        Capitulo c5 = new Capitulo("Los olvidados");
        Capitulo c6 = new Capitulo("S.A.D");
        Capitulo c7 = new Capitulo("Perdidos pero no olvidados");

        // Marcar algunos capítulos como vistos y asignar calificaciones
        c1.setFlag(true);
        c1.setCalificacion(4.5);
        c2.setFlag(true);
        c2.setCalificacion(3.0);
        c3.setFlag(true);
        c3.setCalificacion(2.1);
        c4.setFlag(true);
        c4.setCalificacion(5.0);
        c5.setFlag(true); 
        c5.setCalificacion(6.0); // calificación inválida
        c6.setFlag(false);
        c7.setCalificacion(5.0);

        Temporada t1 = new Temporada(1);
        t1.getCapitulos().add(c1);
        t1.getCapitulos().add(c2);
        t1.getCapitulos().add(c3);

        Temporada t2 = new Temporada(2);
        t2.getCapitulos().add(c4);
        t2.getCapitulos().add(c5);
        t2.getCapitulos().add(c6);
        t2.getCapitulos().add(c7);

        Temporada t3 = new Temporada(3);
        

        ArrayList<Temporada> todasTemporadas = new ArrayList<>();
        todasTemporadas.add(t1);
        todasTemporadas.add(t2);
        todasTemporadas.add(t3);

        Serie s1 = new Serie("S.A.D", "Terror", "Felipe el gordo" );


        System.out.println(s1);
        System.out.println("Episodios vistos T1: " + t1.getEpVistos());
        System.out.println("Episodios vistos T2: " + t2.getEpVistos());
        System.out.println("Episodios vistos T3: " + t3.getEpVistos());
        System.out.println("Episodios vistos Serie: " + s1.getEpVistos(todasTemporadas));

        System.out.println("Promedio calificaciones T1: " + t1.getPromedioCalificaciones());
        System.out.println("Promedio calificaciones T2: " + t2.getPromedioCalificaciones());
        System.out.println("Promedio calificaciones T3: " + t3.getPromedioCalificaciones());
        System.out.println("Promedio calificaciones Serie: " + s1.getPromedioCalificaciones(todasTemporadas));

        System.out.println("¿T1 completa?: " + t1.estaCompleta());
        System.out.println("¿T2 completa?: " + t2.estaCompleta());
        System.out.println("¿T3 completa?: " + t3.estaCompleta());
        System.out.println("¿Serie completa?: " + s1.vioTodaSerie(todasTemporadas));
    }
}
