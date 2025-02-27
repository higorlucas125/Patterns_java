# O Guia Definitivo de Template Method para compreender de forma fácil

Também conhecido como: Método padrão

## O que é um padrão de projeto Template Method?

O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa
as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.

## Aplicação

* Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um
  algoritmo, mas não todo o algoritmo e sua estrutura.
    * O Template Method permite que você transforme um algoritmo monolítico em uma série de etapas individuais que podem
      facilmente ser estendidas por subclasses enquanto ainda mantém intacta a estrutura definida em uma superclasse.


* Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores.
  Como resultado, você pode querer modificar todas as classes quando o algoritmo muda
    * Quando você transforma tal algoritmo em um Template Method, você também pode erguer as etapas com implementações
      similares para dentro de uma superclasse, eliminando duplicação de código. Códigos que variam entre subclasses
      podem permanecer dentro das subclasses.

## COMO IMPLEMENTAR

1. Analise o algoritmo alvo para ver se você quer quebrá-lo em etapas. Considere quais etapas são comuns a todas as
   subclasses e quais permanecerão únicas.
2. Crie a classe abstrata base e declare o método padrão e o conjunto de métodos abstratos representando as etapas do
   algoritmo. Contorne a estrutura do algoritmo no método padrão ao executar as etapas correspondentes. Considere tornar
   o método padrão como final para prevenir subclasses de sobrescrevê-lo.
3. Tudo bem se todas as etapas terminarem sendo abstratas. Contudo, alguns passos podem se beneficiar de ter uma
   implementação padrão. Subclasses não tem que implementar esses métodos.
4. Pense em adicionar ganchos entre as etapas cruciais do algoritmo.
5. Para cada variação do algoritmo, crie uma nova subclasse concreta. Ela deve implementar todas as etapas abstratas,
   mas pode também sobrescrever algumas das opcionais.

## Prós e contras

| PRÓS                                                                                                                                                                     | 
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Você pode deixar clientes sobrescrever apenas certas partes de um algoritmo grande, tornando-os menos afetados por mudanças que acontece por outras partes do algoritmo. |
| Você pode elevar o código duplicado para uma superclasse.                                                                                                                |

| CONTRA                                                                                                                     | 
|----------------------------------------------------------------------------------------------------------------------------|
| Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo.                                               |
| Você pode violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação através da subclasse. |
| Implementações do padrão Template Method tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem.          |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto Template method é um padrão onde voce pega varias classes que fazem a mesma coisas e transforme algo
em comum numa classe abastrata que pode ser utilizada reduzindo codigo

"O padrão Template Method pega várias classes que têm um processo parecido, extrai o que é comum em uma classe abstrata
e define uma estrutura geral que elas podem seguir. Assim, evita repetir código e deixa as subclasses cuidarem só das
partes específicas que mudam."

## Substituindo etapas padrão de um algoritmo

Neste exemplo, o padrão Template Method define um algoritmo de trabalho com uma rede social. As subclasses que
correspondem a uma rede social específica, implementam essas etapas de acordo com a API fornecida pela rede social.

