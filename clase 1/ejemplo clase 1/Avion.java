
public class Avion {
   //ATRIBUTOS
	private String modelo;
	private String color;
	private int capacidad;
	
	
	public Avion() {
		this("Blanco");
		System.out.println("solo");
	}
	
	public Avion(String nuevoColor) {
		this(nuevoColor,"otro");
		System.out.println("uno");
	}
	
	public Avion(String nuevoColor, String nuevoModelo) {
		this(nuevoColor,nuevoModelo,243);
		System.out.println("dos");
	}
	
	public Avion(int capacidad, String nuevoModelo) {
		this("Blanco",nuevoModelo,capacidad);
	}
	
	public Avion(String color, String nuevoModelo, int cap) {
		System.out.println("tres");
		this.setModelo(nuevoModelo);
		this.setColor(color);
		this.setCapacidad(cap);
	}
	
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		if (capacidad >=0 ) {
			this.capacidad = capacidad;
		} else {
			this.capacidad = 100;
		}
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String nuevoModelo) {
	   modelo = nuevoModelo;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String nuevoColor) {
	   if (!nuevoColor.equalsIgnoreCase("Celeste"))
			 color = nuevoColor;
	   else 
		   color ="Blanco";
	}
	
}
