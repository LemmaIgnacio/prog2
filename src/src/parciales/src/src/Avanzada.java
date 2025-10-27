import java.util.ArrayList;

public class Avanzada extends Compuesto {

	public Avanzada(String no) {
		super(no);
	}

	public ArrayList<String> getMateriales() {
       ArrayList<String> salida = new ArrayList<String>();
       
       for(int i =0; i < elems.size();i++) {
    	   Presupuesto p1 = elems.get(i);
    	   ArrayList<String> aux = p1.getMateriales();
    	   salida.addAll(aux);
       }
       return salida;
	
	}
	
	
	public int getCantidadEmpleados() {
		int suma =0;
		  for(int i =0; i < elems.size();i++) {
	    	   Presupuesto p1 = elems.get(i);
	    	   suma = suma + p1.getCantidadEmpleados();
		  }
		  return suma;
	}

	public int getTiempo() {
		int mayor=0;
		for(int i =0; i < elems.size();i++) {
	         Presupuesto p1 = elems.get(i);
	    	 int dias =p1.getTiempo();
	    	   if(dias > mayor) {
	    		   mayor = dias;
	    	   }
		  }
		  return mayor;	
		
	}	
	
}