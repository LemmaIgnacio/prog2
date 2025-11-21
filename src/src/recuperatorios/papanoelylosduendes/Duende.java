package recuperatorios.papanoelylosduendes;

import java.util.ArrayList;
import java.util.List;

public class Duende extends Taller {
    protected String nombre;
    protected int aniosXP;
    protected double velocidad;
    protected double creatividad;
    protected ArrayList<String> habilidades;

    public Duende(String nombre, int aniosXP, double velocidad, double creatividad){
        this.nombre = nombre;
        this.aniosXP = aniosXP;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        this.habilidades = new ArrayList<>();
    }

    public void addHabilidad(String s) {
        if (!habilidades.contains(s)) habilidades.add(s);
    }

    @Override
    public double getVelocidad() { return velocidad; }

    @Override
    public double getCreatividad() { return creatividad; }

    @Override
    public ArrayList<String> getHabilidades() {
        return new ArrayList<>(habilidades); 
    }

    @Override
    public int getAniosXP() { 
        return aniosXP; 
    }

    @Override
    public ArrayList<Duende> buscarDuendes(Condicion c) {
        ArrayList<Duende> res = new ArrayList<>();
        if (c.cumple(this)){
            res.add(this);
        } 
        return res;
    }
    
    @Override
    public Taller copiar() {
        Duende copia = (Duende) this.clonar();
        for (String h : this.habilidades) copia.addHabilidad(h);
        return copia;
    }

    @Override
    protected Taller clonar() {
        return new Duende(this.nombre, this.aniosXP, this.velocidad, this.creatividad);
    }
}
