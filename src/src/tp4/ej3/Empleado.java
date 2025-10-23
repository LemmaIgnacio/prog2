package tp4.ej3;

public class Empleado {
    protected int id;
    protected int salario;

    public Empleado(int id, int salario) {
        this.id = id;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", salario=" + salario + "]";
    }


}
