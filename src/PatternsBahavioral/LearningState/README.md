# O Guia Definitivo de State para compreender de forma fácil

Também conhecido como: Estado

## O que é um padrão de projeto State?

O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado
interno muda. Parece como se o objeto mudasse de classe.

## Aplicação

* Utilize o padrão State quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual,
  quando o número de estados é enorme, e quando o código estado específico muda com frequência.
    * O padrão sugere que você extraia todo o código estado específico para um conjunto de classes distintas. Como
      resultado, você pode adicionar novos estados ou mudar os existentes independentemente uns dos outros, reduzindo o
      custo da manutenção.


* Utilize o padrão quando você tem uma classe populada com condicionais gigantes que alteram como a classe se comporta
  de acordo com os valores atuais dos campos da classe.
    * O padrão State permite que você extraia ramificações dessas condicionais para dentro de métodos de classes
      correspondentes. Ao fazer isso, você também limpa para fora da classe principal os campos temporários e os métodos
      auxiliares envolvidos no código estado específico.

* Utilize o State quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de
  estado baseada em condições
    * O padrão State permite que você componha hierarquias de classes estado e reduza a duplicação ao extrair código
      comum para dentro de classes abstratas base.

## COMO IMPLEMENTAR

1. Decida qual classe vai agir como contexto. Poderia ser uma classe existente que já tenha código dependente do estado;
   ou uma nova classe, se o código específico ao estado estiver distribuído em múltiplas classes.
2. Declare a interface do estado. Embora ela vai espelhar todos os métodos declarados no contexto, mire apenas para
   aqueles que possam conter comportamento específico ao estado.
3. Para cada estado real, crie uma classe que deriva da interface do estado. Então vá para os métodos do contexto e
   extraia todo o código relacionado a aquele estado para dentro de sua nova classe.
    - Ao mover o código para a classe estado, você pode descobrir que ela depende de membros privados do contexto. Há
      várias maneiras de contornar isso:
   <ul>
     <li>Torne esses campos ou métodos públicos. </li>
     <li>Transforme o comportamento que você está extraindo para um método público dentro do contexto e chame-o na classe estado. Essa maneira é feia mas rápida, e você pode sempre consertá-la mais tarde.</li>
     <li>Aninhe as classes estado dentro da classe contexto, mas apenas se sua linguagem de programação suporta classes aninhadas. </li>
   </ul>
4. Na classe contexto, adicione um campo de referência do tipo de interface do estado e um setter público que permite
   sobrescrever o valor daquele campo.
5. Vá até o método do contexto novamente e substitua as condicionais de estado vazias por chamadas aos métodos
   correspondentes do objeto estado.
6. Para trocar o estado do contexto, crie uma instância de uma das classes estado e a passe para o contexto. Você pode
   fazer isso dentro do próprio contexto, ou em vários estados, ou no cliente. Aonde quer que isso seja feito, a classe
   se torna dependente da classe estado concreta que ela instanciou.

## Prós e contras

| PRÓS                                                                                                            | 
|-----------------------------------------------------------------------------------------------------------------|
| Princípio de responsabilidade única. Organiza o código relacionado a estados particulares em classes separadas. |
| Princípio aberto/fechado. Introduz novos estados sem mudar classes de estado ou contexto existentes.            |
| Simplifica o código de contexto ao eliminar condicionais de máquinas de estado pesadas.                         |

| CONTRA                                                                                                    | 
|-----------------------------------------------------------------------------------------------------------|
| Aplicar o padrão pode ser um exagero se a máquina de estado só tem alguns estados ou raramente muda eles. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto comportamental state é um padrão que altera o obejto assim mudando o comportamento do mesmo, exemplo
um ecommerce, quando o cliente compra uma mercadoria ela está no estado pedente, caso seja aprovado o estado vai mudar
para aprovado, caso de errado muda para rejeitado, assim alterando o estado e o seu comportamento

Padrão State (Comportamental)
O padrão State é usado para permitir que um objeto altere seu comportamento quando seu estado interno muda. Isso é feito
de forma que o objeto pareça mudar de classe, mas na verdade, ele está apenas delegando o comportamento para diferentes
objetos que representam os estados possíveis.

Exemplo do E-commerce
No contexto de um e-commerce, você pode ter um pedido que passa por diferentes estados, como Pendente, Aprovado,
Rejeitado, Enviado, Entregue, etc. Cada estado tem um comportamento diferente:

Pendente: O pedido está aguardando aprovação. Neste estado, o pedido pode ser aprovado ou rejeitado.

Aprovado: O pedido foi aprovado e está pronto para ser enviado. Aqui, o pedido pode ser enviado ou, em alguns casos,
cancelado.

Rejeitado: O pedido foi rejeitado e não será processado. Neste estado, o pedido não pode mais ser alterado.

Enviado: O pedido foi enviado ao cliente e está a caminho.

Entregue: O pedido foi entregue ao cliente.

Como o State Funciona
Cada estado é representado por uma classe separada que implementa uma interface comum ou uma classe base.

O objeto principal (no caso, o pedido) tem uma referência para o estado atual.

Quando o estado muda, o objeto principal atualiza essa referência para apontar para o novo estado.

O comportamento do objeto principal muda dinamicamente conforme o estado atual.

Vantagens do Padrão State
Organização do Código: Cada estado é encapsulado em sua própria classe, o que facilita a manutenção e a extensão do
código.

Eliminação de Condicionais: Em vez de usar várias condicionais (if/else ou switch) para verificar o estado, o
comportamento é delegado para as classes de estado.

Flexibilidade: Adicionar novos estados é fácil, basta criar uma nova classe que implemente a interface do estado.

## Interface de um tocador de mídia

Neste exemplo, o padrão State permite que os mesmos controles do tocador de mídia se comportem de maneira diferente,
dependendo do estado atual da reprodução. A classe principal do tocador contém uma referência a um objeto de estado, que
executa a maior parte do trabalho para o tocador. Algumas ações podem acabar substituindo o objeto de estado por outro,
o que altera a maneira como o tocador reage às interações do usuário.
