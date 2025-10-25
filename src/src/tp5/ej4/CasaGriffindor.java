package tp5.ej4;

import java.util.ArrayList;

public class CasaGriffindor extends Casa {

    public CasaGriffindor(int MAX_ALUMNOS, ArrayList<String> cualidadesRequeridas, ArrayList<Alumno> alumnos,
            ArrayList<String> casasEnemistadas) {
        super(MAX_ALUMNOS, cualidadesRequeridas, alumnos, casasEnemistadas);
    }



    @Override
    public String toString() {
        return "Bienvenido a la casa Griffindor";
    }
    
}
