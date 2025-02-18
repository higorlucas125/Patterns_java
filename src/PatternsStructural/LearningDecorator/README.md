# O Guia Definitivo de Decorator para compreender de forma fácil

## O que é um padrão de projeto Decorator?

O Decorator é um padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao
colocá-los dentro de invólucros de objetos que contém os comportamentos.

## Aplicação

* Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em tempo
  de execução sem quebrar o código que usa esses objetos.
    * O Decorator lhe permite estruturar sua lógica de negócio em camadas, criar um decorador para cada camada, e compor
      objetos com várias combinações dessa lógica durante a execução. O código cliente pode tratar de todos esses
      objetos da mesma forma, como todos seguem a mesma interface comum.
* Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.
    * Muitas linguagens de programação tem a palavra chave final que pode ser usada para prevenir a extensão de uma
      classe. Para uma classe final, a única maneira de reutilizar seu comportamento existente seria envolver a classe
      com seu próprio invólucro usando o padrão Decorator

## COMO IMPLEMENTAR

1. Certifique-se que seu domínio de negócio pode ser representado como um componente primário com múltiplas camadas
   opcionais sobre ele.
2. Descubra quais métodos são comuns tanto para o componente primário e para as camadas opcionais. Crie uma interface
   componente e declare aqueles métodos ali.
3. Crie uma classe componente concreta e defina o comportamento base nela.
4. Crie uma classe decorador base. Ela deve ter um campo para armazenar uma referência ao objeto envolvido. O campo deve
   ser declarado com o tipo da interface componente para permitir uma ligação entre os componentes concretos e
   decoradores. O decorador base deve delegar todo o trabalho para o objeto envolvido.
5. Certifique-se que todas as classes implementam a interface componente.
6. Crie decoradores concretos estendendo-os a partir do decorador base. Um decorador concreto deve executar seu
   comportamento antes ou depois da chamada para o método pai (que sempre delega para o objeto envolvido).
7. O código cliente deve ser responsável por criar decoradores e compô-los do jeito que o cliente precisa.

## Prós e contras

- Você pode estender o comportamento de um objeto sem fazer um nova subclasse.
- Você pode adicionar ou remover responsabilidades de um objeto no momento da execução.
- Você pode combinar diversos comportamentos ao envolver o objeto com múltiplos decoradores.
- Princípio de responsabilidade única. Você pode dividir uma classe monolítica que implementa muitas possíveis variantes
  de um comportamento em diversas classes menores.


* É difícil remover um invólucro de uma pilha de invólucros.
* É difícil implementar um decorador de tal maneira que seu comportamento não dependa da ordem do pilha de decoradores.
* A configuração inicial do código de camadas pode ficar bastante feia.

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO
