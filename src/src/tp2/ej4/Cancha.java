package tp2.ej4;

public class Cancha {
    final static int MAX_FUT = 2;
    final static int MAX_PADDLE = 5;
    final static int PRECIO_FUT = 400;
    final static int PRECIO_PADDLE = 100;

    private int id;
    private String tipo;
    
    public Cancha(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public static int getMaxFut() {
        return MAX_FUT;
    }

    public static int getMaxPaddle() {
        return MAX_PADDLE;
    }

    public static int getPrecioFut() {
        return PRECIO_FUT;
    }

    public static int getPrecioPaddle() {
        return PRECIO_PADDLE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
