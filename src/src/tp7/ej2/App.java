package tp7.ej2;

import java.util.*;

public class App {
	public static void main(String[] args) {
		// Crear documentos de ejemplo
		Documento doc1 = new Documento("Historia de Roma", new ArrayList<>(Arrays.asList("Juan", "Ana")), "Roma fue fundada por Rómulo y Remo.", new ArrayList<>(Arrays.asList("antigüedad", "imperio")));
		Documento doc2 = new Documento("Egipto", new ArrayList<>(Arrays.asList("Luis")), "Egipto tiene pirámides y faraones.", new ArrayList<>(Arrays.asList("antigüedad")));
		Documento doc3 = new Documento("Grecia", new ArrayList<>(Arrays.asList("Ana")), "Grecia es cuna de la filosofía.", new ArrayList<>());

		List<Documento> documentos = Arrays.asList(doc1, doc2, doc3);

		// Condiciones
		Condicion cAutorAna = new CondicionAutorDeterminado("Ana");
		Condicion cSinPalabraClave = new CondicionSinPalabraClave("");
		Condicion cTituloContiene = new CondicionPalabraDadaEnTitulo("Egipto");
		Condicion cContenidoMin20 = new CondicionContenidoMayor20();

		// Combinaciones lógicas
		Condicion cAnd = new CondicionAnd(cAutorAna, cSinPalabraClave);
		Condicion cOr = new CondicionOr(cTituloContiene, cContenidoMin20);
		Condicion cNot = new CondicionNot(cSinPalabraClave);

		// Pruebas
		System.out.println("Documentos donde el autor es Ana y no tiene palabra clave:");
		for (Documento d : documentos) {
			if (cAnd.cumple(d)) {
				System.out.println("- " + d.getNombre());
			}
		}

		System.out.println("\nDocumentos cuyo título contiene 'Egipto' o el contenido tiene al menos 20 palabras:");
		for (Documento d : documentos) {
			if (cOr.cumple(d)) {
				System.out.println("- " + d.getNombre());
			}
		}

		System.out.println("\nDocumentos que SÍ tienen palabras clave:");
		for (Documento d : documentos) {
			if (cNot.cumple(d)) {
				System.out.println("- " + d.getNombre());
			}
		}
	}
}
