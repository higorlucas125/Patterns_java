# O Guia Definitivo de Visitor para compreender de forma fácil

Também conhecido como: Visitante

## O que é um padrão de projeto Visitor?

O Visitor é um padrão de projeto comportamental que permite que você separe algoritmos dos objetos nos quais eles
operam.

## Aplicação

* Utilize o Visitor quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa (
  por exemplo, uma árvore de objetos).
    * O padrão Visitor permite que você execute uma operação sobre um conjunto de objetos com diferentes classes ao ter
      o objeto visitante implementando diversas variantes da mesma operação, que correspondem a todas as classes alvo.


* Utilize o Visitor para limpar a lógica de negócio de comportamentos auxiliares.
    * O padrão permite que você torne classes primárias de sua aplicação mais focadas em seu trabalho principal ao
      extrair todos os comportamentos em um conjunto de classes visitantes.

* Utilize o padrão quando um comportamento faz sentido apenas dentro de algumas classes de uma uma hierarquia de classe,
  mas não em outras.
    * Você pode extrair esse comportamento para uma classe visitante separada e implementar somente aqueles métodos
      visitantes que aceitam objetos de classes relevantes, deixando o resto vazio.

## COMO IMPLEMENTAR

1. Declare a interface da visitante com um conjunto de métodos “visitando”, um para cada classe elemento concreta que
   existe no programa.
2. Declare a interface elemento. Se você está trabalhando com uma hierarquia de classes elemento existente, adicione o
   método de “aceitação” para a classe base da hierarquia. Esse método deve aceitar um objeto visitante como um
   argumento.
3. Implemente os métodos de aceitação em todas as classes elemento concretas. Esses métodos devem simplesmente
   redirecionar a chamada para um método visitante no objeto visitante que está vindo e que coincide com a classe do
   elemento atual.
4. As classes elemento devem trabalhar apenas com visitantes através da interface do visitante. Os visitantes, contudo,
   devem estar cientes de todas as classes elemento concretas referenciadas como tipos de parâmetros dos métodos
   visitantes.
5. Para cada comportamento que não possa ser implementado dentro da hierarquia do elemento, crie uma nova classe
   visitante concreta e implemente todos os métodos visitantes.
   Você pode encontrar uma situação onde o visitante irá necessitar acesso para alguns membros privados da classe
   elemento. Neste caso, você pode ou fazer desses campos ou métodos públicos, violando o encapsulamento do elemento, ou
   aninhando a classe visitante na classe elemento. Está última só é possível se você tiver sorte e estiver trabalhando
   com uma linguagem de programação que suporta classes aninhadas.
6. O cliente deve criar objetos visitantes e passá-los para os elementos através dos métodos de “aceitação”.

## Prós e contras

| PRÓS                                                                                                                                                                                                                                                                         | 
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Princípio aberto/fechado. Você pode introduzir um novo comportamento que pode funcionar com objetos de diferentes classes sem mudar essas classes.                                                                                                                           |
| Princípio de responsabilidade única. Você pode mover múltiplas versões do mesmo comportamento para dentro da mesma classe.                                                                                                                                                   |
| Um objeto visitante pode acumular algumas informações úteis enquanto trabalha com vários objetos. Isso pode ser interessante quando você quer percorrer algum objeto de estrutura complexa, tais como um objeto árvore, e aplicar o visitante para cada objeto da estrutura. |

| CONTRA                                                                                                                          | 
|---------------------------------------------------------------------------------------------------------------------------------|
| Você precisa atualizar todos os visitantes a cada vez que a classe é adicionada ou removida da hierarquia de elementos.         |
| Visitantes podem não ter seu acesso permitido para campos e métodos privados dos elementos que eles deveriam estar trabalhando. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto comportamental Visitor é um padrão que permite a adição de novos métodos na hieraquia sem precisar
altera as classes já existentes

O padrão Visitor é um padrão comportamental que permite adicionar novas operações (ou comportamentos) a uma hierarquia
de classes sem precisar modificar diretamente as classes existentes. Ele é especialmente útil quando você tem uma
estrutura de objetos (como uma árvore ou uma coleção) e quer realizar operações distintas sobre esses objetos, mas sem"
poluir" as suas classes com código que não faz parte da responsabilidade principal delas.

A ideia principal é separar o algoritmo (a operação que você quer executar) das classes que representam os dados (os
elementos da hierarquia). Isso é feito criando uma classe Visitor que "visita" cada objeto da hierarquia e executa a
operação desejada. As classes da hierarquia só precisam implementar um método simples, como accept(Visitor visitor), que
delega o trabalho ao Visitor.

## Exportando formas para XML

Neste exemplo, gostaríamos de exportar um conjunto de formas geométricas para XML. O problema é que não queremos alterar
o código de formas, diretamente ou, pelo menos, manter as alterações ao mínimo.

No final, o padrão Visitor estabelece uma infraestrutura que nos permite adicionar comportamentos à hierarquia de formas
sem alterar o código existente dessas classes.

