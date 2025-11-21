package recuperatorios.veinteveintidos;

import java.util.ArrayList;

public abstract class EquipoCompuesto extends Equipo {
    protected ArrayList <Equipo> equipos;

    public EquipoCompuesto(int codigo) {
        super(codigo);
        this.equipos = new ArrayList<>();
    }

        public void addEquipo(Equipo e) {
        equipos.add(e);
    }

    public ArrayList<Equipo> getEquipos() {
        return new ArrayList<>(equipos);
    }

    
}
