# O Guia Definitivo de Proxy para compreender de forma fácil

## O que é um padrão de projeto Proxy?

O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro
objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar
ao objeto original.

## Aplicação

* Inicialização preguiçosa (proxy virtual). Este é quando você tem um objeto do serviço peso-pesado que gasta recursos
  do sistema por estar sempre rodando, mesmo quando você precisa dele de tempos em tempos.
    * Ao invés de criar um objeto quando a aplicação inicializa, você pode atrasar a inicialização do objeto para um
      momento que ele é realmente necessário.


* Controle de acesso (proxy de proteção). Este é quando você quer que apenas clientes específicos usem o objeto do
  serviço; por exemplo, quando seus objetos são partes cruciais de um sistema operacional e os clientes são várias
  aplicações iniciadas (incluindo algumas maliciosas).
    * O proxy pode passar o pedido para o objeto de serviço somente se as credenciais do cliente coincidem com certos
      critérios.

* Execução local de um serviço remoto (proxy remoto). Este é quando o objeto do serviço está localizado em um servidor
  remoto.
    * Neste caso, o proxy passa o pedido do cliente pela rede, lidando com todos os detalhes sujos pertinentes a se
      trabalhar com a rede.

* Registros de pedidos (proxy de registro). Este é quando você quer manter um histórico de pedidos ao objeto do serviço
  * O proxy pode fazer o registro de cada pedido antes de passar ao serviço.

* Cache de resultados de pedidos (proxy de cache). Este é quando você precisa colocar em cache os resultados de pedidos
  do cliente e gerenciar o ciclo de vida deste cache, especialmente se os resultados são muito grandes.
    * O proxy pode implementar o armazenamento em cache para pedidos recorrentes que sempre acabam nos mesmos
      resultados. O proxy pode usar como parâmetros dos pedidos as chaves de cache.

* Referência inteligente. Este é para quando você precisa ser capaz de se livrar de um objeto peso-pesado assim que não
  há mais clientes que o usam.
    * O proxy pode manter um registro de clientes que obtiveram uma referência ao objeto serviço ou seus resultados. De
      tempos em tempos, o proxy pode verificar com os clientes se eles ainda estão ativos. Se a lista cliente ficar
      vazia, o proxy pode remover o objeto serviço e liberar os recursos de sistema que ficaram empatados.
    * O proxy pode também fiscalizar se o cliente modificou o objeto do serviço. Então os objetos sem mudança podem ser
      reutilizados por outros clientes.

## COMO IMPLEMENTAR

1. Se não há uma interface do serviço pré existente, crie uma para fazer os objetos proxy e serviço intercomunicáveis.
   Extrair a interface da classe serviço nem sempre é possível, porque você precisaria mudar todos os clientes do
   serviço para usar aquela interface. O plano B é fazer do proxy uma subclasse da classe serviço e, dessa forma, ele
   herdará a interface do serviço.
2. Crie a classe proxy. Ela deve ter um campo para armazenar uma referência ao serviço. Geralmente proxies criam e
   gerenciam todo o ciclo de vida de seus serviços. Em raras ocasiões, um serviço é passado ao proxy através do
   construtor pelo cliente.
3. Implemente os métodos proxy de acordo com o propósito deles. Na maioria dos casos, após realizar algum trabalho, o
   proxy deve delegar o trabalho para o objeto do serviço.
4. Considere introduzir um método de criação que decide se o cliente obtém um proxy ou serviço real. Isso pode ser um
   simples método estático na classe do proxy ou um método factory todo implementado.
5. Considere implementar uma inicialização preguiçosa para o objeto do serviço.


## Prós e contras

| PRÓS                                                                                                         | 
|--------------------------------------------------------------------------------------------------------------|
| Você pode controlar o objeto do serviço sem os clientes ficarem sabendo.                                     |
| Você pode gerenciar o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele. |
| O proxy trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível.                       |
| Princípio aberto/fechado. Você pode introduzir novos proxies sem mudar o serviço ou clientes.                |

| CONTRA                                                                                                                                                   | 
|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| O código pode ficar mais complicado uma vez que você precisa introduzir uma série de novas classes. |
| A resposta de um serviço pode ter atrasos.           |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto Proxy é um padrão para estrutual que tem como finalidade receber os recuros do cliente e tratar ele
em tempo de execução passando para o objeto final, assim analisando quando deve executar ou deixar de executar algumas
coisas, gerenciando os recuros presentes

O padrão de projeto Proxy é um padrão estrutural que atua como um intermediário entre o cliente e o objeto real. Ele
intercepta as requisições antes de chegarem ao objeto final, permitindo adicionar funcionalidades como controle de
acesso, cache, log ou até mesmo a criação tardia do objeto real. Isso possibilita gerenciar melhor os recursos e decidir
quando a execução de certas ações deve ou não ocorrer.

## Proxy de cache

Neste exemplo, o padrão Proxy ajuda a implementar a inicialização preguiçosa e o cache em uma biblioteca de terceiros de
integração ineficiente do YouTube.

O proxy é inestimável quando você precisa adicionar alguns comportamentos adicionais a uma classe cujo código não pode
ser alterado.

