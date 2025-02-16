# O Guia Definitivo de Chain of Responsibility para compreender de forma fácil

## O que é um padrão de projeto Chain of Responsibility?

O Chain of Responsibility é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de
handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na
corrente.

Como muitos outros padrões de projeto comportamental, o Chain of Responsibility se baseia em transformar certos
comportamentos em objetos solitários chamados handlers. No nosso caso, cada checagem devem ser extraída para sua própria
classe com um único método que faz a checagem. O pedido, junto com seus dados, é passado para esse método como um
argumento.

O padrão sugere que você ligue esses handlers em uma corrente. Cada handler ligado tem um campo para armazenar uma
referência ao próximo handler da corrente. Além de processar o pedido, handlers o passam adiante na corrente. O pedido
viaja através da corrente até que todos os handlers tiveram uma chance de processá-lo.

E aqui está a melhor parte: um handler pode decidir não passar o pedido adiante na corrente e efetivamente parar
qualquer futuro processamento.

## Aplicação

* Utilize o padrão Chain of Responsibility quando é esperado que seu programa processe diferentes tipos de pedidos em
  várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.
    * O padrão permite que você ligue vários handlers em uma corrente e, ao receber um pedido, perguntar para cada
      handler se ele pode ou não processá-lo. Dessa forma todos os handlers tem a chance de processar o pedido.


* Utilize o padrão quando é essencial executar diversos handlers em uma ordem específica.
    * Já que você pode ligar os handlers em uma corrente em qualquer ordem, todos os pedidos irão atravessar a corrente
      exatamente como você planejou.

* Utilize o padrão CoR quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.
    * Se você providenciar setters para um campo de referência dentro das classes handler, você será capaz de inserir,
      remover, ou reordenar os handlers de forma dinâmica.

## COMO IMPLEMENTAR

1. Declare a interface do handler e descreva a assinatura de um método para lidar com pedidos.
    * Decida como o cliente irá passar os dados do pedido para o método. A maneira mais flexível é converter o pedido em
      um objeto e passá-lo para o método handler como um argumento.
2. Para eliminar código padrão duplicado nos handlers concretos, pode valer a pena criar uma classe handler base
   abstrata, derivada da interface do handler.
    * Essa classe deve ter um campo para armazenar uma referência ao próximo handler na corrente. Considere tornar a
      classe imutável. Contudo, se você planeja modificar correntes no tempo de execução, você precisa definir um setter
      para alterar o valor do campo de referência.
    * Você também pode implementar o comportamento padrão conveniente para o método handler, que vai passar adiante o
      pedido para o próximo objeto a não ser que não haja mais objetos. Handlers concretos irão ser capazes de usar esse
      comportamento ao chamar o método pai.
3. Um por um crie subclasses handler concretas e implemente seus métodos handler. Cada handler deve fazer duas decisões
   ao receber um pedido:
   <ul>
     <li>Se ele vai processar o pedido. </li>
     <li>Se ele vai passar o pedido adiante na corrente </li>
   </ul>
4. O cliente pode tanto montar correntes sozinho ou receber correntes pré construídas de outros objetos. Neste último
   caso, você deve implementar algumas classes fábrica para construir correntes de acordo com a configuração ou
   definições de ambiente.
5. O cliente pode ativar qualquer handler da corrente, não apenas o primeiro. O pedido será passado ao longo da corrente
   até que algum handler se recuse a passá-lo adiante ou até ele chegar ao fim da corrente.
6. Devido a natureza dinâmica da corrente, o cliente deve estar pronto para lidar com os seguintes cenários:
   <ul>
     <li>A corrente pode consistir de um único elo. </li>
     <li>Alguns pedidos podem não chegar ao fim da corrente. </li>
     <li>Outros podem chegar ao fim da corrente sem terem sido tratados</li>
   </ul>

## Prós e contras

| PRÓS                                                                                                                       | 
|----------------------------------------------------------------------------------------------------------------------------|
| Você pode controlar a ordem de tratamento dos pedidos.                                                                     |
| Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que realizam operações. |
| Princípio aberto/fechado. Você pode introduzir novos handlers na aplicação sem quebrar o código cliente existente.         |

| CONTRA                                      | 
|---------------------------------------------|
| Alguns pedidos podem acabar sem tratamento. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto chain of responsability que é comportamental, ele é como uma esteira, onde o pedido do cliente é passado por objeto em objeto até ser solucionado, não precisa nescessariamente ser sequencial.
é como uma ligação para o suporte de qualquer empresa, sempre vai existir uma URA e depois irá passar para um tecnico caso o seu caso não seja resolvido

## Filtrando o acesso

Este exemplo mostra como uma solicitação que contém dados do usuário passa por uma cadeia sequencial de manipuladores
que executam várias tarefas, como autenticação, autorização, e validação.

Este exemplo é um pouco diferente da versão canônica do padrão fornecida por vários autores. A maioria dos exemplos do
padrão é construída com a noção de procurar o handler correto, iniciá-lo, e sair da cadeia depois disso. Mas aqui
executamos todos os handlers até que um que não possa lidar com uma solicitação seja encontrado. Esteja ciente de que
esse ainda é o padrão Chain of Responsibility, mesmo que o fluxo seja um pouco diferente.

