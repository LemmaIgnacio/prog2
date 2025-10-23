package tp4.ej3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, 550);
        Empleado e2 = new Empleado(2, 100);
        EmpleadoHoras eh1 = new EmpleadoHoras(3, 100, 20);
        EmpleadoHoras eh2 = new EmpleadoHoras(4, 55, 1);
        EmpleadoHoras eh3 = new EmpleadoHoras(5, 1000, 150);
        EmpleadoComi ec1 = new EmpleadoComi(6, 200, 0.2, 150);
        EmpleadoComi ech2 = new EmpleadoComi(7, 1000, 0.05, 100000);

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empresa em1 = new Empresa(empleados);
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(eh1);
        empleados.add(eh2);
        empleados.add(eh3);
        empleados.add(ec1);
        empleados.add(ech2);

        em1.verPagosEmpleados();
    }
    


    
}
