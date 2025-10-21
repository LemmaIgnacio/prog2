package tp3.ej3;

public class Villano extends Personaje {

    public Villano (String nombre_real, String nombre, boolean vision_nocturna, int velocidad, int fuerza,
            double altura, int edad){
        super(nombre_real, nombre, vision_nocturna, velocidad, fuerza, altura, edad); 
    }

        @Override
    public String toString() {
        return "Villano [nombre_real=" + nombre_real + ", nombre=" + nombre + ", vision_nocturna=" + vision_nocturna
                + ", velocidad=" + velocidad + ", fuerza=" + fuerza + ", altura=" + altura + ", edad=" + edad + "]";
    }
}
