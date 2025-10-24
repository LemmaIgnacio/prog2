package tp5.ej1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    Planta p1 = new Planta("Rosa rubiginosa", "Rosa mosqueta", "Argentina", "2023-05-10");
    Planta p2 = new Planta("Ficus benjamina", "Ficus", "India", "2022-11-22");
    Planta p3 = new Planta("Lavandula angustifolia", "Lavanda", "Francia", "2024-01-15");
    Planta p4 = new Planta("Citrus limon", "Limón", "España", "2023-09-30");
    Planta p5 = new Planta("Aloe vera", "Aloe", "África", "2021-03-05");

        ArrayList<Planta> plantas = new ArrayList<>();
        plantas.add(p1);
        plantas.add(p2);
        plantas.add(p3);
        plantas.add(p4);
        plantas.add(p5);

        Jardin j1 = new Jardin(plantas);

        j1.mostrarPlantas();

    }
}
