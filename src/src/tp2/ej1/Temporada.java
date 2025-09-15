import java.util.ArrayList;
public class Temporada {
    private int numero;
    private ArrayList<Capitulo> capitulos;
    
    public Temporada(int numero) {
        this.numero = numero;
        this.capitulos = new ArrayList<Capitulo>();
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    //Obtener el total de episodios vistos de una temporada particular.
    public int getEpVistos(){
        int contador = 0;
        for(int i = 0; i < capitulos.size(); i++){
            if (capitulos.get(i).getFlag()) {
                contador++;
            }
        }
        return contador;
    }

    //Obtener el promedio de las calificaciones dadas para una temporada particular.
    public double getPromedioCalificaciones(){
        double suma = 0;
        double calificacion = 0;
        int contador = 0;
        for(int i = 0; i < capitulos.size(); i++){
            calificacion = capitulos.get(i).getCalificacion();
            if( calificacion >= 0){
                suma += calificacion;
                contador++;
            }
        }
        if (contador > 0) {
            return suma/contador;
        } else{
            return 0;
        }
    }

    public boolean estaCompleta() {
        int contador = 0;
        for (int i = 0; i < capitulos.size(); i++) {
            if (capitulos.get(i).getFlag()) {
                contador++;
            }
        }
        return contador == capitulos.size();
    }
    

    @Override
    public String toString() {
        return "Temporada [numero=" + numero + ", capitulos=" + capitulos + "]";
    }
}
