package tp3.ej4;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;

    public Celular(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void mostrarContactos(){
        for (Contacto contactos : contactos) {
            System.out.println(contactos);
        }
    }

    public void mostrarContactosRepetidos(){
        for (Contacto contactos : contactos) {
            if (contactoRepetido(contactos)) {
                System.out.println("el contacto " + contactos + " esta repetido");
            }
        }
    }


    public int promedioEdades(){
        int promedio = 0;
        for (Contacto contactos : contactos){
            if (contactoRepetido(contactos)) {
                promedio += contactos.getEdad();
            }
        }
        return promedio/contactos.size();
    }

public boolean contactoRepetido(Contacto c) {
    int count = 0;
    for (Contacto otro : contactos) {
        if (c.getNombre().equals(otro.getNombre()) &&
            c.getApellido().equals(otro.getApellido()) &&
            c.getNum_phone().equals(otro.getNum_phone())) {
            count++;
        }
    }
    return count > 1;
}



}
