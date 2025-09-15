package tp2.ej3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Pais p = new Pais("Argentina", null);
        
        ArrayList<Provincia> provincias = new ArrayList<>();
        p.setProvincias(provincias);
        ArrayList<Ciudad> ciudades1 = new ArrayList<>();
        ArrayList<Ciudad> ciudades2 = new ArrayList<>();
        ArrayList<Ciudad> ciudades3 = new ArrayList<>();
        ArrayList<Ciudad> ciudades4 = new ArrayList<>();
        ArrayList<Ciudad> ciudades5 = new ArrayList<>();
        ArrayList<Ciudad> ciudades6 = new ArrayList<>();

        Ciudad c1 = new Ciudad("La Plata", 800000, 500000, 300000, 200000, 100000, 50000, 1200000);
        Ciudad c2 = new Ciudad("Mar del Plata", 600000, 400000, 250000, 150000, 80000, 40000, 900000);
        Ciudad c3 = new Ciudad("Bahia Blanca", 350000, 200000, 120000, 80000, 40000, 20000, 500000);
        Ciudad c4 = new Ciudad("Cordoba", 1500000, 900000, 600000, 400000, 200000, 100000, 2500000);
        Ciudad c5 = new Ciudad("Rosario", 1300000, 800000, 500000, 300000, 150000, 75000, 2200000);
        Ciudad c6 = new Ciudad("Santa Fe", 400000, 250000, 150000, 80000, 40000, 20000, 600000);

        ciudades1.add(c1);
        ciudades1.add(c2);  
        ciudades1.add(c3);
        ciudades2.add(c4);
        ciudades3.add(c5);
        ciudades4.add(c6);
        ciudades5.add(c1);
        ciudades5.add(c4);
        ciudades6.add(c2);
        ciudades6.add(c5);
        ciudades6.add(c6);

        Provincia prov1 = new Provincia("Buenos Aires", ciudades1);
        Provincia prov2 = new Provincia("Cordoba", ciudades2);
        Provincia prov3 = new Provincia("Santa Fe", ciudades3);
        Provincia prov4 = new Provincia("Entre Rios", ciudades4);
        Provincia prov5 = new Provincia("Mendoza", ciudades5);
        Provincia prov6 = new Provincia("Tucuman", ciudades6);
        provincias.add(prov1);
        provincias.add(prov2);
        provincias.add(prov3);
        provincias.add(prov4);
        provincias.add(prov5);
        provincias.add(prov6);

        
        System.out.println(p.provinciasConDeficit());

        
    }
}
