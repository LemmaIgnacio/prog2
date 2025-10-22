package tp3.ej4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Juan", "Perez", "2000-01-01", "123456", "Calle 1", "juan@mail.com", "Buenos Aires", 25);
        Contacto c2 = new Contacto("Ana", "Gomez", "1995-05-05", "654321", "Calle 2", "ana@mail.com", "Córdoba", 30);
        Contacto c3 = new Contacto("Juan", "Perez", "2000-01-01", "123456", "Calle 1", "juan@mail.com", "Buenos Aires", 25); // Repetido
        Contacto c4 = new Contacto("Luis", "Martinez", "1990-03-10", "789123", "Calle 3", "luis@mail.com", "Rosario", 35);
        Contacto c5 = new Contacto("Ana", "Gomez", "1995-05-05", "654321", "Calle 2", "ana@mail.com", "Córdoba", 30); // Repetido

        ArrayList<Contacto> listaContactos = new ArrayList<>();
        listaContactos.add(c1);
        listaContactos.add(c2);
        listaContactos.add(c3);
        listaContactos.add(c4);
        listaContactos.add(c5);

        Celular cel1 = new Celular(listaContactos);

        cel1.mostrarContactos();
        System.out.println("_-------");
        cel1.mostrarContactosRepetidos();
        System.out.println("El promedio de edades de los contactos es: " + cel1.promedioEdades());
    }
}
