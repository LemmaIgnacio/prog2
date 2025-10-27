import java.util.ArrayList;

public class Basico extends Presupuesto {

	ArrayList<String> mats;
	int cantEmpleados;
	int dias;
	private CalculadorCosto calculador;
	
	public Basico(String no, int emp, int dias, CalculadorCosto cc) {
		super(no);
		cantEmpleados = emp;
		mats = new ArrayList<String>();
		calculador = cc;
		this.dias = dias;
	}
	
	
	
	
	public CalculadorCosto getCalculador() {
		return calculador;
	}




	public void setCalculador(CalculadorCosto calculador) {
		this.calculador = calculador;
	}




	public void addMaterial(String ss) {
		if (!mats.contains(ss))
			mats.add(ss); 
	}
	
	public ArrayList<String> getMateriales() {
	
	//NO	return mats; ROMPE ENCAPSULAMIENTO
		ArrayList<String> copia = new ArrayList<String>(mats);
		
		return copia;
	}
	
	public int getCantidadEmpleados() {
		return cantEmpleados;
	}

	public void setCantidadEmpleados(int em) {
		cantEmpleados = em;
	}
	
	public int getTiempo() {
		return dias;
	}
	
	public void setDias(int em) {
		dias = em;
	}
	
	public ArrayList<Presupuesto> buscar(Condicion c){
		ArrayList<Presupuesto> salida = new ArrayList<Presupuesto>();
		if(c.cumple(this)) {
			salida.add(this);
		}
		return salida;
	}
	
	public double getCosto() {
		return calculador.cacularCosto(this);
	}
	
}
