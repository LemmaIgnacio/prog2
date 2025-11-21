package recuperatorios.papanoelylosduendes;

public class HDC extends Cuadrilla {



    @Override
    public Taller clonar() {
        return new HDC();
    }

    @Override
    public double getCreatividad(){
        double max = 0;
        for(Taller d : duendes){
            if(d.getCreatividad() > max){
                max = d.getCreatividad();
            }
        }
        return max;
    }

    @Override
    public double getVelocidad(){
        if(duendes.isEmpty()){
            return 0;
        }
        return duendes.get(duendes.size()-1).getVelocidad();
    }


















    @Override
    public int getAniosXP() {
        // Implement logic or return a default value
        return 0;
    }

        @Override
    public String getNombre() {
        // Implement logic or return a default value
        return "HDC";
    }
}
