# Java POO - Programação Orientada a Objetos

## 📋 Apresentação

Este repositório contém estudos e práticas relacionados a **Programação Orientada a Objetos (POO)** em Java. O projeto
foi desenvolvido para fins educacionais, abordando os principais conceitos e princípios da POO, como classes, herança,
polimorfismo, encapsulamento e abstração.

## 🎯 Objetivos

- Aprender e consolidar os conceitos fundamentais da POO
- Praticar implementação de classes e objetos em Java
- Compreender relações entre classes (herança, composição)
- Aplicar princípios de design e boas práticas

## 📁 Estrutura do Projeto

```
Java-POO/
├── ProjetosPOO/                    # Pasta para projetos práticos em Java
│   ├── retangulo/                   # Projeto: Cálculo de retângulo
│   ├── Salario/                     # Projeto: Exemplo de funcionário e salário
│   ├── sistemaEstoque/              # Projeto: Sistema simples de estoque
│   ├── sistemaNotas/                # Projeto: Sistema de notas de alunos
│   └── triangulo/                   # Projeto: Comparação de triângulos
├── EncapsulamentoConstrutores/      # Projetos de encapsulamento e construtores
│   ├── CadastroAcademia/            # Cadastro de alunos em academia
│   ├── CadastroDeFuncionarios/      # Cadastro de funcionários
│   ├── CadastroVeiculos/            # Cadastro de veículos
│   ├── MediaAlunos/                 # Cálculo de média de alunos
│   └── sistemaEstoque2/             # Sistema de estoque (versão 2)
├── topicosPOO/                      # Conteúdos teóricos e exemplos de POO
│   └── MembrosEstaticos/            # Exemplos de membros estáticos
│       ├── Dollar/                  # Conversor de moeda com membros estáticos
│       └── RaioCirculo/             # Cálculo de círculo com membros estáticos
└── README.md                        # Documentação do projeto
```

## 📦 Projetos Inclusos

### 1. **Triângulo** (`ProjetosPOO/triangulo/`)

Um programa que demonstra conceitos básicos de POO usando a manipulação de triângulos.

**Componentes:**

- **Tri.java**: Classe que representa um triângulo com três lados (a, b, c) e calcula sua área com a Fórmula de Heron.
- **mainTriangulo.java**: Programa principal que lê as medidas de dois triângulos e compara suas áreas.

**Funcionalidades:**

- Entrada de dados via teclado
- Cálculo de área de triângulos
- Comparação entre áreas
- Exibição de resultados formatados

### 2. **Retângulo** (`ProjetosPOO/retangulo/`)

Um exemplo de classe que calcula propriedades geométricas de um retângulo.

**Componentes:**

- **ret.java**: Classe que representa um retângulo com largura e altura e calcula área, perímetro e diagonal.
- **retanguloMain.java**: Programa principal que lê largura e altura do retângulo e exibe os resultados.

**Funcionalidades:**

- Entrada de largura e altura via teclado
- Cálculo de área, perímetro e diagonal
- Saída formatada dos resultados

### 3. **Salário** (`ProjetosPOO/Salario/`)

Um exemplo simples de classe para modelar funcionário e salário.

**Componentes:**

- **funcionario.java**: Classe que armazena nome e salário do funcionário.
- **mainSalario.java**: Estrutura de programa principal para demonstrar leitura de dados e uso da classe `funcionario`.

**Funcionalidades:**

- Modelo básico de classe de funcionário
- Estrutura para entrada de dados via teclado
- Possível base para cálculos de salário e benefícios

### 4. **Sistema de Estoque** (`ProjetosPOO/sistemaEstoque/`)

Um programa que demonstra como gerenciar informações de um produto em estoque.

**Componentes:**

- **Product.java**: Classe que representa um produto com nome, preço, quantidade e cálculo de valor total.
- **mainEstoque.java**: Programa principal que lê dados do produto, adiciona e remove itens do estoque.

**Funcionalidades:**

- Entrada de nome, preço e quantidade por teclado
- Exibição de dados do produto
- Adição e remoção de quantidade em estoque
- Cálculo do valor total do produto em estoque

### 5. **Sistema de Notas** (`ProjetosPOO/sistemaNotas/`)

Um programa que gerencia notas de alunos e calcula sua média final.

**Componentes:**

- **aluno.java**: Classe que armazena dados do aluno (nome, três notas) e calcula a soma/média.
- **mainNotas.java**: Programa principal que lê nome e notas do aluno, exibindo os resultados.

**Funcionalidades:**

- Entrada de nome e três notas por teclado
- Cálculo de soma e média das notas
- Exibição formatada dos resultados

## � Tópicos de POO

### **Membros Estáticos** (`topicosPOO/MembrosEstaticos/`)

Exemplos práticos de uso de variáveis e métodos estáticos em Java.

#### 1. **Conversor de Dólar** (`Dollar/`)

Um programa que utiliza membros estáticos para fazer conversão de moedas.

**Componentes:**

- **CurrencyConverter.java**: Classe com método estático para converter dólares em reais.
- **mainDollar.java**: Programa principal que lê cotação e quantidade de dólares a converter.

**Funcionalidades:**

- Entrada de cotação do dólar
- Entrada de quantidade de dólares
- Conversão utilizando método estático
- Exibição do resultado formatado

#### 2. **Raio do Círculo** (`RaioCirculo/`)

Um exemplo de uso de métodos e variáveis estáticas para calcular propriedades de círculos.

**Componentes:**

- **Calculator.java**: Classe com métodos estáticos para cálculos geométricos.
- **raioCirculo.java**: Programa principal que lê o raio e calcula área e perímetro.

**Funcionalidades:**

- Cálculo de área de círculo
- Cálculo de perímetro (circunferência)
- Uso de constantes estáticas

## 🔒 Encapsulamento e Construtores

### **EncapsulamentoConstrutores/**

Projetos que demonstram o uso de encapsulamento, construtores e getters/setters em Java.

#### 1. **Cadastro Academia** (`CadastroAcademia/`)

Sistema de cadastro de alunos em uma academia.

**Componentes:**

- **Aluno.java**: Classe com encapsulamento de dados de aluno (nome, idade, peso, altura, plano).
- **SistemaAcademia.java**: Programa principal que gerencia cadastro de alunos.

**Funcionalidades:**

- Cadastro de alunos com validação de dados
- Armazenamento de informações pessoais
- Diferentes tipos de plano (Básico, Premium)

#### 2. **Cadastro de Funcionários** (`CadastroDeFuncionarios/`)

Gerenciamento de dados de funcionários com encapsulamento.

**Componentes:**

- **Funcionario.java**: Classe que encapsula dados de funcionário (nome, salário, etc).
- **Ex1main.java**: Programa principal para cadastro e exibição de funcionários.

**Funcionalidades:**

- Encapsulamento de informações sensíveis
- Getters e setters com validação
- Cálculos de salário e benefícios

#### 3. **Cadastro de Veículos** (`CadastroVeiculos/`)

Sistema de cadastro e gerenciamento de veículos.

**Componentes:**

- **Veiculos.java**: Classe que representa um veículo com propriedades encapsuladas.
- **SistemaCadastro.java**: Programa principal para cadastro de veículos.

**Funcionalidades:**

- Armazenamento de dados de veículos (marca, modelo, ano, etc)
- Cálculos relacionados a veículos
- Gerenciamento de frota

#### 4. **Cálculo de Média de Alunos** (`MediaAlunos/`)

Sistema para calcular média de alunos com encapsulamento de dados.

**Componentes:**

- **Aluno.java**: Classe que armazena nome e notas do aluno.
- **turmaAlunos.java**: Classe para gerenciar turma de alunos.
- **ex2Main.java**: Programa principal que calcula e exibe médias.

**Funcionalidades:**

- Cálculo de média de notas
- Classificação de alunos
- Gerenciamento de turmas

#### 5. **Sistema de Estoque v2** (`sistemaEstoque2/`)

Versão melhorada do sistema de estoque com encapsulamento.

**Componentes:**

- **Product.java**: Classe encapsulada de produto com validação.
- **mainEstoque.java**: Programa principal com operações de estoque.

**Funcionalidades:**

- Validação de dados com getters/setters
- Operações de entrada e saída de estoque
- Cálculo de valor total

## 🚀 Como Usar

### Executar um dos projetos:

1. Clone ou baixe este repositório
2. Navegue até a pasta do projeto desejado
3. Abra em uma IDE Java (Eclipse, IntelliJ IDEA, VS Code com extensões Java)
4. Compile todos os arquivos Java do projeto escolhido. Exemplo:
    - `javac ProjetosPOO/triangulo/*.java`
    - `javac ProjetosPOO/retangulo/*.java`
    - `javac ProjetosPOO/Salario/*.java`
    - `javac ProjetosPOO/sistemaEstoque/*.java`
    - `javac ProjetosPOO/sistemaNotas/*.java`
    - `javac EncapsulamentoConstrutores/CadastroAcademia/*.java`
    - `javac EncapsulamentoConstrutores/CadastroDeFuncionarios/*.java`
    - `javac EncapsulamentoConstrutores/CadastroVeiculos/*.java`
    - `javac EncapsulamentoConstrutores/MediaAlunos/*.java`
    - `javac EncapsulamentoConstrutores/sistemaEstoque2/*.java`
    - `javac topicosPOO/MembrosEstaticos/Dollar/*.java`
    - `javac topicosPOO/MembrosEstaticos/RaioCirculo/*.java`
5. Execute a classe principal do projeto escolhido. Exemplo:
    - `java ProjetosPOO.triangulo.mainTriangulo`
    - `java ProjetosPOO.retangulo.retanguloMain`
    - `java ProjetosPOO.Salario.mainSalario`
    - `java ProjetosPOO.sistemaEstoque.mainEstoque`
    - `java ProjetosPOO.sistemaNotas.mainNotas`
    - `java EncapsulamentoConstrutores.CadastroAcademia.SistemaAcademia`
    - `java EncapsulamentoConstrutores.CadastroDeFuncionarios.Ex1main`
    - `java EncapsulamentoConstrutores.CadastroVeiculos.SistemaCadastro`
    - `java EncapsulamentoConstrutores.MediaAlunos.ex2Main`
    - `java EncapsulamentoConstrutores.sistemaEstoque2.mainEstoque`
    - `java topicosPOO.MembrosEstaticos.Dollar.mainDollar`
    - `java topicosPOO.MembrosEstaticos.RaioCirculo.raioCirculo`

## 📚 Tecnologias

- **Linguagem:** Java
- **Conceito:** Programação Orientada a Objetos

## 📝 Notas

Este é um repositório de aprendizado. Sinta-se livre para explorar, modificar e expandir os exemplos conforme
necessário.

---

**Última atualização:** Maio de 2026


