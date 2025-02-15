# O Guia Definitivo de Facade para compreender de forma fácil

## O que é um padrão de projeto Facade?
O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou
qualquer conjunto complexo de classes.

## Aplicação

* Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.
    * Com o passar do tempo, subsistemas ficam mais complexos. Até mesmo aplicar padrões de projeto tipicamente leva a
      criação de mais classes. Um subsistema pode tornar-se mais flexível e mais fácil de se reutilizar em vários
      contextos, mas a quantidade de códigos padrão e de configuração que ele necessita de um cliente cresce cada vez
      mais. O Facade tenta consertar esse problema fornecendo um atalho para as funcionalidades mais usadas do
      subsistema que corresponde aos requerimentos do cliente.
* Utilize o Facade quando você quer estruturar um subsistema em camadas.
    * Crie fachadas para definir pontos de entrada para cada nível de um subsistema. Você pode reduzir o acoplamento
      entre
      múltiplos subsistemas fazendo com que eles se comuniquem apenas através de fachadas.
    * Por exemplo, vamos retornar ao nosso framework de conversão de vídeo. Ele pode ser quebrado em duas camadas:
      relacionados a vídeo e áudio. Para cada camada, você cria uma fachada e então faz as classes de cada camada se
      comunicarem entre si através daquelas fachadas. Essa abordagem se parece muito com o padrão Mediator.

## COMO IMPLEMENTAR

1. Verifique se é possível providenciar uma interface mais simples que a que o subsistema já fornece. Você está no
   caminho certo se essa interface faz o código cliente independente de muitas classes do subsistema.
2. Declare e implemente essa interface em uma nova classe fachada. A fachada deve redirecionar as chamadas do código
   cliente para os objetos apropriados do subsistema. A fachada deve ser responsável por inicializar o subsistema e
   gerenciar seu ciclo de vida a menos que o código cliente já faça isso.
3. Para obter o benefício pleno do padrão, faça todo o código cliente se comunicar com o subsistema apenas através da
   fachada. Agora o código cliente fica protegido de qualquer mudança no código do subsistema. Por exemplo, quando um
   subsistema recebe um upgrade para uma nova versão, você só precisa modificar o código na fachada.
4. Se a fachada ficar grande demais, considere extrair parte de seu comportamento para uma nova e refinada classe
   fachada.

## Prós e contras

| PRÓS                                                          | 
|---------------------------------------------------------------|
| Você pode isolar seu código da complexidade de um subsistema. |

| CONTRA                                                                                  | 
|-----------------------------------------------------------------------------------------|
| Uma fachada pode se tornar um objeto deus acoplado a todas as classes de uma aplicação. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

Facade é Quando possui um sistema complexo e você precisa de uma interface onde o seu cliente precisa saber somente o
minimo da implantação, assim dando um metodo que ele possa simplesmente chamar sem precisar entender como construir o
mesmo.

Exatamente! O Facade é uma interface simplificada para um sistema complexo. Ele expõe apenas os métodos essenciais,
escondendo detalhes internos da implementação. Assim, o cliente só precisa chamar um método sem se preocupar com a
lógica interna. 🚀

