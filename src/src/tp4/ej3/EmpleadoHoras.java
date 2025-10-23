package tp4.ej3;

public class EmpleadoHoras extends Empleado {
    private int cantHoras;
    public EmpleadoHoras (int id, int salario, int cantHoras){
        super(id, salario);
        this.cantHoras = cantHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }
    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int calcHorasExtra(){
        return salario + (100* cantHoras);
    }

    @Override    
    public int getSalario() {
        return salario + calcHorasExtra();
    }

    @Override
    public String toString() {
        return "Empleado x Horas [id=" + id + ", salario=" + getSalario() + "]";
    }

    
}
