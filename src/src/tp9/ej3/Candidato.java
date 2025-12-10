package tp9.ej3;

public class Candidato extends Persona{
    private String nombre;
    private String po;
    private String agr;
    public Candidato(String nombre, String po, String agr, int dni) {
        super(dni);
        this.nombre = nombre;
        this.po = po;
        this.agr = agr;
    }
    
    
}
