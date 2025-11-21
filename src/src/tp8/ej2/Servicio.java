package tp8.ej2;

public abstract class Servicio {
    protected int tracking;
    protected String ciudad;
    public Servicio(int tracking, String ciudad){
        this.tracking = tracking;
        this.ciudad = ciudad;
    }

    public int getTracking(){
        return this.tracking;
    }
    public String getCiudad(){
        return ciudad;
    }

    public abstract void setTracking(int t);
    public abstract int getPeso();
    public abstract String getDestinatario();
    public abstract String getRemitente();
    public abstract String getDireccion();
}
