package tp8.ej3;

import java.util.ArrayList;

public class Tripulacion extends OnePiece {

    private ArrayList <OnePiece> personajes;
    public Tripulacion(String nombre){
        super(nombre);
        this.personajes = new ArrayList<>();
    }

    public ArrayList<OnePiece> getPersonajes() {
        return new ArrayList<>(personajes);
    }
    public void add(OnePiece o){
        personajes.add(o);
    }
    @Override
    public int getFuerza(){
        int total = 0;
        for(OnePiece p : personajes){
            total += p.getFuerza();
        }
        return total;
    }

    @Override
    public int getPeso(){
        return personajes.get(0).getPeso();
    }

    @Override
    public int getEdad(){
        int mayor = 0;
        for(OnePiece p : personajes){
            if (mayor > p.getEdad()) {
                mayor = p.getEdad();
            }
        }
        return mayor;
    }
    
    @Override
    public int getCantPj(){
        int total = 0;
        for(OnePiece p : personajes){
            total += p.getCantPj();
        }
        return total;
    }

}
