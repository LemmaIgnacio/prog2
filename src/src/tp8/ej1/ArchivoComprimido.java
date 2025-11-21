package tp8.ej1;

import java.util.ArrayList;

public class ArchivoComprimido extends Elemento {
    private ArrayList<Elemento> elementos = new ArrayList<>();
    private int tasaCompresion;

    public ArchivoComprimido(String nombre, String fechaCreacion, int tasaCompresion){
        super(nombre, fechaCreacion);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public int getTamanio(){
        int total = 0;
        for(Elemento e : elementos){
            total += e.getTamanio();
        }
        return total / tasaCompresion;
    }

    @Override
    public int getCantElementos(){
        int cantElementos = 0;
        for(Elemento e : elementos){
                cantElementos += e.getCantElementos();
            }
        return cantElementos;
    }

    public void addElemento(Elemento e) {
        elementos.add(e);
    }
}
