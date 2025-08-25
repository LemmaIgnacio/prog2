import java.time.LocalDate;
public class Alumno {
    
    int dni; //El DNI es un valor obligatorio, no posee valor por defecto.
    LocalDate fechaNacimiento;
    char sexo;
    String nombre;
    String apellido;
    double peso;
    double altura;

    // constructor por default
    public Alumno(int dni){
        this.dni = dni;
        this.fechaNacimiento = LocalDate.of(2000, 1, 1); //En caso de la fecha de nacimiento será el 1 de enero de 2000.
        this.sexo = 'f'; //Sexo será Femenino por defecto.
        //El nombre por defecto es N y el apellido es N.
        this.nombre = "N"; 
        this.apellido = "N";
        //El peso y la altura son 1 por defecto.
        this.peso = 1.0;
        this.altura = 1.0;
    }

    // constructor para llenar datos
    public Alumno(int dni, String nombre, String apellido, LocalDate fechaNacimiento, char sexo, double peso, double altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters (Métodos set de cada parámetro, excepto de DNI.)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
}



    // Saber si está en forma. Está en forma si el índice de masa corporal se encuentra 
    // entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).

    public double calcularImc(){
        if(this.altura > 0){
            return (this.peso / (this.altura * this.altura));
        }
        return 0;
    }

    //Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
    // entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
    public boolean estaEnForma(){
        double imc = calcularImc();
        return imc >= 18.5 && imc <= 25;
    }

    //Saber si está cumpliendo años.
    public boolean cumpleAños(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getDayOfMonth() == this.fechaNacimiento.getDayOfMonth() && 
                fechaActual.getMonth() == this.fechaNacimiento.getMonth();
    } // En clase 1, esta el pdf que explica las fechas!

    //Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18 años
    public boolean esMayorEdad(){
        return calcularEdad() >= 18;
    }

    //Saber si puede votar. Es necesario ser mayor de 16 años.
    public boolean puedeVotar(){
        return calcularEdad() >= 16;
    }

    //metodo auxiliar para evitar repeticion de codigo:
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - this.fechaNacimiento.getYear();
        return edad;
    }

    //Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
    public boolean edadCoherente(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate cumpleEsteAño = this.fechaNacimiento.withYear(fechaActual.getYear());
        //Se comprueba si la fecha actual es antes del cumpleaños de este año
        // Si la fecha actual esta antes, la edad no coincide ya que no cumplio años aún
        // La negación va para que el TRUE signifique edad coherente y no al reves
        return !(fechaActual.isBefore(cumpleEsteAño));
    }
    // Mostrar toda la información del objeto. Es decir devolver un String con la información del mismo.
    public String informacionAlumno(){
        return "Alumno " + nombre + " " + apellido + "\n" + 
                "DNI: " + dni + "\n" +
                "Sexo: " + sexo + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso (KG): " + peso +  "\n" +
                "Altura (M): " + altura;
    }

}
