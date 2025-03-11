package one.digitalinnovation.gof.singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

    // Novo método adicionado
    public String getInfo() {
        return "Inst\u00E2ncia SingletonEager criada!";
    }
}