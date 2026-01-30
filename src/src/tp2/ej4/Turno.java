package tp2.ej4;

public class Turno {
    private Cancha cancha;
    private Usuario usuario;
    private String fecha;
    private int hora;
    private int duracion;

    public Turno(Cancha cancha, Usuario usuario, String fecha, int hora, int duracion) {
        this.cancha = cancha;
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public double calcularPrecioTotal() {
        double precioBase = cancha.getPrecioPorHora() * duracion;
        double descuento = usuario.getDescuento();
        double precioFinal = precioBase * (1 - descuento);

        return precioFinal;
    }
}
