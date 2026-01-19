package tp2.ej3;

public class Ciudad {
    private int imp1;
    private int imp2;
    private int imp3;
    private int imp4;
    private int imp5;
    
    private String nombre;
    private int poblacion;
    private int gastoPublico;
    
    public Ciudad(int imp1, int imp2, int imp3, int imp4, int imp5, String nombre, int poblacion, int gastoPublico) {
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.gastoPublico = gastoPublico;
    }
    public int getImp1() {
        return imp1;
    }
    public void setImp1(int imp1) {
        this.imp1 = imp1;
    }
    public int getImp2() {
        return imp2;
    }
    public void setImp2(int imp2) {
        this.imp2 = imp2;
    }
    public int getImp3() {
        return imp3;
    }
    public void setImp3(int imp3) {
        this.imp3 = imp3;
    }
    public int getImp4() {
        return imp4;
    }
    public void setImp4(int imp4) {
        this.imp4 = imp4;
    }
    public int getImp5() {
        return imp5;
    }
    public void setImp5(int imp5) {
        this.imp5 = imp5;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public int getGastoPublico() {
        return gastoPublico;
    }
    public void setGastoPublico(int gastoPublico) {
        this.gastoPublico = gastoPublico;
    }

    public int calcularDeficit(){
        int total = getImp1() + getImp2() + getImp3() + getImp4() + getImp5();
        return total - getGastoPublico();
    }

    public boolean tieneDeficit(){
        if (getPoblacion() < 100000) {
            return false;
        }
        return calcularDeficit() <= 0;
    }

    public int getTamanio(){
        return 1;
    }
    @Override
    public String toString() {
        return "Ciudad [nombre=" + nombre + ", poblacion=" + poblacion + ", gastoPublico=" + gastoPublico
                + ", tieneDeficit()=" + tieneDeficit() + "]";
    }
}
