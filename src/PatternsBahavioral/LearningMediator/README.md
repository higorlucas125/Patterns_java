# O Guia Definitivo de Mediator para compreender de forma fácil

## O que é um padrão de projeto Mediator?

O Mediator é um padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. O
padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.

## Aplicação

* Utilize o padrão Mediator quando é difícil mudar algumas das classes porque elas estão firmemente acopladas a várias
  outras classes.
    * O padrão lhe permite extrair todas as relações entre classes para uma classe separada, isolando quaisquer mudanças
      para um componente específico do resto dos componentes.


* Utilize o padrão quando você não pode reutilizar um componente em um programa diferente porque ele é muito dependente
  de outros componentes.
    * Após você aplicar o Mediator, componentes individuais se tornam alheios aos outros componentes. Eles ainda podem
      se comunicar entre si, mas de forma indireta, através do objeto mediador. Para reutilizar um componente em uma
      aplicação diferente, você precisa fornecer a ele uma nova classe mediadora.

* Utilize o Mediator quando você se encontrar criando um monte de subclasses para componentes apenas para reutilizar
  algum comportamento básico em vários contextos.
    * Como todas as relações entre componentes estão contidas dentro do mediador, é fácil definir novas maneiras para
      esses componentes colaborarem introduzindo novas classes mediadoras, sem ter que mudar os próprios componentes.

## COMO IMPLEMENTAR

1. Identifique um grupo de classes firmemente acopladas que se beneficiariam de estar mais independentes (por exemplo,
   para uma manutenção ou reutilização mais fácil dessas classes).
2. Declare a interface do mediador e descreva o protocolo de comunicação desejado entre os mediadores e os diversos
   componentes. Na maioria dos casos, um único método para receber notificações de componentes é suficiente. Essa
   interface é crucial quando você quer reutilizar classes componente em diferentes contextos. Desde que o componente
   trabalhe com seu mediador através da interface genérica, você pode ligar o componente com diferentes implementações
   do mediador.
3. Implemente a classe concreta do mediador. Essa classe se beneficia por armazenar referências a todos os componentes
   que gerencia.
4. Você pode ainda ir além e fazer que o mediador fique responsável pela criação e destruição de objetos componente.
   Após isso, o mediador pode montar uma fábrica ou uma fachada.
5. Componentes devem armazenar uma referência ao objeto do mediador. A conexão é geralmente estabelecida no construtor
   do componente, onde o objeto mediador é passado como um argumento.
6. Mude o código dos componentes para que eles chamem o método de notificação do mediador ao invés de métodos de outros
   componentes. Extraia o código que envolve chamar os outros componentes para a classe do mediador. Execute esse código
   sempre que o mediador receba notificações daquele componente.

## Prós e contras

| PRÓS                                                                                                                                                                      | 
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Princípio de responsabilidade única. Você pode extrair as comunicações entre vários componentes para um único lugar, tornando as de mais fácil entendimento e manutenção. |
| Princípio aberto/fechado. Você pode introduzir novos mediadores sem ter que mudar os próprios componentes.                                                                |
| Você pode reduzir o acoplamento entre os vários componentes de um programa.                                                                                               |
| Você pode reutilizar componentes individuais mais facilmente.                                                                                                             |

| CONTRA                                                    | 
|-----------------------------------------------------------|
| Com o tempo um mediador pode evoluir para um Objeto Deus. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto Mediator é um padrão comportamental onde permite que você reduza as dependecias entre objetos,
criando assim um mediador entre elas

O padrão de projeto Mediator é um padrão comportamental que tem como objetivo reduzir o acoplamento (dependências
diretas) entre objetos. Ele faz isso introduzindo um objeto central, chamado de mediador, que atua como um
intermediário. Em vez de os objetos se comunicarem diretamente uns com os outros, eles interagem por meio desse
mediador. Isso promove uma comunicação mais organizada e facilita a manutenção do código, já que as dependências entre
os objetos são centralizadas.

Por exemplo, imagine um chat em grupo: sem um mediador, cada pessoa teria que falar diretamente com todas as outras. Com
um mediador (como um servidor ou uma sala de chat), cada pessoa só precisa enviar a mensagem para o mediador, que
distribui para os outros. Isso reduz a complexidade e os "fios cruzados".

## Aplicação de notas

Este exemplo mostra como organizar muitos elementos da interface de usuário para que eles cooperem com a ajuda de um
mediador, mas não dependam um do outro.

