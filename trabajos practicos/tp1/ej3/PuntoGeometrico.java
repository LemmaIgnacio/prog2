public class PuntoGeometrico {
    
    int x;
    int y;

    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getPuntoX (){
        return x;
    }
    public void setPuntoX (int x){
        this.x = x;
    }

    public int getPuntoY (){
        return y;
    }
    public void setPuntoY (int y){
        this.y = y;
    }

    // Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
    //del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
    //(cierto desplazamiento en X y cierto desplazamiento en Y).

    public void desplazar (int newX, int newY){
        this.x = this.x + newX;
        this.y = this.y + newY;
    }

    public String posiciones(){
        return "(" + x + "," + y + ")";
    }

    //Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
    //euclídea con otro punto acorde a la siguiente formula:
    //Distancia^2 = ( X1 – X2 )^2 + (Y1 – Y2)^2

    public double distanciaEuclidea(PuntoGeometrico p2){
        double calcX = this.x - p2.x;
        double calcY = this.y - p2.y;
        return Math.sqrt((calcX * calcX)) + ((calcY * calcY));
    }

}
