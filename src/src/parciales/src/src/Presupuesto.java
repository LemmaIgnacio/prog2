import java.util.ArrayList;

public abstract class Presupuesto {

	private String nombre;
	
	public Presupuesto(String nn) {
		nombre = nn;
	}
	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}
	
	public abstract ArrayList<String> getMateriales();
	public abstract int getCantidadEmpleados();
	public abstract int getTiempo();
	public abstract ArrayList<Presupuesto> buscar(Condicion c);
	
	public abstract double getCosto();
	
	public boolean equals(Object o1) {
		
		try {
			Presupuesto pp = (Presupuesto)o1;
			return nombre.equals(pp.getNombre());
		} catch(Exception e) {
			return false;
		}
		
	}
}
