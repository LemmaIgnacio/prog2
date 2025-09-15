public class App {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico();
        PuntoGeometrico p2 = new PuntoGeometrico(1, 5);
        PuntoGeometrico p3 = new PuntoGeometrico(1, 1);
        PuntoGeometrico p4 = new PuntoGeometrico(1, 1);

        //Funcionalidades punto geometrico
        //#1
        System.out.println("Punto 1 sin desplazar " + p1.posiciones());
        p1.desplazar(2,2);
        System.out.println( "Punto 1 desplazado " + p1.posiciones());

        //#2
        System.out.println("La distancia euclídea de los puntos es: " + p1.distanciaEuclidea(p2));


        //Funcionalidades rectangulo
        Rectangulo r1 = new Rectangulo(p1, p2);
        Rectangulo r2 = new Rectangulo(p3, p4);

        System.out.println("-----------------------------------------------");

        //#3
        System.out.println("R1 sin desplazar: (" + p1.posiciones() + "," + p2.posiciones() + ")");
        r1.desplazar(1, 2);
        System.out.println("R1 desplazado: (" + p1.posiciones() + "," + p2.posiciones() + ")");


        //#4
        System.out.println("El area del rectangulo R1 " + p1.posiciones() + "," + p2.posiciones() + " es: " + r1.area());
        System.out.println("El area del rectangulo R2 " + p3.posiciones() + "," + p3.posiciones() + " es: " + r2.area());

        //#5
        System.out.println("Comparación r1 y r2: " + r1.comparar(r2));

        //#6
        System.out.println("Lado largo Superior de R1: " + r1.ladoSuperior());
        System.out.println("Lado largo Superior de R2: " + r2.ladoSuperior());

        //#7
        System.out.println("Orientacion de R1: " + r1.orientacion());
        System.out.println("Orientacion de R2: " + r2.orientacion());

    }
}
