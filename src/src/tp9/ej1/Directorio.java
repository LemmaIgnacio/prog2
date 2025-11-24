package tp9.ej1;

import java.util.ArrayList;

public  class Directorio extends SistemaArchivos {
    protected ArrayList<SistemaArchivos> archivos;
    
    public Directorio(String nombre, int fechaCreacion){
        super(nombre, fechaCreacion);
        archivos = new ArrayList<>();
    }

    public void addArchivos(SistemaArchivos a){
        archivos.add(a);
    }

    public ArrayList<SistemaArchivos> getArchivos(){
        return new ArrayList<>(archivos);
    }

    @Override
    public int getTamanio(){
        int total = 0;  
        for(SistemaArchivos a : archivos){
            total += a.getTamanio();
        }
        return total;
    }

    public ArrayList<SistemaArchivos> buscar(Condicion c){
        ArrayList<SistemaArchivos> res = new ArrayList<>();

        if(c.cumple(this)){
            res.add(this);
        }

        for(SistemaArchivos e : archivos){
            res.addAll(e.buscar(c));
        }

        return res;
}

}
