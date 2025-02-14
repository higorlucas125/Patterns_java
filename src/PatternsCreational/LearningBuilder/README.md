# O Guia Definitivo de Builder para compreender de forma fácil

## O que é um padrão de projeto Builder?

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão
permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Aplicabilidade

* Use o padrão Builder para se livrar de um “construtor telescópico”
  O padrão Builder permite que você construa objetos passo a passo, usando apenas aquelas etapas que você realmente
  precisa. Após implementar o padrão, você não vai mais precisar amontoar dúzias de parâmetros em seus construtores.
* Use o padrão Builder quando você quer que seu código seja capaz de criar diferentes representações do mesmo produto (por exemplo, casas de pedra e madeira).
* Use o Builder para construir árvores Composite ou outros objetos complexos.

## Como Implementar
1. Certifique-se que você pode definir claramente as etapas comuns de construção para construir todas as representações do produto disponíveis. Do contrário, você não será capaz de implementar o padrão.
2. Declare essas etapas na interface builder base.
3. Crie uma classe builder concreta para cada representação do produto e implemente suas etapas de construção.
4. Pense em criar uma classe diretor. Ela pode encapsular várias maneiras de construir um produto usando o mesmo objeto builder.
5. O código cliente cria tanto os objetos do builder como do diretor. Antes da construção começar, o cliente deve passar um objeto builder para o diretor. Geralmente o cliente faz isso apenas uma vez, através de parâmetros do construtor do diretor. O diretor usa o objeto builder em todas as construções futuras. Existe uma alternativa onde o builder é passado diretamente ao método de construção do diretor.
6. O resultado da construção pode ser obtido diretamente do diretor apenas se todos os produtos seguirem a mesma interface. Do contrário o cliente deve obter o resultado do builder.

## Prós e contras
-  Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
- Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
- Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.

* A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.