package tp2.ej4;

public class Cancha {
    private String tipo;  // futboll | paddle
    private int numero;
    private static final int PRECIO_FUTBOL = 400;
    private static final int PRECIO_PADDLE = 100;

    public Cancha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecioPorHora() {
        if (tipo.equals("Futbol")) {
            return PRECIO_FUTBOL;
        } else {
            return PRECIO_PADDLE;
        }
    }

    public int getNumero() {
        return numero;
    }
}