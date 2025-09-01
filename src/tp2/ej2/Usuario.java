public class Usuario {
    private String nombre;
    private String telefono;
    private String email;
    private boolean esAsistente;

    public Usuario(String nombre, String telefono, String email, boolean esAsistente) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.esAsistente = esAsistente;
    }

    public Usuario(){
        this("user", "+54 9 2494 xx xxxx", "user@gmail.com", false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsAsistente() {
        return esAsistente;
    }

    public void setEsAsistente(boolean esAsistente) {
        this.esAsistente = esAsistente;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "| Telefono: " + this.telefono + "| email: " + this.email;
    }
}


