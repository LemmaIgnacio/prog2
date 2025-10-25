package tp5.ej4;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		ArrayList<String> cualidades1 = new ArrayList<>();
		cualidades1.add("Magia blanca");
		cualidades1.add("Buen Corazon");

		ArrayList<String> cualidades2 = new ArrayList<>();
		cualidades2.add("Buen Corazon");

		ArrayList<String> cualidades3 = new ArrayList<>();
		cualidades3.add("Ambición");

		ArrayList<String> cualidades4 = new ArrayList<>();
		cualidades4.add("Ambición");
		cualidades4.add("Magia blanca");

        ArrayList<Alumno> alumnos = new ArrayList<>();

		Alumno a1 = new Alumno("Harry", cualidades1, false, alumnos);
		Alumno a2 = new Alumno("Cedric", cualidades2,true, alumnos);
		Alumno a3 = new Alumno("Draco", cualidades3, false, alumnos);
		Alumno a4 = new Alumno("Manin minin", cualidades4, true, alumnos);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);

		ArrayList<String> casasEnemistadasH = new ArrayList<>();
		casasEnemistadasH.add("Ravenclaw");

		ArrayList<String> casasEnemistadasG = new ArrayList<>();
		casasEnemistadasG.add("Sliterin");
		ArrayList<String> casasEnemistadasR = new ArrayList<>();
		casasEnemistadasR.add("Hafflepuf");
		ArrayList<String> casasEnemistadasS = new ArrayList<>();
		casasEnemistadasS.add("Hafflepuf");


		ArrayList<Alumno> alumnosH = new ArrayList<>();
		ArrayList<Alumno> alumnosG = new ArrayList<>();
		ArrayList<Alumno> alumnosS = new ArrayList<>();
		ArrayList<Alumno> alumnosR = new ArrayList<>();

		ArrayList<String> cualidadesH = new ArrayList<>();
		cualidadesH.add("Magia blanca");		
		Casa hufflepuff = new Casa(1, cualidadesH, alumnosH, casasEnemistadasH);
		
		ArrayList<String> cualidadesG = new ArrayList<>();
		cualidadesG.add("Buen Corazon");

		Casa gryffindor = new Casa(2, cualidadesG, alumnosG, casasEnemistadasG);

		ArrayList<String> cualidadesS = new ArrayList<>();
		cualidadesS.add("Ambición");
		Casa slytherin = new Casa(1, cualidadesS, alumnosS, casasEnemistadasS);

		ArrayList<String> cualidadesR = new ArrayList<>();
		cualidadesR.add("Magia blanca");
		cualidadesR.add("Ambición");
		Casa ravenclaw = new Casa(1, cualidadesR, alumnosR, casasEnemistadasR);

		// Asignar alumnos
		System.out.println("¿Harry a Hufflepuff? " + hufflepuff.asignarAlumno(a1));
		System.out.println("¿Harry a gryffindor? " + gryffindor.asignarAlumno(a1));
		System.out.println("¿Harry a slytherin? " + slytherin.asignarAlumno(a1));
		System.out.println("¿Harry a ravenclaw? " + ravenclaw.asignarAlumno(a1));
		System.out.println("--------------------------");
		System.out.println("¿Cedric a Hufflepuff? " + hufflepuff.asignarAlumno(a2));
		System.out.println("¿Cedric a gryffindor? " + gryffindor.asignarAlumno(a2));
		System.out.println("¿Cedric a slytherin? " + slytherin.asignarAlumno(a2));
		System.out.println("¿Cedric a ravenclaw? " + ravenclaw.asignarAlumno(a2));
		System.out.println("--------------------------");
		System.out.println("¿Draco a hufflepuff? " + hufflepuff.asignarAlumno(a3));
		System.out.println("¿Draco a gryffindor? " + gryffindor.asignarAlumno(a3));
		System.out.println("¿Draco a slytherin? " + slytherin.asignarAlumno(a3));
		System.out.println("¿Draco a ravenclaw? " + ravenclaw.asignarAlumno(a3));
		System.out.println("--------------------------");
		System.out.println("Manin minina hufflepuff? " + hufflepuff.asignarAlumno(a4));
		System.out.println("Manin minina gryffindor? " + gryffindor.asignarAlumno(a4));
		System.out.println("Manin minina slytherin? " + slytherin.asignarAlumno(a4));
		System.out.println("Manin minina ravenclaw? " + ravenclaw.asignarAlumno(a4));

		System.out.println("\nAlumnos en Hufflepuff:");
		hufflepuff.mostrarAlumnos();
		System.out.println("\nAlumnos en Gryffindor:");
		gryffindor.mostrarAlumnos();
		System.out.println("\nAlumnos en Slytherin:");
		slytherin.mostrarAlumnos();
		System.out.println("\nAlumnos en Ravenclaw:");
		ravenclaw.mostrarAlumnos();
	}
}
