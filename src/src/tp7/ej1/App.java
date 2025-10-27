package tp7.ej1;

public class App {
    public static void main(String[] args) {
        Agricola empresa = new Agricola();

        // === Productos ===
        Agroquimico a1 = new Agroquimico("FungiStop");
        a1.addEstadoQueTrata("manchas");
        a1.addEstadoQueTrata("caida de hojas");
        a1.addCultivoDesaconsejado("girasol");

        Agroquimico a2 = new Agroquimico("InsectOff");
        a2.addEstadoQueTrata("hojas amarillas");
        a2.addEstadoQueTrata("deshidratacion");

        empresa.addProducto(a1);
        empresa.addProducto(a2);

        // === Enfermedad ===
        Enfermedad cochinilla = new Enfermedad("Cochinilla");
        cochinilla.addEstado("hojas amarillas");
        cochinilla.addEstado("deshidratacion");

        // === Cultivo ===
        Cultivo girasol = new Cultivo("Girasol");

        // === Condiciones ===
        Condicion c1 = new CondicionTrataEnfermedad(cochinilla);
        Condicion c2 = new CondicionAptaParaCultivo(girasol);
        Condicion c3 = new CondicionAnd(c1, c2);

        System.out.println("Agroquímicos que tratan Cochinilla y son aptos para Girasol:");
        System.out.println(empresa.buscar(c3));
    }
}
