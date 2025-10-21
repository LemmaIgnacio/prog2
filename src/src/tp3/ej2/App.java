package tp3.ej2;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        
        Banco b1 = new Banco (150, 100, "Abedul", "Red", true );
        Banco b2 = new Banco (100, 200, "Abeto", "Blue", false );

        Mesa m1 = new Mesa (150, 100, "Abedul", "Red", true );
        Mesa m2 = new Mesa (250, 200, "Roble", "Cian", true );

        Silla s1 = new Silla(0, 0, null, null, false);
        Silla s2 = new Silla(0, 1000, null, null, true);
        

        ArrayList<Mueble> muebles = new ArrayList<>();
        muebles.add(b1);
        muebles.add(b2);
        muebles.add(m1);
        muebles.add(m2);
        muebles.add(s1);
        muebles.add(s2);

        Fabrica f1 = new Fabrica(muebles);
        f1.productosEnStock();
    }


}
