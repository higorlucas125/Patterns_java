# O Guia Definitivo de factory para compreender de forma fácil

## O que é uma Factory?

Fatory vem do inglês que é fabrica, o objeto dele é construir objetos, ou seja, é uma classe que tem como objetivo criar
objetos de outras classes.

## Por que usar uma Factory?

A factory é muito utilizada para criar objetos de classes que são complexas, ou seja, que tem muitos atributos e
métodos, e que são difíceis de serem criadas.

## Como usar uma Factory?

Para usar uma factory é muito simples, basta criar uma classe que tenha um método que retorne um objeto de outra classe.

## Como implementar uma Factory?

1. Faça todos os produtos implementarem a mesma interface. Essa interface deve declarar métodos que fazem sentido em
   todos os produtos.
2. Adicione um método fábrica vazio dentro da classe criadora. O tipo de retorno do método deve corresponder à interface
   comum do produto.
3. No código da classe criadora, encontre todas as referências aos construtores de produtos. Um por um, substitua-os por
   chamadas ao método fábrica, enquanto extrai o código de criação do produto para o método fábrica.
   Pode ser necessário adicionar um parâmetro temporário ao método fábrica para controlar o tipo de produto retornado.
   Neste ponto, o código do método fábrica pode parecer bastante feio. Pode ter um grande operador switch que escolhe
   qual classe de produto instanciar. Mas não se preocupe, resolveremos isso em breve.
4. Agora, crie um conjunto de subclasses criadoras para cada tipo de produto listado no método fábrica. Sobrescreva o
   método fábrica nas subclasses e extraia os pedaços apropriados do código de construção do método base.
5. Se houver muitos tipos de produtos e não fizer sentido criar subclasses para todos eles, você poderá reutilizar o
   parâmetro de controle da classe base nas subclasses.
   Por exemplo, imagine que você tenha a seguinte hierarquia de classes: a classe base Correio com algumas subclasses:
   CorreioAéreo e CorreioTerrestre; as classes Transporte são Avião, Caminhão e Trem. Enquanto a classe CorreioAéreo usa
   apenas objetos Avião, o CorreioTerrestre pode funcionar com os objetos Caminhão e Trem. Você pode criar uma nova
   subclasse (por exemplo, CorreioFerroviário) para lidar com os dois casos, mas há outra opção. O código do cliente
   pode passar um argumento para o método fábrica da classe CorreioTerrestre para controlar qual produto ele deseja
   receber.
6. Se, após todas as extrações, o método fábrica base ficar vazio, você poderá torná-lo abstrato. Se sobrar algo, você
   pode tornar isso em um comportamento padrão do método.

## Prós e Contras

### Prós

1. Você evita acoplamento forte entre o criador e os produtos.
2. Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa,
   facilitando a manutenção do código.
3. Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente
   existente.

### Contras

O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão.
O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.
