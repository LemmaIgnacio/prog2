public class App {
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico("Generico");
        Electrodomestico e2 = new Electrodomestico("Levono", "Gris", 150, 15, 45.5);
        Electrodomestico e3 = new Electrodomestico("BGH", "Negro", 15, 15000000, 1.15);

        System.err.println(e1.funcionalidades());
        System.out.println(e2.funcionalidades());
        System.out.println(e3.funcionalidades());
    }
    
}