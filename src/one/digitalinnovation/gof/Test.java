package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        // Testando Singleton
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager.getInfo()); // Saída: Instância SingletonEager criada!

        // Testando Strategy
        Robo roboInteligente = RoboFactory.criarRoboInteligente();
        roboInteligente.mover(); // Saída: Seguindo em direção ao objetivo...

        Robo roboCurioso = RoboFactory.criarRoboCurioso();
        roboCurioso.mover(); // Saída: Explorando o ambiente curiosamente...

        Robo roboEvasivo = RoboFactory.criarRoboEvasivo();
        roboEvasivo.mover(); // Saída: Movendo-se de forma evasiva...

        Robo roboPatrulha = RoboFactory.criarRoboPatrulha();
        roboPatrulha.mover(); // Saída: Patrulhando a área...

        // Testando Facade
        Facade facade = new Facade();
        facade.migrarCliente("Jo\u00E3o", "14801788");
        // Saída esperada:
        // Notificação enviada: Cliente João migrado com sucesso!
    }
}