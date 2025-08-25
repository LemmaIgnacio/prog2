
public class Vuelo {
  String origen;
  String destino;
  Avion avioncito;
  Persona[] pasajeros;
  Persona[] tripulantes;
 
  
  
  public int getCapacidadUsada() {
	  int contador =0;
	  for(int j =0; j<pasajeros.length;j++) {
		  if (pasajeros[j]!= null) {
			  contador ++;
		  }
	  }
	  return contador;
  }
  public Vuelo(Avion av, String or, String des) {
	  avioncito = av;
	  origen = or;
	  destino = des;
	  pasajeros = new Persona[avioncito.getCapacidad()];
	  tripulantes = new Persona[20];
  }
  
  public boolean estaLleno() {
	  if (getCapacidadUsada() == avioncito.getCapacidad()) {
		 return true;
	  }else {
		  return false;
	  }
  }
  
  public int getAsientosDisponibles() {
	  return avioncito.getCapacidad() - getCapacidadUsada();
  }
}
