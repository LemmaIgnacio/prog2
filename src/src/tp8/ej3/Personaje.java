package tp8.ej3;

public class Personaje extends OnePiece{
    private int edad;
    private int peso;
    private int fuerza;
    private String fruta;

    public Personaje(int edad, int peso, int fuerza, String nombre, String fruta){
        super(nombre);
        this.edad = edad;
        this.peso = peso;
        this.fuerza = fuerza;
        this.fruta = fruta;
    }

    public String getFruta() {
        return fruta;
    }

    @Override
    public int getPeso(){
        return this.peso;
    }

    @Override
    public int getEdad(){
        return this.edad;
    }

    @Override
    public int getFuerza(){
        switch (fruta) {
            case "paramecia":
                return fuerza * 10;
            case "zoan":
                return fuerza * getPeso() * 7;
            case "logia": 
                return fuerza * getPeso() * 10;
            default:
                if (fuerza <= 0) { // si la fuerza no fue setteada o no tiene da por default 125.
                    return fuerza = 125;
                }else{
                    return fuerza;
                }
        }
    }

    @Override
    public int getCantPj(){
        return 1;
    }
}
