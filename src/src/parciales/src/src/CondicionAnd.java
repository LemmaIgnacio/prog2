
public class CondicionAnd extends Condicion {

	Condicion c1;
	Condicion c2;
	//GET SET Y CONSTRUCTOR
	@Override
	public boolean cumple(Presupuesto pp) {
		// TODO Auto-generated method stub
		return c1.cumple(pp) && c2.cumple(pp);
	}

}
