## Prova de conceito 

## Minhas respostas 
Factory Method

Qual a principal diferença entre o Factory Method e um simples método estático de criação?
R: A principal diferença é que o facotry tem como objetivo criar outros objetos de outras classes, eo metodo estático não, ele é um metodo que nunca muda a fabrica sempre pode mudar de objeto, por exemplo eu tenho carro, moto e caminhão, na minha fabrica de automoveis, eu posso pedir coisas comum que possui nos 3, como roda,parabriza e etc... então crio uma interface automoveis e coloco esses metodos nela e com isso implemento elas no carro,moto e caminhão, na hora que eu for chamar na  minha classe concreta eu chamo somente automovel criando um caminhão

Como garantir que diferentes subclasses possam definir sua própria implementação do Factory Method?
R:Eu pego algo em comum entre elas crio um interface que foi implementadoa  elas, depois disso eu posso criar novos metodos particulares de cada subclasse

Abstract Factory

Quando faz sentido usar Abstract Factory em vez de múltiplos Factory Methods?
R:Quando quero iniciar em um unico ponto

Como o Abstract Factory ajuda a garantir a compatibilidade entre objetos criados?
R:Ela vai existir em um unico ponto, então caso queira criar novas processos é somente ir adicionando, assim o codigo não irá quebrar

Singleton

Quais são as principais formas de implementar o Singleton em Java ou em outra linguagem que você usa?
R: a principal forma de implementar singleton é criando um construtor privado e seus metodos deixando somente uma parte para ser usada, que chamamos de  instance, e o singleton não pode ser instanciado por new

Como evitar problemas de concorrência em um Singleton?
R: usando synchronized para sincronizar as threads

Builder

Qual a principal vantagem do padrão Builder em relação a um simples construtor com vários parâmetros?
R: Diminuição de codigos e também a melhoria de ter um ponto fixo que você possa utilizar

Como o Builder pode ser utilizado para criar objetos imutáveis?
R: Usando enums

Prototype

Em que situações o padrão Prototype pode ser mais eficiente que instanciar objetos do zero?
R: Quando o processo de criar é muito trabalhoso, então você usa o prototype, assim não criando um objeto do zero e sim copiando, copiar gasta menos recursos

Qual a diferença entre cópia rasa (shallow copy) e cópia profunda (deep copy) no contexto do Prototype?
R: shallow Copy é uma parte de um objeto
R: deep Copy é a copia completa do objeto


## Correção 

Factory Method
✅ Qual a principal diferença entre o Factory Method e um simples método estático de criação?
Sua resposta capta a ideia geral, mas poderia ser mais precisa.
🔹 Correção: A diferença principal é que o Factory Method permite que subclasses decidam qual classe concreta instanciar, promovendo maior flexibilidade e extensibilidade. Já um método estático de criação geralmente retorna uma instância específica e fixa, sem possibilidade de extensão via herança.

✅ Como garantir que diferentes subclasses possam definir sua própria implementação do Factory Method?
🔹 Correção: O Factory Method deve ser definido como um método abstrato na classe base ou interface. Dessa forma, cada subclasse deve fornecer sua própria implementação do método de criação, garantindo que objetos específicos sejam criados corretamente.

Abstract Factory
✅ Quando faz sentido usar Abstract Factory em vez de múltiplos Factory Methods?
Sua resposta está um pouco vaga.
🔹 Correção: O Abstract Factory é útil quando queremos criar famílias de objetos relacionados sem especificar suas classes concretas. Ele encapsula múltiplos Factory Methods para garantir que os objetos criados sejam compatíveis entre si.

✅ Como o Abstract Factory ajuda a garantir a compatibilidade entre objetos criados?
🔹 Correção: Como todos os objetos são criados por um único factory, podemos garantir que eles pertencem à mesma família e funcionam bem juntos. Por exemplo, se estivermos criando um tema para um aplicativo, o Abstract Factory pode garantir que botões, caixas de texto e menus tenham um estilo visual coerente.

Singleton
✅ Quais são as principais formas de implementar o Singleton?
🔹 Correção: As principais formas são:

Singleton Preguiçoso (Lazy Initialization) – Criado somente quando necessário.
Singleton Eager (Eager Initialization) – Criado na inicialização da classe.
Singleton com synchronized – Protege contra concorrência.
Singleton com volatile + Double-Checked Locking – Melhor desempenho.
Singleton usando Enum – Solução mais segura contra serialização e reflexão.
✅ Como evitar problemas de concorrência em um Singleton?
🔹 Correção: O uso de synchronized pode ser uma solução, mas há alternativas mais eficientes, como o Double-Checked Locking e o uso de Enum, que garante a segurança automaticamente.

Builder
✅ Qual a principal vantagem do padrão Builder em relação a um simples construtor com vários parâmetros?
🔹 Correção: A principal vantagem é melhorar a legibilidade e manutenção do código ao criar objetos complexos de forma progressiva e fluida. Isso evita construtores telescópicos (muitos parâmetros opcionais) e melhora a imutabilidade.

❌ Como o Builder pode ser utilizado para criar objetos imutáveis?
🔹 Correção: Não usamos enum para isso. Para criar objetos imutáveis com Builder, fazemos o seguinte:

Definimos todos os atributos como final.
Não fornecemos métodos setters.
Criamos um construtor privado e usamos o Builder para definir os valores antes de construir o objeto.
Prototype
✅ Em que situações o padrão Prototype pode ser mais eficiente que instanciar objetos do zero?
🔹 Correção: Quando a criação de um objeto é cara em termos de processamento (por exemplo, carregar um objeto de um banco de dados ou realizar computações complexas para configurá-lo), o Prototype permite copiar um objeto existente para economizar tempo e recursos.

✅ Qual a diferença entre cópia rasa (shallow copy) e cópia profunda (deep copy)?
🔹 Correção:

Shallow Copy (Cópia Rasa): Copia apenas as referências para os objetos internos, então alterações no objeto original afetam a cópia.
Deep Copy (Cópia Profunda): Cria novas instâncias de todos os objetos internos, garantindo que o clone seja totalmente independente do original.


# Desafios de Padrões de Projeto Criacionais

Este repositório contém desafios para validar seus conhecimentos sobre os padrões de projeto criacionais em **Java** (ou qualquer outra linguagem de sua escolha). Resolva os desafios implementando os padrões corretamente e envie suas soluções!

## 1. Factory Method
### Desafio:
Implemente um **Factory Method** para um sistema de notificação que suporte **E-mail, SMS e Push Notification** sem expor as classes concretas diretamente.

### Requisitos:
- Criar uma interface `Notification` com um método `sendMessage(String message)`.
- Implementar `EmailNotification`, `SMSNotification` e `PushNotification`.
- Criar uma **fábrica abstrata** para instanciar a notificação correta com base em um parâmetro.

## 2. Abstract Factory
### Desafio:
Você precisa desenvolver um sistema que suporte **diferentes temas gráficos** (Dark e Light). Cada tema deve criar **Botões e Checkboxes** de maneira consistente.

### Requisitos:
- Criar interfaces `Button` e `Checkbox` com um método `render()`.
- Criar implementações `DarkButton`, `LightButton`, `DarkCheckbox` e `LightCheckbox`.
- Criar um **Abstract Factory** (`UIFactory`) para gerar os componentes adequados de acordo com o tema selecionado.

## 3. Singleton
### Desafio:
Implemente um **Singleton** para gerenciar **logs do sistema**, garantindo que todas as mensagens de log sejam centralizadas.

### Requisitos:
- Criar uma classe `Logger` com um método `log(String message)`.
- Garantir que **somente uma instância** de `Logger` seja usada.
- Tornar a implementação **thread-safe**.

## 4. Builder
### Desafio:
Implemente um **Builder** para criar objetos `Pizza` de uma pizzaria. O pedido deve incluir **tipo de massa, molho, recheios e borda recheada (opcional)**.

### Requisitos:
- Criar uma classe `Pizza` com os atributos necessários.
- Criar um `PizzaBuilder` para facilitar a construção de diferentes combinações de pizza.
- Garantir que o objeto `Pizza` seja **imutável** após ser construído.

## 5. Prototype
### Desafio:
Você trabalha em um sistema de jogos e precisa criar personagens com **muitas configurações de atributos** (vida, força, agilidade, etc.). Para otimizar o desempenho, use **Prototype** para copiar personagens base.

### Requisitos:
- Criar uma classe `Character` com vários atributos.
- Implementar `clone()` para criar cópias eficientes de personagens existentes.
- Diferenciar **shallow copy** de **deep copy** na implementação.

## Como Participar?
1. Escolha um ou mais desafios para resolver.
2. Implemente a solução em sua linguagem de programação preferida.
3. Envie um Pull Request ou compartilhe seu código para revisão!

Boa sorte e bons estudos! 🚀
