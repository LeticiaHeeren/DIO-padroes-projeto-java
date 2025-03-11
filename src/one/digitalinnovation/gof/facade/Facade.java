package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;
import subsistema3.notificacao.NotificacaoService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

        // Adicionando notificação
        NotificacaoService notificacaoService = new NotificacaoService();
        notificacaoService.enviarNotificacao("Cliente " + nome + " migrado com sucesso!");
    }
}