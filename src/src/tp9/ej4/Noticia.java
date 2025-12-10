package tp9.ej4;

import java.util.ArrayList;

public class Noticia extends SW{
    private String titulo;
    private String intro;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> PalabrasClave;
    public Noticia(String titulo, String intro, String texto, String autor, String link) {
        this.titulo = titulo;
        this.intro = intro;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        PalabrasClave = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public String getIntro() {
        return intro;
    }
    public String getTexto() {
        return texto;
    }
    public String getAutor() {
        return autor;
    }
    public String getLink() {
        return link;
    }
    public ArrayList<String> getPalabrasClave(){
        return new ArrayList<>(PalabrasClave);
    }
    public void addPalabrasClave(String s){
        PalabrasClave.add(s);
    }

    @Override
    public int getCantidad(){
        return 1;
    }

    @Override
    public ArrayList<SW> buscar(Condicion c){
        ArrayList<SW> res = new ArrayList<>();
        if (c.cumple(this)) {
            res.add(this);
        }
        return res;
    }
    
}
