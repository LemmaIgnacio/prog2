package recuperatorios.papanoelylosduendes;

import java.util.ArrayList;

public abstract class Cuadrilla extends Taller{
    protected ArrayList<Taller> duendes;
    public Cuadrilla(){
        this.duendes = new ArrayList<>();
    }

    public void addMiembro(Taller e) {
        duendes.add(e);
    }

    public ArrayList<Taller> getDuendes() {
        return new ArrayList<>(duendes);
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> res = new ArrayList<>();
        for (Taller e : duendes) {
            ArrayList<String> habsElemento = e.getHabilidades();
            for (String h : habsElemento) {
                if (!res.contains(h)) {
                    res.add(h);
                }
            }
        }
        return res;
    }
    

    @Override
    public ArrayList<Duende> buscar(Condicion c){
        ArrayList <Duende> res = new ArrayList<>();
        for(Taller d : duendes){
            res.addAll(d.buscarDuendes(c));
        }
        return res;
    }

    @Override
    public Taller copiar() {
        Cuadrilla copia = (Cuadrilla) this.clonar();
        for (Taller e : duendes) {
            copia.addMiembro(e.copiar());
        }
        return copia;
    }
}
