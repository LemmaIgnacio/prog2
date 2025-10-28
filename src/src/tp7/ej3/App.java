package tp7.ej3;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        ArrayList<String> nv = new ArrayList<>();
        nv.add("lengua de suegra");
        nv.add("no se");
        Planta p1 = new Planta("PLANTA1", nv, "crassula", "manin minin", "minin manin", "interior", 6, 1);

        ArrayList<Planta> p = new ArrayList<>();
        p.add(p1);
        Vivero v1 = new Vivero(p);

    Condicion c1 = new CondicionNombre("PLANTA1");
    System.out.println("a) Todas las plantas cuyo nombre científico incluya la palabra 'auereum'");
    v1.mostrarPlantas(c1);

    Condicion c2 = new CondicionNombreVulgar("lengua de suegra");
    System.out.println("b) Todas las plantas a las que se conozca vulgarmente como 'lengua de suegra'");
    v1.mostrarPlantas(c2);

    Condicion c3 = new CondicionClasificacion("crassula");
    System.out.println("c) Todas las plantas cuya clasificación sea 'Crassula'");
    v1.mostrarPlantas(c3);
    
    Condicion c4Sol = new CondicionSolMayor(5);
    Condicion c4Riego = new CondicionRiegoMenor(3);
    Condicion c4 = new CondicionSolAndRiego(c4Sol,c4Riego);
    System.out.println("d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3");
    v1.mostrarPlantas(c4);

    Condicion c5 = new CondicionSolAndRiego(new CondicionSolMenor(4), new CondicionRiegoMayor(4));
    System.out.println("e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4");
    v1.mostrarPlantas(c5);

    Condicion c6 = new CondicionSolAndRiego(new CondicionTipo("interior"), new CondicionRiegoMenor(3));
    System.out.println("f) Todas las plantas de interior que necesiten poco riego (inferior a 3)");
    v1.mostrarPlantas(c6);
    }
}
