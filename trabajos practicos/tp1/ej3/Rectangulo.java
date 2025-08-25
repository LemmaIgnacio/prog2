public class Rectangulo {
    PuntoGeometrico p1;
    PuntoGeometrico p2;

    public Rectangulo() {
        this.p1 = new PuntoGeometrico(0, 0);
        this.p2 = new PuntoGeometrico(0, 0);
    }
    

    public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    


    //Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e Y
    public void desplazar(int dx, int dy) {
        p1.desplazar(dx, dy);
        p2.desplazar(dx, dy);
    }
    

    // Solucion de Copilot para evitar que los valores queden negativos
    // ya que la base del ejemplo sin el Math.abs queda en -3
    // con esta funcion hace que los valores sean absolutos (positivos)
    public int base() {
        return Math.abs(p2.getPuntoX() - p1.getPuntoX());
    }
    
    public int altura() {
        return Math.abs(p2.getPuntoY() - p1.getPuntoY());
    }
    
    
    //Calcular el Área del rectángulo.
    public double area(){
        return base() * altura();
    }

    //Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
    //iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
    //del mismo es mayor que la del otro.

    public int comparar(Rectangulo p2) {
        if (this.area() > p2.area()) {
            return 1;
        } else if (this.area() == p2.area()) {
            return 0;
        } else {
            return -1;
        }
    }
    

    //Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las propiedades para que sea un cuadrado.
    public boolean esCuadrado() {
        return base() == altura();
    }
    
    //Determinar el largo del lado superior 
    // Google dice que el largo del lado superior es la base por lo que:
    public double ladoSuperior() {
        return base();
    }
    

    //Determinar si está acostado o parado (si el alto es más que el ancho).
    public String orientacion() {
        if (base() > altura()) {
            return "Acostado";
        } else if (altura() > base()) {
            return "Parado";
        } else {
            return "Cuadrado";
        }
    }
    

}
