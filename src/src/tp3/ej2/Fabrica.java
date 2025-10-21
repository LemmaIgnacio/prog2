package tp3.ej2;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Mueble> muebles;

    public Fabrica(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

        public void productosEnStock (){
        for (Mueble mueble : muebles) {
            if (mueble.isStock()) {
                System.out.println(mueble);
            }
            
        }
    }
}
