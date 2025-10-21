package tp3.ej3;

public class Personaje {
    protected String nombre_real;
    protected String nombre;
    protected boolean vision_nocturna;
    protected int velocidad;
    protected int fuerza;
    protected double altura;
    protected int edad;

    

    public Personaje(String nombre_real, String nombre, boolean vision_nocturna, int velocidad, int fuerza,
            double altura, int edad) {
        this.nombre_real = nombre_real;
        this.nombre = nombre;
        this.vision_nocturna = vision_nocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.altura = altura;
        this.edad = edad;
    }
    public String getNombre_real() {
        return nombre_real;
    }
    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isVision_nocturna() {
        return vision_nocturna;
    }
    public void setVision_nocturna(boolean vision_nocturna) {
        this.vision_nocturna = vision_nocturna;
    }
    public int getVelocidad(){
        if(vision_nocturna){
            return velocidad+10;
        }else{
            return velocidad;
        }
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return "Personaje [nombre_real=" + nombre_real + ", nombre=" + nombre + ", vision_nocturna=" + vision_nocturna
                + ", velocidad=" + velocidad + ", fuerza=" + fuerza + ", altura=" + altura + ", edad=" + edad + "]";
    }

    

}
