package tp3.ej3;

public class Juego {
    private final static int DADO = 4;
    protected Personaje j1;
    protected Personaje j2;


    

    public Juego(Personaje j1, Personaje j2) {
        this.j1 = j1;
        this.j2 = j2;
    }
    public Personaje getJ1() {
        return j1;
    }
    public void setJ1(Personaje j1) {
        this.j1 = j1;
    }
    public Personaje getJ2() {
        return j2;
    }
    public void setJ2(Personaje j2) {
        this.j2 = j2;
    }

    public void jugar(){
        int resultado = 0;
        int desempate = 0;
        while (resultado == 0 && desempate <= 10) {
            switch (tirarDado()) {
            case 1:
                resultado = peleaVelocidad();
                    System.out.println("Pelea de velocidad");
                break;
            case 2:
                resultado = peleaFuerza();
                    System.out.println("Pelea de Fuerza");
                break;
            case 3:
                resultado = peleaEdad();
                    System.out.println("Pelea de Edad");
                break;
            case 4:
                resultado = peleaAltura();
                    System.out.println("Pelea de Altura");
                break;
            default:
            System.out.println("err");
                break;
        }
        resultado(resultado, desempate);
        }
        
    }

    public void resultado(int resultado, int desempate){
        if (resultado == 1) {
                System.out.println(j1.getNombre() + " HA GANADO");
            }else if (resultado == 0){
                System.out.println("EMPATE TECNICO");
                desempate++;
            }else{
                System.out.println(j2.getNombre() + " HA GANADO");
            }
    }

    public int peleaVelocidad(){
        if (j1.getVelocidad() > j2.getVelocidad()) {
            return 1;
        }else if (j1.getVelocidad() < j2.getVelocidad()) {
            return -1;
        } else{
            return 0;
        }
    }


    public int peleaFuerza(){
        if (j1.getFuerza() > j2.getFuerza()) {
            return 1;
        }else if (j1.getFuerza() < j2.getFuerza()) {
            return -1;
        } else{
            return 0;
        }
    }

    public int peleaEdad(){
        if (j1.getEdad() > j2.getEdad()) {
            return 1;
        }else if (j1.getEdad() < j2.getEdad()) {
            return -1;
        } else{
            return 0;
        }
    }

    public int peleaAltura(){
        if (j1.getAltura() > j2.getAltura()) {
            return 1;
        }else if (j1.getAltura() < j2.getAltura()) {
            return -1;
        } else{
            return 0;
        }
}

    public int tirarDado(){
        return (int) (Math.random() * DADO) + 1 ;
    }
    
}
