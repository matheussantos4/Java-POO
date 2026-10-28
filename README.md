# Java POO

Repositório de exercícios, estudos e pequenos projetos desenvolvidos durante o aprendizado de Java e Programação Orientada a Objetos. Os exemplos praticam conceitos da linguagem por meio de programas simples, em geral executados pelo console.

## Organização

### `Arrays/`

Exercícios com arrays e coleções: agenda de contatos, uso de `ArrayList`, laços `forEach` e testes de manipulação e acesso a arrays.

### `EncapsulamentoConstrutores/`

Exemplos de modelagem com atributos, construtores e métodos, incluindo cadastro de alunos de academia, funcionários, veículos e alunos de uma turma.

### `HerancaPolimorfismo/`

- `Ex1/`: classe abstrata `Animal` e subclasses `Cachorro` e `Gato`, com sobrescrita de comportamento.
- `Ex2/`: hierarquia de veículos (`Veiculo`, `Carro` e `Moto`), cálculo de impostos e interface de financiamento.
- `UpCasting_DownCasting/Ex3/`: contas bancárias, subclasses de conta e conversões verificadas com `instanceof`.

### `ProjetosPOOSimples/`

Pequenos programas para cálculo de retângulo e triângulo, salário de funcionário, notas de aluno e controle de estoque.

### `TopicosPOO/`

- `Enums/`: exemplos de enumerações, estados de pedidos, itens e totalização de pedidos.
- `MembrosEstaticos/Dollar/`: conversão de moeda com acréscimo de IOF.
- `MembrosEstaticos/RaioCirculo/`: cálculo de circunferência e volume usando o valor de PI.

### `TryCatch/`

Exemplo de divisão com tratamento de `ArithmeticException` e `InputMismatchException`.

## Conceitos abordados

- Classes, objetos, atributos e métodos
- Encapsulamento, construtores, getters e setters
- Herança, classes abstratas, interfaces e polimorfismo
- Upcasting, downcasting e `instanceof`
- Arrays, `ArrayList` e laços de repetição
- Enumerações e estados de pedidos
- Membros estáticos
- Entrada e saída pelo console e tratamento de exceções

## Como executar

Os exemplos são independentes e não há um único ponto de entrada para todo o repositório. Para executar um exercício:

1. Abra o repositório em uma IDE compatível com Java, como IntelliJ IDEA ou VS Code.
2. Escolha a pasta do exemplo e localize a classe que contém `public static void main(String[] args)`.
3. Execute essa classe. Os programas que usam `Scanner` podem solicitar dados no console.

Também é possível compilar e executar pela linha de comando a partir da raiz, respeitando o nome totalmente qualificado da classe. Por exemplo, para `Arrays.ArrayList.Main`:

```bash
javac Arrays/ArrayList/Main.java
java Arrays.ArrayList.Main
```

O código usa recursos de Java de versões diferentes; recomenda-se um JDK recente (Java 21 ou superior), especialmente para os métodos `getFirst()` e `getLast()` usados no exemplo de `ArrayList`.
