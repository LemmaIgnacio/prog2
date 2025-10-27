package tp6.ej1;

public class Vehiculo extends Item{
    private String marca;
    private String patetente;
    private int km;
    private String tipo;
    private boolean alquilado;
    
    public Vehiculo(String marca, String patetente, int km, String tipo, boolean alquilado) {
        this.marca = marca;
        this.patetente = patetente;
        this.km = km;
        this.tipo = tipo;
        this.alquilado =  alquilado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPatetente() {
        return patetente;
    }
    public void setPatetente(String patetente) {
        this.patetente = patetente;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean puedeAlquilar(){
        return !alquilado;
    }

    @Override
    public void alquilar(Cliente c) {
        if (puedeAlquilar()) {
            alquilado = true;
            c.agregarItemAlquilado(this);
        }
    }
}

