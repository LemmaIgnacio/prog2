package tp4.ej6;

public class Persona {
    protected  String nombre;
    protected String aprellido;
    protected int edad;
    
    public Persona(String nombre, String aprellido, int edad) {
        this.nombre = nombre;
        this.aprellido = aprellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAprellido() {
        return aprellido;
    }

    public void setAprellido(String aprellido) {
        this.aprellido = aprellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String listado(){
        return "Nombre: " + nombre + "\n "
                + "Apellido: " + aprellido + "\n"
                + "Edad: " + edad + "\n";
    }

}
