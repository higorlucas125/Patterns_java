# O Guia Definitivo de Observer para compreender de forma fácil

Também conhecido como: Observador, Assinante do evento, Event-Subscriber, Escutador, Listener

## O que é um padrão de projeto Observer?

O Observer é um padrão de projeto comportamental que permite que você defina um mecanismo de assinatura para notificar
múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

## Aplicação

* Utilize o padrão Observer quando mudanças no estado de um objeto podem precisar mudar outros objetos, e o atual
  conjunto de objetos é desconhecido de antemão ou muda dinamicamente.
    * Você pode vivenciar esse problema quando trabalhando com classes de interface gráfica do usuário. Por exemplo,
      você criou classes de botões customizados, e você quer deixar os clientes colocar algum código customizado para
      seus botões para que ele ative sempre que usuário aperta um botão.
    * O padrão Observer permite que qualquer objeto que implemente a interface do assinante possa se inscrever para
      notificações de eventos em objetos da publicadora. Você pode adicionar o mecanismo de inscrição em seus botões,
      permitindo que o cliente coloque seu próprio código através de classes assinantes customizadas.


* Utilize o padrão quando alguns objetos em sua aplicação devem observar outros, mas apenas por um tempo limitado ou em
  casos específicos.
    * A lista de inscrição é dinâmica, então assinantes podem entrar e sair da lista sempre que quiserem.

## COMO IMPLEMENTAR

1. Olhe para sua lógica do negócio e tente quebrá-la em duas partes: a funcionalidade principal, independente de outros
   códigos, irá agir como publicadora; o resto será transformado em um conjunto de classes assinantes.
2. Declare a interface do assinante. No mínimo, ela deve declarar um único método atualizar
3. Declare a interface da publicadora e descreva um par de métodos para adicionar um objeto assinante e removê-lo da
   lista. Lembre-se que publicadoras somente devem trabalhar com assinantes através da interface do assinante.
4. Decida onde colocar a lista atual de assinantes e a implementação dos métodos de inscrição. Geralmente este código se
   parece o mesmo para todos os tipos de publicadoras, então o lugar óbvio para colocá-lo é dentro de uma classe
   abstrata derivada diretamente da interface da publicadora. Publicadoras concretas estendem aquela classe, herdando o
   comportamento de inscrição.
   Contudo, se você está aplicando o padrão para uma hierarquia de classe já existente, considere uma abordagem baseada
   na composição: coloque a lógica da inscrição dentro de um objeto separado, e faça todos as publicadoras reais usá-la.
5. Crie as classes publicadoras concretas. A cada vez que algo importante acontece dentro de uma publicadora, ela deve
   notificar seus assinantes.
6. Implemente os métodos de notificação de atualização nas classes assinantes concretas. A maioria dos assinantes
   precisarão de dados contextuais sobre o evento. Eles podem ser passados como argumentos do método de notificação.
   Mas há outra opção. Ao receber uma notificação, o assinante pode recuperar os dados diretamente da notificação. Neste
   caso, a publicadora deve passar a si mesma através do método de atualização. A opção menos flexível é ligar uma
   publicadora ao assinante permanentemente através do construtor.
7. O cliente deve criar todas os assinantes necessários e registrá-los com suas publicadoras apropriadas.

## Prós e contras

| PRÓS                                                                                                                                                                  | 
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora). |
| Você pode estabelecer relações entre objetos durante a execução.                                                                                                      |

| CONTRA                                        | 
|-----------------------------------------------|
| Assinantes são notificados em ordem aleatória |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto Observetion veio com o proposito de criar uma interface para notificar somente as classes que
deveriam receber a notificação, dando um exemplo como uma assinatura de email, se vc quiser receber varios emails vc
deve solicitar assim entrando para o processode notificação

O padrão de projeto Observer foi criado para permitir que um objeto (o sujeito) notifique automaticamente um conjunto de
observadores sobre mudanças no seu estado. Ele é útil quando temos uma relação um-para-muitos, onde várias partes do
sistema precisam ser atualizadas sempre que algo mudar.

Um exemplo prático é um sistema de assinatura de e-mails: se você se inscreve em uma newsletter, passa a fazer parte da
lista de observadores. Sempre que o remetente enviar um novo e-mail, todos os assinantes receberão a notificação
automaticamente.

## Assinatura do evento

Neste exemplo, o padrão Observer estabelece colaboração indireta entre objetos de um editor de texto. Sempre que o
objeto Editor é alterado, ele notifica seus assinantes. EmailNotificationListener e LogOpenListener reagem a essas
notificações executando seus comportamentos principais.

As classes de assinante não são acopladas à classe do editor e podem ser reutilizadas em outras aplicações, se
necessário. A classe Editor depende apenas da interface abstrata do assinante. Isso permite adicionar novos tipos de
assinantes sem alterar o código do editor.

