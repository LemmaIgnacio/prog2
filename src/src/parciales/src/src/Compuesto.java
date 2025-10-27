import java.util.ArrayList;



public abstract class Compuesto extends Presupuesto {
  
	protected ArrayList<Presupuesto> elems;
	
	public Compuesto(String no) {
		super(no);
		elems = new ArrayList<Presupuesto>();
	}
	
	public void addElemento(Presupuesto pp) {
		elems.add(pp);
	}
	
	public void removeElemento(Presupuesto pp) {
		elems.remove(pp);
	}
	
	public ArrayList<Presupuesto> buscar(Condicion c){
		ArrayList<Presupuesto> salida = new ArrayList<Presupuesto>();
		if (c.cumple(this)) {
			salida.add(this);
		} else {
			for(int i =0; i<elems.size();i++) {
				Presupuesto pp = elems.get(i);
				salida.addAll(pp.buscar(c));
			}
		}
		return salida;
	}
	
	public double getCosto() {
		double suma =0;
	    for(int i =0; i < elems.size();i++) {
		   Presupuesto p1 = elems.get(i);
		   suma = suma + p1.getCosto();
		}
		  return suma;
		
	}
	
	

}
