package tp4.ej6;

public class UsuarioFinal extends Persona {
    private String nickname;
    private String password;

    public UsuarioFinal(String nombre, String aprellido, int edad, String nickname, String password) {
        super(nombre, aprellido, edad);
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String listado(){
        return "Rol: Usuario Final \n"
                + "Nombre: " + nombre + "\n "
                + "Apellido: " + aprellido + "\n"
                + "Edad: " + edad + "\n"
                + "Nickname: " + nickname
                + "Password: " + password;
    }
    
}
