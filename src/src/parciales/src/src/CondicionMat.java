
public class CondicionMat extends Condicion {

	String matBuscado;
	//GET SET Y CONSTRUCTOR
	
	public boolean cumple(Presupuesto pp) {
		// TODO Auto-generated method stub
		return pp.getMateriales().contains(matBuscado);
	}

}
