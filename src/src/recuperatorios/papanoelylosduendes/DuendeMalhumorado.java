package recuperatorios.papanoelylosduendes;

import java.util.ArrayList;

public class DuendeMalhumorado extends Duende {
    public DuendeMalhumorado (String nombre, int aniosXP, double velocidad, double creatividad){
        super(nombre, aniosXP, velocidad, creatividad);
    }
            @Override
        public double getVelocidad(){
            return velocidad - 200;
        }

        @Override
        public double getCreatividad(){
            return creatividad/89;
        }

        @Override
        public ArrayList<String> getHabilidades(){
            ArrayList<String> habilidades = super.getHabilidades();
            ArrayList<String> aux = new ArrayList<>();
            if (!habilidades.isEmpty()) {
                aux.add(habilidades.get(0));
            }
            return aux;
        }

        @Override
        public Taller clonar(){
            return new DuendeMalhumorado(nombre, aniosXP, velocidad, creatividad);
        }
}
