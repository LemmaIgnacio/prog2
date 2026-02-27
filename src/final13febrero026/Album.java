package final13febrero026;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Album extends Elemento{
    ArrayList<Elemento> elementos;
    public Album(String titulo, LocalDate fecha, ArrayList<Elemento> elementos){
        super(titulo, fecha);
        this.elementos = new ArrayList<>();
    }

    public void addElementos(Elemento e){
        elementos.add(e);
        Collection.sort(elementos);
    }

    public ArrayList<Elementos> getElementos(){
        return new ArrayList<>(elementos);
    }

    @Override
    public int getCantFotos(){
        int total = 0;
        for(Elemento e : elementos){
            e.getCantFotos() += total;
        }
        return total;
    }

    @Override
    public int getTamanio(){
        int total = 0;
        for(Elemento e : elementos){
            e.getTamanio() += total;
        }
        return total;
    }

    @Override //sin repetir
    public ArrayList<String> getListaPersonas(){
        ArrayList<String> listaSinRepetidos = new ArrayList<>();
        for(Elemento e : elementos){
            if(!(listaSinRepetidos.contains(e.getListaPersonas()))){
                listaSinRepetidos.addAll(e.getListaPersonas());
            }
        }
        return listaSinRepetidos;
    }

    @Override
    public Fotografia buscarPrimerFoto(Condicion c){
        for (Elemento e : elementos) {

        Fotografia encontrada = e.buscarPrimera(c);

        if (encontrada != null)
            return encontrada;
    }

    return null;
    }

}
