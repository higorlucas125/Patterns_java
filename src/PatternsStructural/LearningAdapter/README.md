# O Guia Definitivo de Adapters para compreender de forma fácil

## O que é um padrão de projeto Adapter?

O Adapter é um padrão de projeto estrutural que permite objetos com ‘interfaces’ incompatíveis colaborarem entre si.

## Aplicação

* Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua ‘interface’ não for compatível com o
  resto do seu código.
    * O padrão Adapter permite que você crie uma classe de meio-termo que serve como um tradutor entre o seu código e a
      classe antiga, uma classe de terceiros, ou qualquer outra classe com uma ‘interface’ estranha.
* Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade
  comum que não pode ser adicionada a superclasse.
    * Você pode estender cada subclasse e colocar a funcionalidade faltante nas novas classes filhas. Contudo, você terá
      que duplicar o código em todas as novas classes, cheirando muito mal.
    * Uma solução muito mais elegante seria colocar a funcionalidade faltante dentro da classe adaptadora. Então você
      encobriria os objetos com as funcionalidades faltantes dentro do adaptador, ganhando tais funcionalidades de forma
      dinâmica. Para isso funcionar, as classes alvo devem ter uma ‘interface’ em comum, e o campo do adaptador deve
      seguir aquela ‘interface’. Essa abordagem se parece muito com o padrão Decorator.

## COMO IMPLEMENTAR

1. Certifique-se que você tem ao menos duas classes com ‘interfaces’ incompatíveis:
    * Uma classe serviço útil, que você não pode modificar (quase sempre de terceiros, antiga, ou com muitas
      dependências existentes).
    * Uma ou mais classes clientes que seriam beneficiadas com o uso da classe serviço.
2. Declare a interface cliente e descreva como o cliente se comunica com o serviço.
3. Cria a classe adaptadora e faça-a seguir a ‘interface’ cliente. Deixe todos os métodos vazios por enquanto.
4. Adicione um campo para a classe do adaptador armazenar uma referência ao objeto do serviço. A prática comum é
   inicializar esse campo via o construtor, mas algumas vezes é mais conveniente passá-lo para o adaptador ao chamar os
   seus métodos.
5. Um por um, implemente todos os métodos da ‘interface’ cliente na classe adaptadora. O adaptador deve delegar a
   maioria do trabalho real para o objeto serviço, lidando apenas com a conversão da ‘interface’ ou formato dos dados.
6. Os Clientes devem usar o adaptador através da ‘interface’ cliente. Isso irá permitir que você mude ou estenda o
   adaptador sem afetar o código cliente.

## Prós e contras

- Princípio de responsabilidade única. Você pode separar a conversão de ‘interface’ ou de dados da lógica primária do
  negócio do programa.
- Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente
  existente, desde que eles trabalhem com os adaptadores através da ‘interface’ cliente.

* A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas ‘interfaces’ e classes.
  Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O padrão de projeto estrutural Adapter permite que uma ‘interface’ existente seja compatível com outra esperada pelo
sistema, sem alterar o seu código original. Ele possibilita a integração de componentes legados, a reutilização de código
e facilita migrações de sistemas.
