package tp5.ej4;

import java.util.ArrayList;

public class CasaSliterin extends Casa{
    public CasaSliterin(int MAX_ALUMNOS, ArrayList<String> cualidadesRequeridas, ArrayList<Alumno> alumnos,
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
        return cumpleCualidad && a.isLinajeFamiliar();
    }


    @Override
    public String toString() {
        return "Bienvenido a la casa Sliterin";
    }
}
