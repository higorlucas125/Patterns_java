# O Guia Definitivo de Memento para compreender de forma fácil

Também conhecido como: Lembrança, Retrato, Snapshot

## O que é um padrão de projeto Memento ?

O Memento é um padrão de projeto comportamental que permite que você salve e restaure o estado anterior de um objeto sem
revelar os detalhes de sua implementação.

## Aplicação

* Utilize o padrão Memento quando você quer produzir retratos do estado de um objeto para ser capaz de restaurar um
  estado anterior do objeto.
    * O padrão Memento permite que você faça cópias completas do estado de um objeto, incluindo campos privados, e
      armazená-los separadamente do objeto. Embora a maioria das pessoas vão lembrar desse padrão graças ao caso
      “desfazer”, ele também é indispensável quando se está lidando com transações (isto é, se você precisa reverter uma
      operação quando se depara com um erro).


* Utilize o padrão quando o acesso direto para os campos/getters/setters de um objeto viola seu encapsulamento.
    * O Memento faz o próprio objeto ser responsável por criar um retrato de seu estado. Nenhum outro objeto pode ler o
      retrato, fazendo do estado original do objeto algo seguro e confiável.

## COMO IMPLEMENTAR

1. Determine qual classe vai fazer o papel de originadora. É importante saber se o programa usa um objeto central deste
   tipo ou múltiplos objetos pequenos.
2. Crie a classe memento. Um por um, declare o conjunto dos campos que espelham os campos declarados dentro da classe
   originadora.
3. Faça a classe memento ser imutável. Um memento deve aceitar os dados apenas uma vez, através do construtor. A classe
   não deve ter setters.
4. Se a sua linguagem de programação suporta classes aninhadas, aninhe o memento dentro da originadora. Se não, extraia
   uma interface em branco da classe memento e faça todos os outros objetos usá-la para se referir ao memento. Você pode
   adicionar algumas operações de metadados para a interface, mas nada que exponha o estado da originadora.
5. Adicione um método para produção de mementos na classe originadora. A originadora deve passar seu estado para o
   memento através de um ou múltiplos argumentos do construtor do memento.
   O tipo de retorno do método deve ser o da interface que você extraiu na etapa anterior (assumindo que você extraiu
   alguma coisa). Por debaixo dos panos, o método de produção de memento deve funcionar diretamente com a classe
   memento.
6. Adicione um método para restaurar o estado da classe originadora para sua classe. Ele deve aceitar o objeto memento
   como um argumento. Se você extraiu uma interface na etapa anterior, faça-a do tipo do parâmetro. Neste caso, você
   precisa converter o tipo do objeto que está vindo para a classe memento, uma vez que a originadora precisa de acesso
   total a aquele objeto.
7. A cuidadora, estando ela representando um objeto comando, um histórico, ou algo completamente diferente, deve saber
   quando pedir novos mementos da originadora, como armazená-los, e quando restaurar a originadora com um memento em
   particular.
8. O elo entre cuidadoras e originadoras deve ser movido para dentro da classe memento. Neste caso, cada memento deve se
   conectar com a originadora que criou ele. O método de restauração também deve ser movido para a classe memento.
   Contudo, isso tudo faria sentido somente se a classe memento estiver aninhada dentro da originadora ou a classe
   originadora fornece setters suficientes para sobrescrever seu estado.

## Prós e contras

| PRÓS                                                                                                                    | 
|-------------------------------------------------------------------------------------------------------------------------|
| Você pode produzir retratos do estado de um objeto sem violar seu encapsulamento.                                       |
| Você pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora. |

| CONTRA                                                                                                                                                           | 
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.                                                                        |
| Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.                                                    |
| A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto. |

## EXPLICANDO DA MINHA MANEIRA QUE ENTENDI E REVISANDO

O memento é um padrão de projeto comportamental que perimite salvar objetos e modificiar objeto guando o seu estado,
assim podendo reverter a instancia criada no momento

O padrão Memento funciona como um "ctrl+z" da vida real. Ele permite que você salve o estado de um objeto em um
determinado momento, como se fosse um ponto de restauração, e depois, se precisar, volte para esse estado salvo. Imagine
que você está editando um texto ou jogando um videogame: você pode fazer várias mudanças, mas se algo der errado,
consegue voltar praquele momento anterior que você salvou. No Memento, o objeto principal (chamado de "originador") cria
uma cópia do seu estado e guarda isso num "memento" (tipo uma caixinha de memória). Aí, quem cuida dessa caixinha (o "
cuidador") pode usar ela pra restaurar o objeto ao estado anterior quando quiser, sem mexer diretamente na estrutura
interna dele.

## Editor de formas e desfazer/refazer complexo

Este editor gráfico permite alterar a cor e a posição das formas na tela. No entanto, qualquer modificação pode ser
desfeita e repetida.

O “desfazer” é baseado na colaboração entre os padrões Memento e Command. O editor rastreia um histórico dos comandos
executados. Antes de executar qualquer comando, ele faz um backup e o conecta ao objeto de comando. Após a execução, ele
adiciona o comando executado para o histórico.

Quando um usuário solicita o desfazer, o editor busca um comando recente do histórico e restaura o estado do backup
mantido dentro desse comando. Se o usuário solicitar outro desfazer, o editor utilizará o próximo comando do histórico e
assim por diante.

Os comandos revertidos são mantidos no histórico até que o usuário faça algumas modificações nas formas na tela. Isso é
crucial para refazer comandos desfeitos.



