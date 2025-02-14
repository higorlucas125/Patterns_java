# O Guia Definitivo de Prototype para compreender de forma fácil

## O que é um Prototype?

O Prototype é um padrão de projeto criacional que permite a clonagem de objetos, mesmo complexos, sem acoplamento à suas
classes específicas.

Todas as classes de prototypes(protótipos) devem ter uma interface comum que permita copiar objetos, mesmo que suas
classes concretas sejam desconhecidas. Objetos protótipos podem produzir cópias completas, pois objetos da mesma classe
podem acessar os campos privados um do outro.

## Aplicabilidade

Utilize o padrão Prototype quando o seu código não deve depender de classes concretas de objetos que você precisa copiar

Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus
respetivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração
específica.

## Como implementar

1. crie uma “interface” protótipo e declare o método clonar nela. Ou apenas adicione o método para todas as classes de
   uma hierarquia de classes existente, se você tiver uma.
2. Uma classe protótipo deve definir o construtor alternativo que aceita um objeto daquela classe como um argumento. O
   construtor deve copiar os valores de todos os campos definidos na classe do objeto passado para a nova instância
   recém criada. Se você está mudando uma subclasse, você deve chamar o construtor da classe pai para permitir que a
   superclasse lide com a clonagem de seus campos privados.
3. O método de clonagem geralmente consiste em apenas uma linha: executando um operador new com a versão protótipo do
   construtor. Observe que toda classe deve explicitamente sobrescrever o método de clonagem and usar sua própria classe
   junto com o operador new. Do contrário, o método de clonagem pode produzir um objeto da classe superior.
4. Opcionalmente, crie um registro protótipo centralizado para armazenar um catálogo de protótipos usados com
   frequência.
   Você pode implementar o registro como uma nova classe factory ou colocá-lo na classe protótipo base com um método
   estático para recuperar o protótipo. Esse método deve procurar por um protótipo baseado em critérios de busca que o
   código cliente passou para o método. O critério pode ser tanto uma string ou um complexo conjunto de parâmetros de
   busca. Após o protótipo apropriado ser encontrado, o registro deve cloná-lo e retornar a cópia para o cliente.
   Por fim, substitua as chamadas diretas para os construtores das subclasses com chamadas para o método factory do
   registro do protótipo.

## Prós e contras

* Você pode clonar objetos sem acoplá-los a suas classes concretas.
* Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
* Você pode produzir objetos complexos mais convenientemente.
* Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

- Clonar objetos complexos que têm referências circulares pode ser bem complicado.

## Esse padrão de projeto não faz muito sentido

### Por qual motivo esse padrão não faz sentido?

- Quando vou precisar usar ele?
  R: Você deve usar Prototype quando criar um objeto for um processo custoso, como carregar várias propriedades, fazer
  cálculos complexos ou buscar dados externos. Ele também é útil quando você quer evitar criar novas instâncias do zero
  e, em vez disso, deseja duplicar um objeto existente mantendo seu estado
- Como posso implementar isso? para que eu preciso clonar algo que eu vou ter que construir de qualquer maneira?
  R: Você pode implementar o Prototype criando uma interface ou classe abstrata com um método clone(), e as classes
  concretas devem implementar esse método para criar cópias de si mesmas. Clonar um objeto é útil quando você já tem uma
  instância configurada e deseja reaproveitá-la sem precisar reconstruí-la do zero. Isso economiza processamento e
  facilita a reutilização.
  

### Quando usar:
 - Quando a criação de um objeto é custosa (tempo, recursos) ou requer configuração complexa.
 - Quando você precisa de cópias independentes de um objeto (ex.: testes, evitar efeitos colaterais).
 - Quando trabalha com abstrações e não sabe a classe concreta do objeto.

### Como implementar:
- Defina um método clone() na classe base (ou interface) para criar cópias do objeto.
- Use um registro de protótipos para armazenar configurações padrão (ex.: default_circle, admin_user).
- Clone o protótipo sempre que precisar de uma nova instância, em vez de usar new.
