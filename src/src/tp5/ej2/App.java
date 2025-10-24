package tp5.ej2;

public class App {
    public static void main(String[] args) {
    Convertor c1 = new Convertor(4, 1);
    Convertor c2 = new Convertor(2, 2);
    Convertor c3 = new Convertor(5, 3);
    Convertor c4 = new Convertor(6, 4);
    Convertor c5 = new Convertor(3, 5);
    Convertor c6 = new Convertor(10, 6);

    System.out.println("4 pulgadas a cm: " + c1.convertir());
    System.out.println("2 cm a pulgadas: " + c2.convertir());
    System.out.println("5 libras a kilos: " + c3.convertir());
    System.out.println("6 kilos a libras: " + c4.convertir());
    System.out.println("3 galones a litros: " + c5.convertir());
    System.out.println("10 litros a galones: " + c6.convertir());
    }

}
