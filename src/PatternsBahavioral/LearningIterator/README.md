# O Guia Definitivo de Iterator para compreender de forma fácil

## O que é um padrão de projeto Iterator?

O Iterator é um padrão de projeto comportamental que permite a você percorrer elementos de uma coleção sem expor as
representações dele (lista, pilha, árvore, etc.)

## Aplicação

* Utilize o padrão Iterator quando sua coleção tiver uma estrutura de dados complexa por debaixo dos panos, mas você
  quer esconder a complexidade dela de seus clientes (seja por motivos de conveniência ou segurança).
    * O iterador encapsula os detalhes de se trabalhar com uma estrutura de dados complexa, fornecendo ao cliente vários
      métodos simples para acessar os elementos da coleção. Embora essa abordagem seja muito conveniente para o cliente,
      ela também protege a coleção de ações descuidadas ou maliciosas que o cliente poderia fazer se estivesse
      trabalhando com as coleções diretamente.


* Utilize o padrão para reduzir a duplicação de código de travessia em sua aplicação.
    * O código de algoritmos de iteração não triviais tendem a ser muito pesados. Quando colocados dentro da lógica de
      negócio da aplicação, ele pode desfocar a responsabilidade do codigo original e torná-lo um código de difícil
      manutenção. Mover o código de travessia para os iteradores designados pode ajudar você a tornar o código da
      aplicação mais enxuto e limpo.

* Utilize o Iterator quando você quer que seu código seja capaz de percorrer diferentes estruturas de dados ou quando os
  tipos dessas estruturas são desconhecidos de antemão.
    * O padrão fornece um par de interfaces genérica tanto para coleções como para iteradores. Já que seu código agora
      usa essas interfaces, ele ainda vai funcionar se você passar diversos tipos de coleções e iteradores que
      implementam essas interfaces.

## COMO IMPLEMENTAR

1. Declare a interface do iterador. Ao mínimo, ela deve ter um método para buscar o próximo elemento de uma coleção. Mas
   por motivos de conveniência você pode adicionar alguns outros métodos, tais como recuperar o elemento anterior, saber
   a posição atual, e checar o fim da iteração.
2. Declare a interface da coleção e descreva um método para buscar iteradores. O tipo de retorno deve ser igual à
   interface do iterador. Você pode declarar métodos parecidos se você planeja ter grupos distintos de iteradores.
3. Implemente classes iterador concretas para as coleções que você quer percorrer com iteradores. Um objeto iterador
   deve ser ligado com uma única instância de coleção. Geralmente esse link é estabelecido através do construtor do
   iterador.
4. Implemente a interface da coleção na suas classes de coleção. A ideia principal é fornecer ao cliente com um atalho
   para criar iteradores, customizados para uma classe coleção em particular. O objeto da coleção deve passar a si mesmo
   para o construtor do iterador para estabelecer um link entre eles.
5. Vá até o código cliente e substitua todo o código de travessia de coleção com pelo uso de iteradores. O cliente busca
   um novo objeto iterador a cada vez que precisa iterar sobre os elementos de uma coleção.

## Prós e contras

| PRÓS                                                                                                                                                       | 
|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Princípio de responsabilidade única. Você pode limpar o código cliente e as coleções ao extrair os pesados algoritmos de travessia para classes separadas. |
| Princípio aberto/fechado. Você pode implementar novos tipos de coleções e iteradores e passá-los para o código existente sem quebrar coisa alguma.         |
| Você pode iterar sobre a mesma coleção em paralelo porque cada objeto iterador contém seu próprio estado de iteração.                                      |
| Pelas mesmas razões, você pode atrasar uma iteração e continuá-la quando necessário.                                                                       |

| CONTRA                                                                                                            | 
|-------------------------------------------------------------------------------------------------------------------|
| Aplicar o padrão pode ser um preciosismo se sua aplicação só trabalha com coleções simples.                       |
| Usar um iterador pode ser menos eficiente que percorrer elementos de algumas coleções especializadas diretamente. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto comportamental Iterator tem como objetivo fornecer um mecanismo para percorrer elementos dentro de
uma coleção (como Lista, Árvore, Grafo, etc.) sem expor sua estrutura interna. Ele simplifica a iteração para o cliente,
delegando a lógica de navegação para um objeto específico (o Iterador), mantendo a regra encapsulada.

O padrão Iterator é um padrão de projeto comportamental que permite percorrer os elementos de uma coleção sem expor sua
estrutura interna. Ele define uma interface para acessar os elementos de maneira sequencial, mantendo a responsabilidade
da iteração separada da própria coleção.

## Iterando nos perfis de redes sociais

Neste exemplo, o padrão Proxy ajuda a implementar a inicialização preguiçosa e o cache em uma biblioteca de terceiros de
integração ineficiente do YouTube.

O proxy é inestimável quando você precisa adicionar alguns comportamentos adicionais a uma classe cujo código não pode
ser alterado.

