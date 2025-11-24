package tp9.ej2;

import java.util.ArrayList;

public class PistaParaTodos extends Audio {
    public PistaParaTodos(int id, String titulo, int duracion, String artista,
                String album, int anio, String genero){
        super(id, titulo, duracion, artista, album, anio, genero);
    }


    @Override
    public ArrayList<Elemento> buscar(Condicion c){
        ArrayList<Elemento> res = new ArrayList<>();
        res.add(this);
        return res;
    }
}
