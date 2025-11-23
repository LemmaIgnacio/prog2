package sistemaArchivosTP9.condiciones;

import sistemaArchivosTP9.ElementoSA;

import java.time.LocalDate;

public class CondicionFechaPosterior extends Condicion{
    LocalDate fechaMinima;

    public CondicionFechaPosterior(LocalDate fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    @Override
    public boolean cumple(ElementoSA archivo) {
        return archivo.getFechaCreacion().isAfter(fechaMinima);
    }
}
