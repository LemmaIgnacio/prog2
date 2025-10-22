package tp3.ej4;

public class Contacto {
    private String nombre;
    private String apellido;
    private String date;
    private String num_phone;
    private String direccion;
    private String mail;

    private String ciudad;
    private int edad;
    
    public Contacto(String nombre, String apellido, String date, String num_phone, String direccion, String mail,
            String ciudad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.date = date;
        this.num_phone = num_phone;
        this.direccion = direccion;
        this.mail = mail;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNum_phone() {
        return num_phone;
    }

    public void setNum_phone(String num_phone) {
        this.num_phone = num_phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", num_phone=" + num_phone + ", ciudad="
                + ciudad + ", edad=" + edad + "]";
    }

    

    
}
