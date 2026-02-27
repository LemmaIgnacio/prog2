import java.util.ArrayList;

public class Wallpaper extends Elemento{
    private ArrayList<String> palabraClave = new ArrayList<>();
    public Wallpaper(String titulo, int descargas, Usuario u, int anio){
        super(titulo,descargas,u,anio);
    }

    @Override
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public ArrayList<String> getPalabraClave() {
        return new ArrayList<>(palabraClave);
    }

    public void addPalabraClave(String s) {
        palabraClave.add(s);
    }
    @Override
    public int getDescargas(){
        return descargas;
    }
    @Override
    public int getTamanio(){
        return 1;
    }

    @Override
    public boolean contienePalabraClave(String s){
        if (palabraClave.contains(s)){
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c){
        ArrayList<Elemento> res = new ArrayList<>();
        if (c.cumple(this)){
            res.add(this);
        }
        return res;
    }
}

