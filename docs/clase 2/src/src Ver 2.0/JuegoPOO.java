
public class JuegoPOO {

	
	private Jugador jug1;
	private Jugador jug2;
	
	private Cubilete cubil;
	
	private int rondas = 10;
	private int menorValor = 7;
	
	
	public JuegoPOO() {
		
		jug1 = new Jugador("Jugador 1");
		jug2 = new Jugador("Jugador 2");
		cubil = new Cubilete(6);
		
	}
	
	public JuegoPOO(Jugador j1, Jugador j2) {
	
		jug1 = j1;
		jug2 = j2;
		cubil = new Cubilete(6);
	}
	
	public JuegoPOO(Jugador j1, Jugador j2, int canLados) {
		
		jug1 = j1;
		jug2 = j2;
		cubil = new Cubilete(canLados);
		menorValor = canLados +1;
	}
	
	public JuegoPOO(int rondas, Jugador j1, Jugador j2, int canLados) {
		this.rondas = rondas;
		jug1 = j1;
		jug2 = j2;
		cubil = new Cubilete(canLados);
		menorValor = canLados +1;
	}
	
	public JuegoPOO(Jugador j1,  int canLados) {
		
		jug1 = j1;
		jug2 = new Jugador("la computadora");
		cubil = new Cubilete(canLados);
		menorValor = canLados +1;
	}
	
	public JuegoPOO(int canLados) {
		
		jug1 = new Jugador("Jugador 1");
		jug2 = new Jugador("Jugador 2");
		cubil = new Cubilete(canLados);
		menorValor = canLados +1;
	}
	

	
	public JuegoPOO(Jugador j1, Jugador j2, Cubilete cub) {
		
		jug1 = j1;
		jug2 = j2;
		cubil = cub;
		menorValor = 7;
	}
	

	
	public void jugar() {
		
		// una constante en codigo solo se puede cambiar si compilamos el codigo de nuevo, 
		// QUEDO FIJO EN 10 si queremos 20 es necesario otra clase o tocar el codigo
		
		for(int i = 0; i < rondas; i++) {// las rondas las define el juego;
			
			int puntos1 = jug1.tirarDados(cubil);
			int puntos2 = jug2.tirarDados(cubil);
			
			if (puntos1>menorValor && puntos1>puntos2) {
				jug1.incrementarPuntos();
			} else {
				if (puntos2>menorValor && puntos2>puntos1) {
					jug2.incrementarPuntos();
				}
				
			}
				
		}
		
		Jugador ganador = ganador();
		
		if (ganador!= null)
		    System.out.println(ganador().getNombre());
		else
			System.out.println("Empate");
		
	}
	
	public int getRondas() {
		return rondas;
	}

	public void setRondas(int rondas) {
		this.rondas = rondas;
	}

	public Jugador ganador() {
		if (jug1.getPuntos()>jug2.getPuntos()) {
			return jug1;
		} else 
			if (jug2.getPuntos()>jug1.getPuntos()) 
				return jug2;
		  else {
			return null;
		   }
		
		
	}
	  
	
	
	
	
	
	public int getMenorValor() {
		return menorValor;
	}

	public void setMenorValor(int menorValor) {
		this.menorValor = menorValor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador j1 = new Jugador("Marcelo");
		Jugador j2 = new Jugador("Luis");
		
		
		
		
		JuegoPOO juegoDados= new JuegoPOO(20,j1,j2,8);
		//juegoDados.setMenorValor(11);
		
		juegoDados.jugar();
		
		System.out.println("el Jugador: "+ j1.getNombre() + " saco " + j1.getPuntos());
		System.out.println("el Jugador: "+ j2.getNombre() + " saco " + j2.getPuntos());
	}

}
