package tp3.ej3;

public class Juego2v2 extends Juego{
    private Personaje j3;
    private Personaje j4;
    
    public Juego2v2(Personaje j1, Personaje j2, Personaje j3, Personaje j4){
        super(j1, j2);
        this.j3 = j3;
        this.j4 = j4;
    }


    @Override
    public int peleaVelocidad() {
        int velocidadHeroes = j1.getVelocidad() + j2.getVelocidad();
        int velocidadVillanos = j3.getVelocidad() + j4.getVelocidad();
        if (velocidadHeroes > velocidadVillanos) {
            return 1;
        } else if (velocidadHeroes < velocidadVillanos) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int peleaFuerza() {
        int fuerzaHeroes = j1.getFuerza() + j2.getFuerza();
        int fuerzaVillanos = j3.getFuerza() + j4.getFuerza();
        if (fuerzaHeroes > fuerzaVillanos) {
            return 1;
        } else if (fuerzaHeroes < fuerzaVillanos) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int peleaEdad() {
        int edadHeroes = j1.getEdad() + j2.getEdad();
        int edadVillanos = j3.getEdad() + j4.getEdad();
        if (edadHeroes > edadVillanos) {
            return 1;
        } else if (edadHeroes < edadVillanos) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int peleaAltura() {
        double alturaHeroes = j1.getAltura() + j2.getAltura();
        double alturaVillanos = j3.getAltura() + j4.getAltura();
        if (alturaHeroes > alturaVillanos) {
            return 1;
        } else if (alturaHeroes < alturaVillanos) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
        public void resultado(int resultado, int desempate){
        if (resultado == 1) {
                System.out.println(j1.getNombre() + " y " + j2.getNombre() + " HAN GANADO");
            }else if (resultado == 0){
                System.out.println("EMPATE TECNICO");
                desempate++;
            }else{
                System.out.println(j3.getNombre() + " y " + j4.getNombre() + " HAN GANADO");
            }
    }


}
