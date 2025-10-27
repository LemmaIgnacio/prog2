
public class CalculadorSuma extends CalculadorCosto {

	CalculadorCosto c1;
	CalculadorCosto c2;
	//GET SET Y CONSTRUCTOR
	@Override
	public double cacularCosto(Basico bb) {
		// TODO Auto-generated method stub
		return c1.cacularCosto(bb) + c2.cacularCosto(bb);
	}

}
