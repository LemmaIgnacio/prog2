package sistemaArchivosTP9;

public class Main {

    public static void main(String[] args) {
        Directorio raiz = new Directorio("//");
        Directorio tudai = new Directorio("TUDAI");
        Directorio fotos = new Directorio("Fotos");
        Directorio pacman = new Directorio("Pacman");

        Directorio anio1 = new Directorio("1er año");
        Directorio anio2 = new Directorio("2do año");
        Directorio prog2 = new Directorio("Prog2");

        Directorio paisajes = new Directorio("Paisajes");
        Comprimido selfies = new Comprimido("Selfies",.5);

        Archivo parcial = new Archivo("parcial.doc", 100);
        Archivo recu = new Archivo("recu.pdf", 200);
        Archivo prefi = new Archivo("prefi.txt", 300);

        Archivo calendario = new Archivo("calendario", 10);

        Archivo selfie1 = new Archivo("selfie.jpg", 25);
        Archivo selfie2 = new Archivo("rindiendo el parcial.jpg", 25);
        Archivo selfie3 = new Archivo("cara de recu.gif", 25);
        Archivo selfie4 = new Archivo("firulais.jpg", 25);

        raiz.addElemento(tudai);
        raiz.addElemento(fotos);
        raiz.addElemento(pacman);

        tudai.addElemento(anio1);
        tudai.addElemento(calendario);
        tudai.addElemento(anio2);

        anio1.addElemento(prog2);
        prog2.addElemento(parcial);
        prog2.addElemento(recu);
        prog2.addElemento(prefi);

        fotos.addElemento(selfies);
        fotos.addElemento(paisajes);

        selfies.addElemento(selfie1);
        selfies.addElemento(selfie2);
        selfies.addElemento(selfie3);
        selfies.addElemento(selfie4);

        System.out.println("Tamanio total: " + raiz.getTamanio());

        System.out.println("Cantidad total de elementos: " + raiz.cantElementos());

        AccesoDirecto accesoDirectoAPrefi = new AccesoDirecto(prefi);
        raiz.addElemento(accesoDirectoAPrefi);

    }
}
