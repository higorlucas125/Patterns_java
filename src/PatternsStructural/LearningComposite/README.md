# O Guia Definitivo de Composite para compreender de forma fácil

## O que é um padrão de projeto Composite?

O Composite é um padrão de projeto estrutural que permite compor objetos em uma estrutura semelhante a uma árvore e
trabalhar com eles como se fosse um objeto singular.

O Composite se tornou uma solução bastante popular para a maioria dos problemas que exigem a construção de uma estrutura
em árvore. O grande recurso do Composite é a capacidade de executar métodos recursivamente em toda a estrutura da árvore
e resumir os resultados.

## Aplicação

* Utilize o padrão Composite quando você tem que implementar uma estrutura de objetos tipo árvore.
    * O padrão Composite fornece a você com dois tipos básicos de elementos que compartilham uma interface comum: folhas
      simples e contêineres complexos. Um contêiner pode ser composto tanto de folhas como por outros contêineres. Isso
      permite a você construir uma estrutura de objetos recursiva aninhada que se assemelha a uma árvore.
* Utilize o padrão quando você quer que o código cliente trate tanto os objetos simples como os compostos de forma
  uniforme.
    * Todos os elementos definidos pelo padrão Composite compartilham uma interface comum. Usando essa interface o
      cliente não precisa se preocupar com a classe concreta dos objetos com os quais está trabalhando.

## COMO IMPLEMENTAR

1. Certifique-se que o modelo central de sua aplicação possa ser representada como uma estrutura de árvore. Tente
   quebrá-lo em elementos simples e contêineres. Lembre-se que contêineres devem ser capazes de conter tanto elementos
   simples como outros contêineres.
2. Declare a interface componente com uma lista de métodos que façam sentido para componentes complexos e simples.
3. Crie uma classe folha que represente elementos simples. Um programa pode ter múltiplas classes folha diferentes.
4. Crie uma classe contêiner para representar elementos complexos. Nessa classe crie um vetor para armazenar referências
   aos sub-elementos. O vetor deve ser capaz de armazenar tanto folhas como contêineres, então certifique-se que ele foi
   declarado com um tipo de interface componente.
   Quando implementar os métodos para a interface componente, lembre-se que um contêiner deve ser capaz de delegar a
   maior parte do trabalho para os sub-elementos.
5. Por fim, defina os métodos para adicionar e remover os elementos filhos no contêiner.
   Tenha em mente que essas operações podem ser declaradas dentro da interface componente. Isso violaria o princípio de
   segregação de interface porque os métodos estarão vazios na classe folha. Contudo, o cliente será capaz de tratar de
   todos os elementos de forma igual, mesmo ao montar a árvore.

## Prós e contras

- Você pode trabalhar com estruturas de árvore complexas mais convenientemente: utilize o polimorfismo e a recursão a
  seu favor.
- Princípio aberto/fechado. Você pode introduzir novos tipos de elemento na aplicação sem quebrar o código existente, o
  que agora funciona com a árvore de objetos.

* Pode ser difícil providenciar uma interface comum para classes cuja funcionalidade difere muito. Em certos cenários,
  você precisaria generalizar muito a interface componente, fazendo dela uma interface de difícil compreensão.

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O composite funciona com herarquia de arvore, onde vc possui uma interface e pode compor varios elementos de si mesmo,
assim podendo criar varios objetos um dentro do outro

Revisão do que você disse:
* O padrão usa uma interface comum para garantir que tanto os objetos simples (folhas) quanto os compostos (nós) possam ser manipulados da mesma forma.
* Objetos compostos podem conter vários elementos do mesmo tipo, permitindo a criação de uma estrutura de árvore.
* Isso facilita o uso recursivo, já que podemos percorrer a estrutura chamando os mesmos métodos para elementos simples e compostos.