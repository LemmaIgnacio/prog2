package tp6.ej1;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", new java.util.ArrayList<>());
        Cliente cliente2 = new Cliente("Ana", new java.util.ArrayList<>());

        // Crear películas
        Pelicula.setCantidadCopias(2);
        Pelicula peli1 = new Pelicula("Matrix");
        Pelicula peli2 = new Pelicula("Titanic");

        // Crear vehículos
        Vehiculo auto1 = new Vehiculo("Toyota", "ABC123", 50000, "naftero", false);
        Vehiculo auto2 = new Vehiculo("Renault", "XYZ789", 30000, "eléctrico", false);

        // Crear videoclub
        java.util.ArrayList<Item> items = new java.util.ArrayList<>();
        items.add(peli1);
        items.add(peli2);
        items.add(auto1);
        items.add(auto2);
        java.util.ArrayList<Cliente> clientes = new java.util.ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        Videoclub videoclub = new Videoclub(items, clientes);

        // Alquilar película y auto
        peli1.alquilar(cliente1);
        auto1.alquilar(cliente2);

        // Mostrar alquileres de cada cliente
        System.out.println("Alquileres de Juan:");
        for (Item i : cliente1.getItemAlquilado()) {
            System.out.println(i.getClass().getSimpleName());
        }
        System.out.println("Alquileres de Ana:");
        for (Item i : cliente2.getItemAlquilado()) {
            System.out.println(i.getClass().getSimpleName());
        }

        // Probar devolución
        cliente1.devolverItem(peli1);
        System.out.println("Alquileres de Juan tras devolución:");
        for (Item i : cliente1.getItemAlquilado()) {
            System.out.println(i.getClass().getSimpleName());
        }
    }
}
