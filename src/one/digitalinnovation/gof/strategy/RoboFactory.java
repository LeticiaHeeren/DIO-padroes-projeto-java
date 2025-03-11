package one.digitalinnovation.gof.strategy;

public class RoboFactory {

    public static Robo criarRoboAgressivo() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoAgressivo());
        return robo;
    }

    public static Robo criarRoboDefensivo() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoDefensivo());
        return robo;
    }

    public static Robo criarRoboNormal() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoNormal());
        return robo;
    }

    public static Robo criarRoboInteligente() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoInteligente());
        return robo;
    }

    public static Robo criarRoboCurioso() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoCurioso());
        return robo;
    }

    public static Robo criarRoboEvasivo() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoEvasivo());
        return robo;
    }

    public static Robo criarRoboPatrulha() {
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoPatrulha());
        return robo;
    }
}