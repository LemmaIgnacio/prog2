
public class Especial extends Basico {

    String especialidad;
    
	public Especial(String no, int emp, int dias, CalculadorCosto cc, String esp) {
		super(no, emp, dias, cc);
		especialidad = esp;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
    

		
}
