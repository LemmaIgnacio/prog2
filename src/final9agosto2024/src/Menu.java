import java.util.ArrayList;

public class Menu extends Elemento{
    private ArrayList<Elemento> elementos = new ArrayList<>();
    private double descuento;
    public Menu(double descuento){
        this.descuento = descuento;
    }

    public void addElementos(Elemento e){
        elementos.add(e);
    }

    public ArrayList<Elemento> getElementos (){
        return new ArrayList<>(elementos);
    }

    @Override
    public  int getTiempoPreparacion(){
        int mayor = 0;
        for (Elemento e : elementos){
            if (e.getTiempoPreparacion() > mayor)
            mayor = e.getTiempoPreparacion();
        }
        return mayor;
    }
    @Override
    public  double getPrecio(){
        double total = 0;
        for (Elemento e : elementos){
            total += e.getPrecio();
        }
        return total - calcularDescuento(total);
    }

    public double calcularDescuento(double total){
        return total * descuento;
    }

    @Override
    public  int getCalorias(){
        int total = 0;
        for(Elemento e : elementos){
            total += e.getCalorias();
        }
        return total;
    }

    @Override
    public  ArrayList<String> getIngredientes(){
        ArrayList<String> salida = new ArrayList<>();
        for (Elemento e : elementos){
            for (String ingredientes : e.getIngredientes()){
                if(!salida.contains(ingredientes)){
                    salida.add(ingredientes);
                }
            }
        }
        return salida;
    }

    @Override
    public  ArrayList<Elemento> buscar (Condicion c){
        ArrayList<Elemento> salida = new ArrayList<>();
        for (Elemento e : elementos){
            salida.addAll(e.buscar(c));
        }
        return salida;
    }

}

// MENU (COMPUESTO)
// ATRIBUTOS
//  ARRAYLIST ELEMENTOS

// METODOS
// TIEMPO PREPARACION -> MAYOR DE SUS TIEMPOS .
//  PRECIO -> SUMA DE SUS PARTES - 10% .
// CALORIAS -> SUMA DE SUS ELEMENTOS
// INGREDIENTES -> UNION DE SUS ELEMENTOS SIN REPETIDOS
// ADD ELEMENTO
// BUSCAR NO DEVOLVER MENU SOLO LAS COMIDAS