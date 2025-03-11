package one.digitalinnovation.gof.strategy;

public class ComportamentoPatrulha implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Patrulhando a \u00E1rea...");
    }
}