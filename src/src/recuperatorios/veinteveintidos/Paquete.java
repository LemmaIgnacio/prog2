package recuperatorios.veinteveintidos;

public class Paquete extends EquipoCompuesto {

    public Paquete(int codigo){
        super(codigo);
    }

    @Override
    public int getAntiguedad(){
        int max = 0;
        for (Equipo ec : equipos) {
            if(ec.getAntiguedad() > max){
                max = ec.getAntiguedad();
            }
        }
        return max;
    }

    @Override
    public int getValor(){
        int total = 0;
        for(Equipo ec : equipos){
            total += ec.getValor();
        }
        return total;
    }





    // no cuentan
    @Override
    public int getCodigo(){
        return getCodigo();
    }

    @Override
    public String getDescripcion(){
        return getDescripcion();
    }
}
