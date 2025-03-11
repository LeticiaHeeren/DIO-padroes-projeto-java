package one.digitalinnovation.gof.strategy;

public class ComportamentoCurioso implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Explorando o ambiente curiosamente...");
    }
}