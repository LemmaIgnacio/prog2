package tp7.ej2;

import java.util.ArrayList;

public class Historiador {
    private ArrayList<Documento> documentos;

    public Historiador(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public ArrayList<Documento> getPalabraClave(){
        return new ArrayList<>(documentos);
    }

    public void setPalabraClave(ArrayList<Documento> palabraClave){
        this.documentos = new ArrayList<>(palabraClave);
    }

    public ArrayList<Documento> buscar(Condicion c){
        ArrayList<Documento> r = new ArrayList<>();
        for (Documento d : documentos) {
            if (c.cumple(d)) {
                r.add(d);
            }
        }
        return r;
    }
}
