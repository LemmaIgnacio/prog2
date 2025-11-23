package sistemaArchivosTP9;

import sistemaArchivosTP9.condiciones.Condicion;

import java.util.ArrayList;

public class Comprimido extends Directorio{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }

    @Override
    public ArrayList<ElementoSA> buscar(Condicion condicion) {
        ArrayList<ElementoSA> resultado = new ArrayList<>();
        ArrayList<ElementoSA> resultadoParcial = super.buscar(condicion);
        if (!resultadoParcial.isEmpty()) {
            resultado.add(this);
        }
        return resultado;
    }
}
