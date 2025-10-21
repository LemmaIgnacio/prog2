package tp3.ej3;

public class App {
    public static void main(String[] args) {

        Villano v1 = new Villano("Mana", "El ñucu", false, 90, 1, 1, 1);
        Villano v2 = new Villano("Mani", "El ñucu", false, 90, 1, 1, 1);
        Heroe h1 = new Heroe("Moris jijiju", "El raton", true, 100, 10, 10, 10);
        Heroe h2 = new Heroe("Manin Minin", "Manin Minin", true, 100, 10, 10, 10);
        
        Juego j1 = new Juego(h1, v1);
        Juego2v2 j2 = new Juego2v2(h1, h2, v1, v2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(v1);
        System.out.println(v2);

        j1.jugar();
        j2.jugar();
    }
}
