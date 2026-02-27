public class CondicionUsuario implements Condicion {
    private Usuario user;

    public CondicionUsuario(Usuario user) {
        this.user = user;
    }

    @Override
    public boolean cumple(Elemento e){
        return e.getUsuario().equals(user);
    }
}
