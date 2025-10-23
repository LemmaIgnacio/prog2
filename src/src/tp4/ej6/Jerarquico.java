package tp4.ej6;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado> empleados;
    

    public Jerarquico(String nombre, String aprellido, int edad, int legajo, int sueldo,
            ArrayList<Empleado> empleados) {
        super(nombre, aprellido, edad, legajo, sueldo);
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String mostrarEmpleados() {
        String resultado = "";
        for (Empleado e : empleados) {
            resultado += e.getLegajo() + " ";
        }
        return resultado;
}

        public String listado(){
        return "Nombre: " + nombre + "\n "
                + "Apellido: " + aprellido + "\n"
                + "Edad: " + edad + "\n"
                + "Legajo: " + legajo + "\n"
                + "Sueldo: " + sueldo + "\n"
                + "Empleados a cargo: " + mostrarEmpleados();
    }
}
