
public class Cubilete {
  
	Dado d1;
	Dado d2;
	
	public Cubilete() {
		d1 = new Dado(6);
		d2 = new Dado(6);
	
	}
	
	public Cubilete(int cantLados) {
		d1 = new Dado(cantLados);
		d2 = new Dado(cantLados);
	
	}

	public Dado getD1() {
		return d1;
	}

	public void setD1(Dado d1) {
		this.d1 = d1;
	}

	public Dado getD2() {
		return d2;
	}

	public void setD2(Dado d2) {
		this.d2 = d2;
	}
	
	public int tirar() {
		return d1.tirar()+ d2.tirar();
	}
	
	public int ultimaTirada() {
		return d1.getUltimoValor() + d2.getUltimoValor();
	}
	
}
