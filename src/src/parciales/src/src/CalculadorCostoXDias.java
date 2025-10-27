
public class CalculadorCostoXDias extends CalculadorCosto {

	double valorDia;
	//get set y constructor
	@Override
	public double cacularCosto(Basico bb) {
		// TODO Auto-generated method stub
		return valorDia*bb.getTiempo();
	}

}
