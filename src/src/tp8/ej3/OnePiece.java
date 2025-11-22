package tp8.ej3;

public abstract class OnePiece {
    protected String nombre;

    public OnePiece(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract int getFuerza();
    public abstract int getCantPj();
    public abstract int getEdad();
    public abstract int getPeso();
}
