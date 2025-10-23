package tp4.ej4;


public class Integrante {
        protected String name;
        protected String apellido;
        protected int numPassport;
        protected String bornDate;
        protected String estado;

        public Integrante(String name, String apellido, int numPassport, String bornDate, String estado) {
            this.name = name;
            this.apellido = apellido;
            this.numPassport = numPassport;
            this.bornDate = bornDate;
            this.estado = estado;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getNumPassport() {
            return numPassport;
        }

        public void setNumPassport(int numPassport) {
            this.numPassport = numPassport;
        }

        public String getBornDate() {
            return bornDate;
        }

        public void setBornDate(String bornDate) {
            this.bornDate = bornDate;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public void mostrarEstado(){
            if (estado.equals("En pais de origen")) {
                System.out.println(toString() + " puede asistir al evento solidario");
            } else  {
                System.out.println(toString() + " no puede asistir al evento");
            }
        }

        @Override
        public String toString() {
            return "Integrante [name=" + name + ", apellido=" + apellido + ", estado=" + estado + "]";
        }

        
        
}
