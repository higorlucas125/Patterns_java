# O Guia Definitivo de Bridge para compreender de forma fácil

O Bridge é um padrão de projeto estrutural que permite que você divida uma classe grande ou um conjunto de classes
intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas
independentemente umas das outras.

## Aplicação

* Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma
  funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).
    * Quanto maior a classe se torna, mais difícil é de entender como ela funciona, e mais tempo se leva para fazer
      mudanças. As mudanças feitas para uma das variações de funcionalidade podem precisar de mudanças feitas em toda a
      classe, o que quase sempre resulta em erros ou falha em lidar com efeitos colaterais.
    * O padrão Bridge permite que você divida uma classe monolítica em diversas hierarquias de classe. Após isso, você
      pode modificar as classes em cada hierarquia independentemente das classes nas outras. Essa abordagem simplifica a
      manutenção do código e minimiza o risco de quebrar o código existente.
* Utilize o padrão quando você precisa estender uma classe em diversas dimensões ortogonais (independentes).
    * O Bridge sugere que você extraia uma hierarquia de classe separada para cada uma das dimensões. A classe original
      delega o trabalho relacionado para os objetos pertencentes àquelas hierarquias ao invés de fazer tudo por conta
      própria.
* Utilize o Bridge se você precisar ser capaz de trocar implementações durante o momento de execução.
    * Embora seja opcional, o padrão Bridge permite que você substitua o objeto de implementação dentro da abstração. É
      tão fácil quanto designar um novo valor para um campo.
    * A propósito, este último item é o maior motivo pelo qual muitas pessoas confundem o Bridge com o padrão Strategy.
      Lembre-se que um padrão é mais que apenas uma maneira de estruturar suas classes. Ele também pode comunicar
      intenções e resolver um problema.

## COMO IMPLEMENTAR

1. dentifique as dimensões ortogonais(Componentes ou dimensões que são independentes entre si.Isso significa que
   mudanças em um componente ou dimensão não afetam os outros.) em suas classes. Esses conceitos independentes podem
   ser: abstração/plataforma,
   domínio/infraestrutura, front-end/back-end, ou interface/implementação
2. Veja quais operações o cliente precisa e defina-as na classe abstração base.
3. Determine as operações disponíveis em todas as plataformas. Declare aquelas que a abstração precisa na interface
   geral de implementação.
4. Crie classes concretas de implementação para todas as plataformas de seu domínio, mas certifique-se que todas elas
   sigam a interface de implementação.
5. Dentro da classe de abstração, adicione um campo de referência para o tipo de implementação. A abstração delega a
   maior parte do trabalho para o objeto de implementação que foi referenciado neste campo.
6. Se você tem diversas variantes de lógica de alto nível, crie abstrações refinadas para cada variante estendendo a
   classe de abstração básica.
7. O código cliente deve passar um objeto de implementação para o construtor da abstração para associar um com o outro.
   Após isso, o cliente pode esquecer sobre a implementação e trabalhar apenas com o objeto de abstração.

## Prós e contras

- Você pode criar classes e aplicações independentes de plataforma.
- O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
- Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
- Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma
  na implementação.

* Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto estrutural Bridge é usado para desacoplar a abstração da implementação, permitindo que ambas possam
evoluir separadamente. Ele funciona como uma "ponte" entre essas duas camadas, evitando que alterações na abstração
impactem diretamente a implementação subjacente. Isso melhora a flexibilidade e facilita a extensão do código sem
modificar classes existentes, respeitando o princípio da responsabilidade única do SOLID.

Respeita o SOLID: Especialmente o princípio da responsabilidade única (SRP) e o princípio aberto/fechado (OCP).

