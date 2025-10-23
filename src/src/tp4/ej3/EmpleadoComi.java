package tp4.ej3;

public class EmpleadoComi extends Empleado {
    private double comision;
    private int cantVentas;
    public EmpleadoComi (int id, int salario, double comision, int cantVentas){
        super(id, salario);
        this.comision = comision;
        this.cantVentas = cantVentas;
    }

    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }


    public int calcComision(){
        return (int) (cantVentas * comision);
    }

    @Override
    public int getSalario() {
        return salario + calcComision();
    }

    @Override
    public String toString() {
        return "Empleado x Comision [id=" + id + ", salario=" + getSalario() + "]";
    }

    
    
}
