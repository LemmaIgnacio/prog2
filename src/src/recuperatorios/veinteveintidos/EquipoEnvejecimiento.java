package recuperatorios.veinteveintidos;


public class EquipoEnvejecimiento extends EquipoCompuesto {
    private static int limiteAntiguedad = 25;

    public EquipoEnvejecimiento(int codigo) {
        super(codigo);
    }

    @Override
    public int getValor() {
        int total = 0;
        for (Equipo e : equipos) {
            if (e.getAntiguedad() > limiteAntiguedad)
                total += e.getValor() / 2;
            else
                total += e.getValor();
        }
        return total;
    }





    //no cuentan
    @Override
    public int getAntiguedad() {
        int max = 0;
        for (Equipo e : equipos) {
            if (e.getAntiguedad() > max)
                max = e.getAntiguedad();
        }
        return max;
    }

    @Override
    public int getCodigo() { return codigo; }

    @Override
    public String getDescripcion() {
        return "Equipo Envejecimiento (" + equipos.size() + " equipos)";
    }
}

