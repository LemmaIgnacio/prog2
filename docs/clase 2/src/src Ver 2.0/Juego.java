
public class Juego {

	private int jugador1;
	private int jugador2;
	
	public Juego() {
		jugador1 = 0;
		jugador2 = 0;
	}
	
	
	public void jugar() {
		
		
		for (int i = 0; i<10; i++) {
			
			int puntosJ1 = tirar() + tirar();
			int puntosJ2 = tirar() + tirar();
			
			if ((puntosJ1>7)&&(puntosJ1>puntosJ2)){
				jugador1++;
			} else {
				if ((puntosJ2>7)&&(puntosJ2>puntosJ1)) {
					jugador2++;
				}
			}
		}
		
		System.out.println( ganador() );
		
		
		
	}
	
	
	// tirar un dado
	
	public int tirar() {
		// Math.random() genera un numero aleatorio entre 0 y 1
		// Math.random() * 6      --->    0 y 6
		// (Math.random() * 6) +1  ---->   1 y 7 NUmeros entre 1 y 6 (3,45)
		
		return (int) (Math.random() * 6) +1; // numeros entre 1 y 6
	}
	
	//ganador devuelve String con el que gano
	public String ganador() {
		if (jugador1>jugador2) {
			return "jugador 1";
		} else {
			if (jugador2>jugador1) {
				return "jugador 2";
			} else {
				return "empate";
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juego dados = new Juego();
		
		dados.jugar();
		
	}

}
