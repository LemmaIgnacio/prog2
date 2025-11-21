package recuperatorios.papanoelylosduendes;

public class ADR extends Cuadrilla{

    @Override
    public double getVelocidad(){
        double max = 0;
        for(Taller d : duendes){
            max += d.getVelocidad();
        }
        return max;
    }

    @Override
    public double getCreatividad(){
        if(!duendes.isEmpty()){
            return duendes.get(0).getCreatividad();
        }
        return 0;
    }
    protected Taller clonar() { return new ADR(); }























        @Override
    public String getNombre() {
        // Provide a suitable implementation or return a default value
        return "ADR";
    }

    @Override
    public int getAniosXP() {
        // Provide a suitable implementation or return a default value
        return 0;
    }
}
