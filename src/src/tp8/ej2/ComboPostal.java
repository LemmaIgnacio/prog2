package tp8.ej2;

import java.util.ArrayList;

public class ComboPostal extends Servicio {
    private ArrayList<Servicio> servicios;
    public ComboPostal(int tracking, String ciudad){
        super(tracking, ciudad);
        this.servicios = new ArrayList<>();
    }

    public void addServicio(Servicio s){
        if (s.getCiudad().equals(this.getCiudad())) {
            s.setTracking(this.tracking);
            servicios.add(s);
        }
    }

    public ArrayList<Servicio> getComboPostal(){
        return new ArrayList<>(servicios);
    }
    
    @Override
    public String getCiudad() {
        if(servicios.isEmpty())
            return this.ciudad;
        return servicios.get(0).getCiudad();
    }

    @Override
    public void setTracking(int t){
        this.tracking = t;
        for(Servicio s : servicios){
            s.setTracking(t);
        }
    }

    @Override
    public int getPeso(){
        int total = 0;  
        for(Servicio s : servicios){
            total += s.getPeso();
        }
        return total;
    }

    @Override
    public String getDestinatario(){
        return servicios.get(0).getDestinatario();
    }

    @Override
    public String getDireccion(){
        return servicios.get(0).getDireccion();
    }

    @Override
    public String getRemitente(){
        return servicios.get(0).getRemitente();
    }

}
