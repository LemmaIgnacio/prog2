package tp5.ej2;

public class Convertor {
    private double unidad;
    private int id;
    
    public Convertor(double unidad, int id) {
        this.unidad = unidad;
        this.id = id;
    }

    public double getUnidad() {
        return unidad;
    }

    public void setUnidad(double unidad) {
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double convertir(){
        switch (id) {
            case 1:
                return UnidadesDeMedida.pulgadasACentimetros(unidad);
            case 2:
                return UnidadesDeMedida.centimetrosAPulgadas(unidad);
            case 3:
                return UnidadesDeMedida.librasAKilos(unidad);
            case 4:
                return UnidadesDeMedida.kilosALibras(unidad);
            case 5:
                return UnidadesDeMedida.galonesALitros(unidad);
            case 6:
                return UnidadesDeMedida.litrosAGalones(unidad);
            default:
                return -1;
        }
    }
}
