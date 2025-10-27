
public class CondicionNot extends Condicion {

	Condicion cond;
	@Override
	public boolean cumple(Presupuesto pp) {
		// TODO Auto-generated method stub
		return !cond.cumple(pp);
	}

}
