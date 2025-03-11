# DIO-PADROES-PROJETO-JAVA

Este projeto demonstra a aplicação de padrões de design em Java, incluindo Singleton, Strategy e Facade.

## Padrões Implementados

### Singleton
- `SingletonEager`: Cria a instância imediatamente.
- `SingletonLazy`: Cria a instância apenas quando necessário.
- `SingletonLazyHolder`: Usa uma classe interna estática para garantir thread-safety.

### Strategy
- `Comportamento`: Interface que define o método `mover()`.
- `ComportamentoAgressivo`, `ComportamentoDefensivo`, `ComportamentoNormal`, `ComportamentoInteligente`, `ComportamentoCurioso`, `ComportamentoEvasivo`, `ComportamentoPatrulha`: Implementações de comportamentos para o robô.
- `Robo`: Classe que usa uma estratégia de comportamento.
- `RoboFactory`: Fábrica para criar robôs com diferentes comportamentos.

### Facade
- `Facade`: Simplifica a interação com subsistemas de CRM e CEP.
- `CepApi`: Subsistema para buscar informações de CEP.
- `CrmService`: Subsistema para gravar informações do cliente.
- `NotificacaoService`: Subsistema para enviar notificações.

## Como Executar
1. Clone o repositório.
2. Importe o projeto na sua IDE.
3. Execute a classe `Test.java` para ver os padrões em ação.