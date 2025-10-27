
public class CondicionDiasMayor extends Condicion {

	int dias;
	//GET SET CONSTRUCTOR
	@Override
	public boolean cumple(Presupuesto pp) {
		// TODO Auto-generated method stub
		return pp.getTiempo()>dias;
	}

}
