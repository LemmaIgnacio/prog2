package tp5.ej5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Minerales especiales
        ArrayList<String> mineralesEspeciales = new ArrayList<>();
        mineralesEspeciales.add("Nitrógeno");
        mineralesEspeciales.add("Fósforo");
        mineralesEspeciales.add("Potasio");

        // Lotes
        ArrayList<String> mineralesLote1 = new ArrayList<>();
        mineralesLote1.add("Nitrógeno");
        mineralesLote1.add("Fósforo");
        mineralesLote1.add("Calcio");
        Lote lote1 = new Lote("Lote 1", 60, mineralesLote1, mineralesEspeciales);

        ArrayList<String> mineralesLote2 = new ArrayList<>();
        mineralesLote2.add("Calcio");
        mineralesLote2.add("Magnesio");
        Lote lote2 = new Lote("Lote 2", 40, mineralesLote2, mineralesEspeciales);

        // Cereales
        ArrayList<String> mineralesMaiz = new ArrayList<>();
        mineralesMaiz.add("Nitrógeno");
        mineralesMaiz.add("Fósforo");
        Cereal maiz = new Cereal("Maíz", mineralesMaiz, "gruesa");

        ArrayList<String> mineralesTrigo = new ArrayList<>();
        mineralesTrigo.add("Calcio");
        Cereal trigo = new Cereal("Trigo", mineralesTrigo, "fina");

        ArrayList<String> mineralesAlfalfa = new ArrayList<>();
        mineralesAlfalfa.add("Nitrógeno");
        mineralesAlfalfa.add("Calcio");
        Cereal alfalfa = new Cereal("Alfalfa", mineralesAlfalfa, "pastura");

        ArrayList<Cereal> cereales = new ArrayList<>();
        cereales.add(maiz);
        cereales.add(trigo);
        cereales.add(alfalfa);

        ArrayList<Lote> lotes = new ArrayList<>();
        lotes.add(lote1);
        lotes.add(lote2);

        // 1) Qué cereales pueden sembrarse en un lote
        System.out.println("Cereales que pueden sembrarse en Lote 1:");
        for (Cereal c : cereales) {
            if (lote1.puedeSembrar(c)) {
                System.out.println(c.getNombre());
            }
        }

        // 2) En qué lotes se puede sembrar un cereal
        System.out.println("\nLotes donde se puede sembrar Alfalfa:");
        for (Lote l : lotes) {
            if (alfalfa.puedeSembrarseEn(l)) {
                System.out.println(l.getNombre());
            }
        }

        // 3) Determinar si un lote es especial o común
        System.out.println("\n¿Lote 1 es especial? " + lote1.esEspecial());
        System.out.println("¿Lote 2 es especial? " + lote2.esEspecial());
    }
}
