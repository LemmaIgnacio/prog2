package tp4.ej5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    Producto p1 = new Producto("Fresco","Huevos de gallina blancos", 12, "2025-10-01", "Granja Don Juan", "2025-10-10", 12345, 101);
    ProdCongeladoPorAgua p2 = new ProdCongeladoPorAgua("Congelado Agua", "2025-09-15", 20, "Papas fritas congeladas", "2026-03-15", "Congelados S.A.", 54321, 202, "Agua mineral");
    ProdCongeladoPorAire p3 = new ProdCongeladoPorAire("Congelado Aire", "2025-08-20", 15, "Arvejas congeladas", "2026-02-20", "Campo Verde", 67890, 303, 21, 3, 78, 94);
    ProdCongeladoPorNitrogeno p4 = new ProdCongeladoPorNitrogeno("Congelado Nitrógeno", "2025-07-10", 8, "Hamburguesas de pollo", "2026-01-10", "Pollos del Sur", 98765, 404, -18);
    Producto p5 = new Producto("Refrigerado","Milanesas de pollo", 6, "2025-10-05", "Carnes Frescas", "2025-10-20", 11223, 505);

        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(p1);
        listaDeProductos.add(p2);
        listaDeProductos.add(p3);
        listaDeProductos.add(p4);
        listaDeProductos.add(p5);

        Avicola a1 = new Avicola(listaDeProductos);
        a1.mostrarProductos();
    }

}
