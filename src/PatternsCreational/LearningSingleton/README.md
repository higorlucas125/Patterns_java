# O Guia Definitivo de Singleton para compreender de forma fácil

## O que é o metodo de criação Singleton ?

O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único
ponto de acesso a ele para qualquer outro código.

## Como usalo ?

* Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.
* Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos
  panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o
  objeto em cache

## Aplicação

* Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus
  clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
* Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais

## Como implementar ?

1. Adicione um campo privado estático na classe para o armazenamento da instância singleton.
2. Declare um método de criação público estático para obter a instância singleton.
3. Implemente a “inicialização preguiçosa” dentro do método estático. Ela deve criar um novo objeto na sua primeira
   chamada e colocá-lo no campo estático. O método deve sempre retornar aquela instância em todas as chamadas
   subsequentes.
4. Faça o construtor da classe ser privado. O método estático da classe vai ainda ser capaz de chamar o construtor, mas
   não os demais objetos.
5. Vá para o código cliente e substitua todas as chamadas diretas para o construtor do singleton com chamadas para seu
   método de criação estático.

## Prós e Contras

- Você pode ter certeza que uma classe só terá uma única instância.
- Você ganha um ponto de acesso global para aquela instância.
- O objeto singleton é inicializado somente quando for pedido pela primeira vez.

* Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
* O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre cada
  um.
* O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto
  singleton várias vezes.
* Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem
  de herança quando produzem objetos simulados. Já que o construtor da classe singleton é privado e sobrescrever métodos
  estáticos é impossível na maioria das linguagem, você terá que pensar em uma maneira criativa de simular o singleton.
  Ou apenas não escreva os testes. Ou não use o padrão Singleton.