package tp8.ej1;

import java.util.ArrayList;

public class Directorio extends Elemento {
    protected ArrayList<Elemento> elementos;

    public Directorio(String nombre, String fechaCreacion){
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }


    public ArrayList<Elemento> getElementos(){
        return new ArrayList<>(elementos);
    }
    
    @Override
    public int getTamanio(){
        int total = 0;
        for(Elemento e : elementos){
            total += e.getTamanio();
        }
        return total;
    }

    public int getCantElementos(){
        int cantElementos = 0;
        for(Elemento e : elementos){
                cantElementos += e.getCantElementos();
            }
        return cantElementos;
    }
}
