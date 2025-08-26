
public class Jugador {
	
	private String nombre;
	
	private int puntos; 
	
	public Jugador(String nombre) {
		
		puntos = 0;
		if(nombre!=null) {
			this.nombre = nombre;
		} else {
			nombre = "SIN NOMBRE";
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}
	
	
	public void incrementarPuntos() {
		puntos++;
	}

	
	// TIRAR LOS DADOS
	public int tirarDados(Cubilete cubil) {
		return cubil.tirar();
	}
}
