import java.time.LocalDate;
public class App {
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno(123456789, "Pepe", "Franco", LocalDate.of(2007, 12, 15), 'M', 70, 1.75);

        //#8
        System.out.println(a1.informacionAlumno());
        //#1
        System.out.println("El IMC del alumno: " + a1.calcularImc());
        // #2 Se podria agregar un if, donde el true de un mensaje tipo string que diga que este en forma y en el else que diga que no.
        System.out.println("¿El alumno esta en forma? " + a1.estaEnForma());
        // #3
        System.out.println("¿Es el cumpleaños del alumno? " + a1.cumpleAños());
        // #4
        System.out.println("¿Es mayor de edad? " + a1.esMayorEdad());
        // #6
        System.out.println("¿Puede votar? " + a1.puedeVotar());
        //#7
        System.out.println("¿La edad es coherente? " + a1.edadCoherente());

    }
}
