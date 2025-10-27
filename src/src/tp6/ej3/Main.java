package tp6.ej3;

public class Main {
    public static void main(String[] args) {
        ColaOrdenada colaBarco = new ColaOrdenada();
        ColaOrdenada colaCamion = new ColaOrdenada();

    colaBarco.agregar(new Barco("Titanic", 8000));
    colaBarco.agregar(new Barco("Andromeda", 12000));
    colaBarco.agregar(new Barco("Mercurio", 10000));
    colaCamion.agregar(new Camion("Santa Rosa", java.time.LocalDate.of(2025, 10, 20)));
    colaCamion.agregar(new Camion("Santa Fé", java.time.LocalDate.of(2025, 10, 18)));
    colaCamion.agregar(new Camion("Santa Catalina", java.time.LocalDate.of(2025, 10, 22)));

        System.out.println("=== Barcos ordenados ===");
        colaBarco.mostrar();
        System.out.println("=== Camiones ordenados ===");
        colaCamion.mostrar();
    }
}
