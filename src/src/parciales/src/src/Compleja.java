import java.util.ArrayList;

public class Compleja extends Compuesto {

	public Compleja(String no) {
		super(no);
	}

	public ArrayList<String> getMateriales() {
       ArrayList<String> salida = new ArrayList<String>();
       
       for(int i =0; i < elems.size();i++) {
    	   Presupuesto p1 = elems.get(i);
    	   ArrayList<String> aux = p1.getMateriales();
    	   for(int j =0; j<aux.size();j++) {
    		   if (!salida.contains(aux.get(j))) {
    			   salida.add(aux.get(j));
    		   }
    	   }
    	   
       }
       return salida;
	
	}

	
	public int getCantidadEmpleados() {
		int mayor=0;
		  for(int i =0; i < elems.size();i++) {
	    	   Presupuesto p1 = elems.get(i);
	    	   int emple =p1.getCantidadEmpleados();
	    	   if(emple > mayor) {
	    		   mayor = emple;
	    	   }
		  }
		  return mayor;
	}
	
	public int getTiempo() {
		int suma =0;
		  for(int i =0; i < elems.size();i++) {
	    	   Presupuesto p1 = elems.get(i);
	    	   suma = suma + p1.getTiempo();
		  }
		  return suma;
	}
}
