package tp4.ej6;

public class Empleado extends Persona {
    protected int legajo;
    protected int sueldo;
    

    public Empleado(String nombre, String aprellido, int edad, int legajo, int sueldo) {
        super(nombre, aprellido, edad);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }


    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    public int getSueldo() {
        return sueldo;
    }


    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String listado(){
        return "Rol: Empleado \n"
                + "Nombre: " + nombre + "\n "
                + "Apellido: " + aprellido + "\n"
                + "Edad: " + edad + "\n"
                + "Legajo" + legajo;
    }
}
