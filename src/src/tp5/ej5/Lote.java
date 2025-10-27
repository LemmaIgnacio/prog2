package tp5.ej5;

import java.util.ArrayList;

public class Lote {
    private String nombre;
    private double superficie;
    private ArrayList<String> minerales;
    private ArrayList<String> mineralesEspeciales;

    public Lote(String nombre, double superficie, ArrayList<String> minerales, ArrayList<String> mineralesEspeciales) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.minerales = minerales;
        this.mineralesEspeciales = mineralesEspeciales;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public ArrayList<String> getMinerales() {
        return minerales;
    }

    public boolean esEspecial() {
        for (String m : mineralesEspeciales) {
            if (minerales.contains(m)) {
                return true;
            }
        }
        return false;
    }

    public boolean esComun() {
        return !esEspecial();
    }

    public boolean puedeSembrar(Cereal cereal) {
        for (String mineralReq : cereal.getMineralesRequeridos()) {
            if (!minerales.contains(mineralReq)) {
                return false;
            }
        }
        if (cereal.getTipo().equals("pastura") && superficie < 50) {
            return false;
        }
        return true;
    }
}
