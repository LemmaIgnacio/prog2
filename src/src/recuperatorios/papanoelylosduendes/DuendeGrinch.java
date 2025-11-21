package recuperatorios.papanoelylosduendes;

import java.util.ArrayList;

public class DuendeGrinch extends Duende{

    public DuendeGrinch(String nombre, int aniosXP, double velocidad, double creatividad){
        super(nombre, aniosXP, velocidad, creatividad);
    }

    @Override
    public double getVelocidad(){
        return velocidad-200;
    }

    @Override
    public double getCreatividad(){
        return creatividad/100;
    }

@Override
public ArrayList<String> getHabilidades() {
    ArrayList<String> habilidades = super.getHabilidades();
    ArrayList<String> resultado = new ArrayList<>();
    if (!habilidades.isEmpty()) {
        resultado.add(habilidades.get(0));
    }
    return resultado;
}

    @Override
    protected Taller clonar() {
        return new DuendeGrinch(this.nombre, this.aniosXP, this.velocidad, this.creatividad);
    }
}
