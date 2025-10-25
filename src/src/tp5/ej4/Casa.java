package tp5.ej4;

import java.util.ArrayList;

public class Casa {
    protected final int MAX_ALUMNOS;
    protected ArrayList<String> cualidadesRequeridas;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<String> casasEnemistadas;
    protected int cantAlumnos;

    public Casa(int MAX_ALUMNOS, ArrayList<String> cualidadesRequeridas,  ArrayList<Alumno> alumnos, ArrayList<String> casasEnemistadas) {
        this.MAX_ALUMNOS = MAX_ALUMNOS;
        this.cualidadesRequeridas = cualidadesRequeridas;
        this.alumnos = alumnos;
        this.casasEnemistadas = casasEnemistadas;
        this.cantAlumnos = 0;
    }

    public int getMAX_ALUMNOS() {
        return MAX_ALUMNOS;
    }

    public ArrayList<String> getCualidadesRequeridas() {
        return cualidadesRequeridas;
    }

    public void setCualidadesRequeridas(ArrayList<String> cualidadesRequeridas) {
        this.cualidadesRequeridas = cualidadesRequeridas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<String> getCasasEnemistadas() {
        return casasEnemistadas;
    }

    public void setCasasEnemistadas(ArrayList<String> casasEnemistadas) {
        this.casasEnemistadas = casasEnemistadas;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

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
        return cumpleCualidad;
    }
    
    public boolean asignarAlumno(Alumno a) {
        if (puedeAceptar(a) && !(a.isTieneCasa())) {
            alumnos.add(a);
            cantAlumnos++;
            a.setTieneCasa(true);
            System.out.println(a.getNombre() + " fue asignado a " + this.toString());
            return true;
        } else {
            System.out.println(a.getNombre() + " no pudo ser asignado a " + this.toString());
        }
        return false;
    }

    public void mostrarAlumnos(){
        for (Alumno a : getAlumnos()) {
			System.out.println(a.getNombre());
		}
    }

    @Override
    public String toString() {
        return "Casa " + cualidadesRequeridas.toString();
    }
}
