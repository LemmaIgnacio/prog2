package tp4.ej6;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        UsuarioFinal u1 = new UsuarioFinal("Juan", "Perez", 25, "juanp", "1234");
        UsuarioFinal u2 = new UsuarioFinal("Ana", "Gomez", 30, "anag", "abcd");


        Empleado e1 = new Empleado("Carlos", "Lopez", 40, 1001, 50000);
        Empleado e2 = new Empleado("Maria", "Diaz", 35, 1002, 52000);
        Empleado e3 = new Empleado("Pedro", "Sanchez", 28, 1003, 48000);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);

        Jerarquico j1 = new Jerarquico("Laura", "Martinez", 45, 2000, 80000, listaEmpleados);

        System.out.println(e1.listado());
        System.out.println(e2.listado());
        System.out.println(e3.listado());
        System.out.println(j1.listado());
        System.out.println(u1.listado());
        System.out.println(u2.listado());
    }
}   
