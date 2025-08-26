
public class Cubilete {
  
	int cantDados;

	Dado[] dados;
	
	
	public Cubilete(int cantDados, int caras) {
		this.cantDados = cantDados;
		dados = new Dado[cantDados];
		for(int i = 0; i<cantDados; i++) {
			dados[i] = new Dado(caras);
		}

	}
	
	public Cubilete() {
     this(2,6);
	}
	
	public Cubilete(int cantDados) {
		this(cantDados,6);
	}

	public int tirar() {
	  int suma = 0;
	  
	  for(int i =0; i< cantDados; i++) {
		  suma = suma + dados[i].tirar();
	  }
	  return suma;
	}
	
	public int ultimaTirada() {
		  int suma = 0;
		  
		  for(int i =0; i< cantDados; i++) {
			  suma = suma + dados[i].getUltimoValor();
		  }
		  return suma;
	}
	
}
