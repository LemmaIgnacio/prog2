package tp5.ej5;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesRequeridos;
    private String tipo; // "gruesa", "fina", "pastura"

    public Cereal(String nombre, ArrayList<String> mineralesRequeridos, String tipo) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean puedeSembrarseEn(Lote lote) {
        return lote.puedeSembrar(this);
    }
}
