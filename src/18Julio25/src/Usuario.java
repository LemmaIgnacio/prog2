public class Usuario {
    private String nombre;
    private int anioRegristro;
    private String email;

    public Usuario(String nombre, int anioRegristro, String email) {
        this.nombre = nombre;
        this.anioRegristro = anioRegristro;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnioRegristro() {
        return anioRegristro;
    }

    public void setAnioRegristro(int anioRegristro) {
        this.anioRegristro = anioRegristro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

