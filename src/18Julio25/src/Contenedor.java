import java.util.ArrayList;
import java.util.Collections;

public class Contenedor extends Elemento{
    private ArrayList<Elemento> elementos = new ArrayList<>();
    public Contenedor(String titulo, int descargas, Usuario u, int anio){
        super(titulo,descargas,u,anio);
    }

    @Override
    public int getAnio(){
        int masViejo = 9999;
        for (Elemento e : elementos){
            if (e.getAnio() < masViejo){
                masViejo = e.getAnio();
            }
        }
        return masViejo;
    }

    @Override
    public int getDescargas(){
        int total = 0;
        for (Elemento e : elementos){
            total += e.getDescargas();
        }
        return total;
    }

    @Override
    public int getTamanio(){
        int total = 0;
        for (Elemento e : elementos){
            total += e.getTamanio();
        }
        return total;
    }
    @Override
    public ArrayList<String> getPalabraClave(){
        ArrayList<String> res = new ArrayList<>();
        for(Elemento e : elementos){
            for(String palabraClave : e.getPalabraClave()){
                if (!res.contains(palabraClave)){
                    res.add(palabraClave);
                }
            }
        }
        return res;
    }

    @Override
    public boolean contienePalabraClave(String s){
        for (Elemento e : elementos){
            if (e.contienePalabraClave(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Elemento> buscar (Condicion c){
        ArrayList<Elemento> res = new ArrayList<>();
        for (Elemento e: elementos){
            res.addAll(e.buscar(c));
        }
        return res;
    }

    public void addElemento(Elemento e){
        elementos.add(e);
        Collections.sort(elementos);
    }
}