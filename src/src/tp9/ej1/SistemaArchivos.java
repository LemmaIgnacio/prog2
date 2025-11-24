package tp9.ej1;

import java.util.ArrayList;

public abstract class SistemaArchivos {
    protected String nombre;
    protected int fechaCreacion;

    public SistemaArchivos(String nombre, int fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre(){
        return nombre;
    }

    public int fechaCreacion(){
        return fechaCreacion;
    }

    public abstract int getTamanio();
    public abstract ArrayList<SistemaArchivos> buscar(Condicion c);
}
