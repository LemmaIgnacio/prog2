package final13febrero026;

import final13febrero026.condiciones.Condicion;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fotografia extends Elemento {
    private int id;
    private int tamanio;
    private ArrayList<String> listaPersonas;

    public Fotografia(String titulo, LocalDate fecha, int id, int tamanio, ArrayList<String> listaPersonas){
        super(titulo, fecha);
        this.id = id;
        this.tamanio = tamanio;
        this.listaPersonas = new ArrayList<>(listaPersonas);
    }

    //getter y setter id 
    //setter de tamanio

    public void addPersonas(String p){
        listaPersonas.add(p);
    }

    @Override
    public ArrayList<String> getListaPersonas(){
        return new ArrayList<>(listaPersonas);
    }

    @Override
    public int getTamanio(){
        return tamanio;
    }

    @Override
    public int getCantFotos(){
        return 1;
    }

    @Override
    public Fotografia buscarPrimerFoto(Condicion c){
        if(c.cumple(this)){
            return this;
        }
        return null;
    }

    @Override
    public Elemento copia(Condicion c){
        if(!c.cumple((this))){
            return null;
        }
        return new Fotografia(titulo, fecha, id, tamanio, listaPersonas);
    }
}

