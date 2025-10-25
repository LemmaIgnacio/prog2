package tp5.ej4;

import java.util.ArrayList;

public class CasaRavenclaw extends Casa {

    public CasaRavenclaw(int MAX_ALUMNOS, ArrayList<String> cualidadesRequeridas, ArrayList<Alumno> alumnos,
            ArrayList<String> casasEnemistadas) {
        super(MAX_ALUMNOS, cualidadesRequeridas, alumnos, casasEnemistadas);
    }
    @Override
    public boolean puedeAceptar(Alumno a){

        if (cantAlumnos >= MAX_ALUMNOS) {
            return false;
            }

        boolean cumpleCualidad = false;
        for (String cualidadRequerida : cualidadesRequeridas) {
            if (a.getCualidades().contains(cualidadRequerida)) {
                cumpleCualidad = true;
            }
        }
        boolean tieneCasaEnemiga = false;
        for (String c : casasEnemistadas) {
            if(c.equals("Ravenclaw")){
                tieneCasaEnemiga = true;
            }
        }
        
        return cumpleCualidad && tieneCasaEnemiga && a.isLinajeFamiliar();
    }

    @Override
    public String toString() {
        return "Bienvenido a la casa Ravenclaw";
    }
    
}
