
public class Dado {

	  private int cantidadCaras;
	  
	  private int ultimoValor;
	  
	  public Dado() {
		  cantidadCaras = 6;
		  tirar();
	  }
	  
	  public Dado(int caras) {
		  cantidadCaras = caras;
		  tirar();
	  }
	  
	  
	  
	  public int getCantidadCaras() {
		  return cantidadCaras;
	  }
	  
	  // EL SET cantidad de caras
	  
	  
	  
	  public int tirar() {
		  ultimoValor = (int) ((Math.random()*cantidadCaras)+1);
		  return ultimoValor;
	  }
	  
	  public int getUltimoValor() {
		  return ultimoValor;
	  }
	  
	  
	  
	  
}
