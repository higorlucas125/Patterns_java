# O Guia Definitivo de AbastractFactory para compreender de forma fácil

## O que é um padrão de projeto AbastractFactory ?

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem
ter que especificar suas classes concretas.

## Aplicação

* Use o Abstract Factory quando o seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que
  você não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você
  simplesmente quer permitir uma futura escalabilidade.
* Considere implementar o Abstract Factory quando você tem uma classe com um conjunto de métodos fábrica que desfoquem
  sua responsabilidade principal.

## COMO IMPLEMENTAR

1. Mapeie uma matriz de tipos de produtos distintos versus as variantes desses produtos.
2. Declare interfaces de produto abstratas para todos os tipos de produto. Então, faça todas as classes concretas de
   produtos implementar essas interfaces.
3. Declare a interface da fábrica abstrata com um conjuntos de métodos de criação para todos os produtos abstratos.
4. Implemente um conjunto de classes fábricas concretas, uma para cada variante de produto.
5. Crie um código de inicialização da fábrica em algum lugar da aplicação. Ele deve instanciar uma das classes fábrica
   concretas, dependendo da configuração da aplicação ou do ambiente atual. Passe esse objeto fábrica para todas as
   classes que constroem produtos
6. Escaneie o código e encontre todas as chamadas diretas para construtores de produtos. Substitua-as por chamadas para
   o método de criação apropriado no objeto fábrica.

## Prós e contras

- Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.
- Você evita um vínculo forte entre produtos concretos e o código cliente.
- Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código
  ser de fácil manutenção.
- Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

* O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são
  introduzidas junto com o padrão.


## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO 

Abastract factory é um conjuto maior de factory, onde eu não preciso saber minha classe concreta e sim suas interfaces
