# O Guia Definitivo de Flyweight para compreender de forma fácil

## O que é um padrão de projeto Flyweight?

O Flyweight é um padrão de projeto estrutural que permite a você colocar mais objetos na quantidade de RAM disponível ao
compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto.

Um objeto que apenas armazena o estado intrínseco (essencial) é chamado de um flyweight

<b>Flyweight e a imutabilidade</b>
Já que o mesmo objeto flyweight pode ser usado em diferentes contextos, você tem que certificar-se que seu estado não
pode ser modificado. Um flyweight deve inicializar seu estado apenas uma vez, através dos parâmetros do construtor. Ele
não deve expor qualquer setter ou campos públicos para outros objetos.

<b>Fábrica Flyweight</b>
Para um acesso mais conveniente para vários flyweights, você pode criar um método fábrica que gerencia um conjunto de
objetos flyweight existentes. O método aceita o estado intrínseco do flyweight desejado por um cliente, procura por um
objeto flyweight existente que coincide com esse estado, e retorna ele se for encontrado. Se não for, ele cria um novo
flyweight e o adiciona ao conjunto.

Há várias opções onde esse método pode ser colocado. O lugar mais óbvio é um contêiner de flyweights. Alternativamente
você pode criar uma nova classe fábrica. Ou você pode fazer o método fábrica ser estático e colocá-lo dentro da própria
classe do flyweight.

## Aplicação

*  Utilize o padrão Flyweight apenas quando seu programa deve suportar um grande número de objetos que mal cabem na RAM disponível.
  * O benefício de aplicar o padrão depende muito de como e onde ele é usado. Ele é mais útil quando:
   <ul>
     <li>uma aplicação precisa gerar um grande número de objetos similares </li>
     <li>isso drena a RAM disponível no dispositivo alvo</li>
     <li>os objetos contém estados duplicados que podem ser extraídos e compartilhados entre múltiplos objetos </li>
   </ul>

## COMO IMPLEMENTAR
1. Divida os campos de uma classe que irá se tornar um flyweight em duas partes:
   <ul>
     <li>o estado intrínseco: os campos que contém dados imutáveis e duplicados para muitos objetos </li>
     <li>o estado extrínseco: os campos que contém dados contextuais únicos para cada objeto </li>
   </ul>
2. Deixe os campos que representam o estado intrínseco dentro da classe, mas certifique-se que eles sejam imutáveis. Eles só podem obter seus valores iniciais dentro do construtor.
3. Examine os métodos que usam os campos do estado extrínseco. Para cada campo usado no método, introduza um novo parâmetro e use-o ao invés do campo.
4. Opcionalmente, crie uma classe fábrica para gerenciar o conjunto de flyweights. Ela deve checar por um flyweight existente antes de criar um novo. Uma vez que a fábrica está rodando, os clientes devem pedir flyweights apenas através dela. Eles devem descrever o flyweight desejado ao passar o estado intrínseco para a fábrica.
5. O cliente deve armazenar ou calcular valores para o estado extrínseco (contexto) para ser capaz de chamar métodos de objetos flyweight. Por conveniência, o estado extrínseco junto com o campo de referência flyweight podem ser movidos para uma classe de contexto separada.


## Prós e contras

| PRÓS                                                          | 
|---------------------------------------------------------------|
|  Você pode economizar muita RAM, desde que seu programa tenha muitos objetos similares. |

| CONTRA                                                                                  | 
|-----------------------------------------------------------------------------------------|
| Você pode estar trocando RAM por ciclos de CPU quando parte dos dados de contexto precisa ser recalculado cada vez que alguém chama um método flyweight. |
| O código fica muito mais complicado. Novos membros de equipe sempre se perguntarão por que o estado de uma entidade foi separado de tal forma. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O Flyweight é um padrão estrutural que visa economizar memória ao comportilhar objetos semelhantes em vez de criar novas instâncias repetidamente. Ele é útil quando há muitos objetos semelhantes, pois evita o consumo excessivo de memória.

(ENTENDIMENTO -> O flyweight é um padrão de projeto estrutural feito para gerenciar melhor os recusos enviado para memoria, ele tem como finalidade criar objetos estaticos e finais para serem instanciado uma unica vez e ser chamados pelas suas classes caso precise delas.)

Correções no seu entendimento:
 * O Flyweight não cria objetos estáticos e finais, mas gerencia instâncias compartilhadas para reduzir a duplicação de objetos na memória.
 * Ele geralmente usa uma fábrica (Factory) para verificar se um objeto já existe e, se existir, retorna a instância existente em vez de criar uma nova.
 * Ele separa o estado intrínseco (compartilhado entre objetos) do estado extrínseco (passado como argumento no momento do uso).