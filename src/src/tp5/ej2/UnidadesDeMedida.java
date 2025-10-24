package tp5.ej2;

public class UnidadesDeMedida {
    private final static double pulgadas = 2.54;
    private final static double libra = 0.453592;
    private final static double galon = 3.78541;

    public static double centimetrosAPulgadas(double cm) {
        return cm / pulgadas;
    }
    public static double pulgadasACentimetros(double in) {
        return in * pulgadas;
    }
    public static double librasAKilos(double lb) {
        return lb * libra;
    }
    public static double kilosALibras(double kg) {
        return kg / libra;
    }
    public static double galonesALitros(double gal) {
        return gal * galon;
    }
    public static double litrosAGalones(double l) {
        return l / galon;
    }
}
