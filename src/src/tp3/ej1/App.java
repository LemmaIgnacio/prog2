package tp3.ej1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan", 1, 3);
        Empleado empleado2 = new Empleado("Maria", 2, 5);

        // Crear personas
        Persona persona1 = new Persona("Carlos", 12345678);
        Persona persona2 = new Persona("Ana", 87654321);

        // Crear preguntas
        ArrayList<String> preguntas = new ArrayList<>();
        preguntas.add("¿Cuál es tu edad?");
        preguntas.add("¿Cuál es tu ocupación?");

        // Crear encuestas
        ArrayList<Persona> personasEncuesta1 = new ArrayList<>();
        Encuesta encuesta1 = new Encuesta(1, preguntas, empleado1, personasEncuesta1, false);

        ArrayList<Persona> personasEncuesta2 = new ArrayList<>();
        Encuesta encuesta2 = new Encuesta(2, preguntas, empleado2, personasEncuesta2, false);

        // Completar encuestas
        encuesta1.completar(persona1);
        encuesta1.completar(persona1); // Intento de completar la misma encuesta nuevamente
        encuesta2.completar(persona2);

        // Verificar si una persona respondió una encuesta
        System.out.println("¿Carlos respondió la encuesta 1? " + encuesta1.fueRespondidaPor(persona1));
        System.out.println("¿Carlos respondió la encuesta 2? " + encuesta2.fueRespondidaPor(persona1));

        System.out.println("¿Ana respondió la encuesta 2? " + encuesta2.fueRespondidaPor(persona2));
        // Mostrar cantidad de encuestas realizadas por cada empleado
        System.out.println("Encuestas realizadas por Juan: " + empleado1.getCantEncuestas());
        System.out.println("Encuestas realizadas por Maria: " + empleado2.getCantEncuestas());

        System.out.println(empleado1.getNombre() + " tiene un bono:  " + empleado1.obtienePlus());
        System.out.println(empleado2.getNombre() + " tiene un bono:  " + empleado2.obtienePlus());

    }
}
