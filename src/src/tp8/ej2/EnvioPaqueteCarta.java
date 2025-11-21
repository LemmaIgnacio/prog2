package tp8.ej2;

public class EnvioPaqueteCarta extends Servicio {
    private String destinatario;
    private String desDireccion;
    private String remitente;
    private String remDireccion;
    private boolean retiroDomicilio; // si es true retira a domicilio, si es false es que retira en sucursal
    private int peso;

    public EnvioPaqueteCarta(String destinatario, String desDireccion, String remitente, String remDireccion,
                            boolean retiroDomicilio, int peso, int tracking, String ciudad) {
        super(tracking, ciudad);
        this.destinatario = destinatario;
        this.desDireccion = desDireccion;
        this.remitente = remitente;
        this.remDireccion =  remDireccion;
        this.retiroDomicilio = retiroDomicilio;
        this.peso = peso;
    }


    public String getRemDireccion(){
        return this.remDireccion;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }

    public boolean isRetiroDomicilio(){
        return retiroDomicilio;
    }

    @Override
    public int getPeso(){
        return peso;
    }

    @Override
    public String getDestinatario(){
        return destinatario;
    }

    @Override
    public String getDireccion(){
        return this.desDireccion;
    }

    @Override
    public String getRemitente(){
        return this.remitente;
    }

    @Override
    public void setTracking(int t){
        this.tracking = t;
    }
}
