public class CondicionPalabraClave implements Condicion{
    private String pc;

    public CondicionPalabraClave(String pc) {
        this.pc = pc;
    }
    @Override
    public boolean cumple(Elemento e){
        return e.getPalabraClave().contains(pc);
    }
}
