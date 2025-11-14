# Sistema Bancário Simples 🏦

Um sistema bancário simples desenvolvido em Java que permite o cadastro de clientes e gerenciamento de contas correntes e poupança.

## 📋 Funcionalidades

- **Cadastro de Clientes**: Registre clientes com nome, CPF e ID
- **Criação de Contas**: Crie contas correntes ou contas poupança
- **Gerenciamento de Contas**: Liste todas as contas cadastradas
- **Interface Interativa**: Menu simples via linha de comando

## 🚀 Tecnologias Utilizadas

- Java 17
- Maven 3.x
- Padrões de Orientação a Objetos (Herança, Polimorfismo, Interfaces)

## 📁 Estrutura do Projeto

```
banco/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── banco/
│                   ├── Banco.java          # Classe principal
│                   ├── Cliente.java        # Modelo do cliente
│                   ├── Conta.java          # Classe abstrata base
│                   ├── ContaCorrente.java  # Implementação conta corrente
│                   ├── ContaPoupanca.java  # Implementação conta poupança
│                   └── IConta.java         # Interface das operações
├── pom.xml                                 # Configuração Maven
└── README.md
```

## 🔧 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java 17** ou superior
- **Maven 3.6** ou superior

### Verificar instalação:

```bash
java -version
mvn -version
```

## 📦 Instalação e Execução

### 1. Clone o repositório

```bash
git clone https://github.com/raiiannicelli/banco-diome.git
cd banco-diome/banco
```

### 2. Compile e empacote o projeto

```bash
mvn clean package
```

Este comando irá:
- Limpar arquivos de compilação anteriores (`clean`)
- Compilar o código fonte
- Executar testes (se houver)
- Gerar o arquivo JAR executável

### 3. Execute a aplicação

```bash
java -jar target/banco-1.0-SNAPSHOT.jar
```

### Alternativa - Executar via Maven

```bash
mvn clean compile exec:java
```

## 🎮 Como Utilizar

Ao executar a aplicação, você verá um menu interativo:

```
Bem-vindo ao Banco!
1- Cadastrar cliente
2- Cadastrar conta
3- Listar contas
Escolha uma opção:
```

### Fluxo de Uso Recomendado:

1. **Cadastrar Cliente** (opção 1)
   - Digite o nome do cliente
   - Digite o CPF (apenas números)
   - Digite um ID único para o cliente

2. **Cadastrar Conta** (opção 2)
   - Informe o ID do cliente cadastrado
   - Escolha o tipo de conta:
     - `1` para Conta Corrente
     - `2` para Conta Poupança

3. **Listar Contas** (opção 3)
   - Visualize todas as contas cadastradas
   - Veja informações do cliente e tipo de conta

```

## 🏗️ Arquitetura

O projeto utiliza conceitos de Programação Orientada a Objetos:

- **Interface `IConta`**: Define o contrato para operações bancárias
- **Classe abstrata `Conta`**: Implementação base com propriedades comuns
- **Classes concretas**: `ContaCorrente` e `ContaPoupanca` com especializações
- **Classe `Cliente`**: Modelo de dados do cliente
- **Classe `Banco`**: Ponto de entrada e interface com usuário

## 🤝 Contribuição

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request