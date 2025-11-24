package tp9.ej1;

import java.util.ArrayList;

public class Link extends SistemaArchivos {
    public static int TAMANIO = 1;
    public Link(String nombre, int fechaCreacion){
        super(nombre, fechaCreacion);
    }

    @Override
    public int getTamanio(){
        return TAMANIO;
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
