package tp4.ej4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    Futbolista f1 = new Futbolista("Juan", "Pérez", 12345, "1995-01-01", "Viajando", 10, "derecha");
    Futbolista f2 = new Futbolista("Pedro", "Gómez", 12346, "1994-02-02", "En pais de origen", 5, "izquierda");
    Futbolista f3 = new Futbolista("Lucas", "Martínez", 12347, "1993-03-03", "concentracion", 7, "ambas");
    Futbolista f4 = new Futbolista("Sergio", "López", 12348, "1992-04-04", "Viajando", 2, "derecha");
    Futbolista f5 = new Futbolista("Matías", "Fernández", 12349, "1991-05-05", "En pais de origen", 8, "izquierda");
    Futbolista f6 = new Futbolista("Diego", "Ruiz", 12350, "1990-06-06", "concentracion", 3, "ambas");
    Futbolista f7 = new Futbolista("Nicolás", "Sosa", 12351, "1989-07-07", "Viajando", 6, "derecha");
    Futbolista f8 = new Futbolista("Ezequiel", "Torres", 12352, "1988-08-08", "En pais de origen", 4, "izquierda");
    Futbolista f9 = new Futbolista("Agustín", "Méndez", 12353, "1987-09-09", "concentracion", 9, "ambas");
    Futbolista f10 = new Futbolista("Facundo", "Silva", 12354, "1986-10-10", "Viajando", 1, "derecha");
    Futbolista f11 = new Futbolista("Tomás", "Vega", 12355, "1985-11-11", "En pais de origen", 11, "izquierda");

    Entrenador e1 = new Entrenador("Carlos", "Ramírez", 54321, "1970-12-12", "concentracion", 1001);

    Masajista m1 = new Masajista("Jorge", "Paz", 67890, "1980-01-01", "Viajando", "Fisioterapia", 15);
    Masajista m2 = new Masajista("María", "Luna", 67891, "1982-02-02", "En pais de origen", "Kinesiología", 12);

        ArrayList<Integrante> integrantes = new ArrayList<Integrante>();
        integrantes.add(f1);
        integrantes.add(f2);
        integrantes.add(f3);
        integrantes.add(f4);
        integrantes.add(f5);
        integrantes.add(f6);
        integrantes.add(f7);
        integrantes.add(f8);
        integrantes.add(f9);
        integrantes.add(f10);
        integrantes.add(f11);
        integrantes.add(e1);
        integrantes.add(m1);
        integrantes.add(m2);

        Seleccion s1 = new Seleccion(integrantes);
        s1.eventoSolidario();
    }
}
