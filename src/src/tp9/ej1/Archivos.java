package tp9.ej1;

import java.util.ArrayList;


public class Archivos extends SistemaArchivos{
    private int tamanio;
    public Archivos(String nombre, int fechaCreacion, int tamanio){
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    @Override
    public int getTamanio(){
        return tamanio;
    }

    @Override
    public ArrayList<SistemaArchivos> buscar(Condicion c) {
        ArrayList<SistemaArchivos> res = new ArrayList<>();
        if (c.cumple(this)) {
            res.add(this);
        }
        return res;
    }
}
