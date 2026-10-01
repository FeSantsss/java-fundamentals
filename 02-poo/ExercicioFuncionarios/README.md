# Cadastro de Funcionários (Java)

Este é um projeto simples em Java que simula o cadastro de funcionários físicos e remotos, utilizando conceitos de orientação a objetos, herança, enumerações e listas.

## ✨ Funcionalidades

- Cadastro de múltiplos funcionários.
- Diferenciação entre **Funcionários Físicos** e **Funcionários Remotos**.
- Enum para definição de cargo: `Junior`, `Pleno`, `Senior`.
- Validação de entrada e tratamento de erros.

## 🧱 Estrutura do Projeto


src/
├── application/
│ └── Program.java
├── model/
│ ├── entities/
│ │ ├── Funcionario.java
│ │ ├── FuncionarioFisico.java
│ │ └── FuncionarioRemoto.java
│ └── enums/
│ └── Cargos.java

.

## 🧠 Conceitos aplicados

POO (Programação Orientada a Objetos)
Herança e polimorfismo
Enumerações
Tratamento de exceções
instanceof para verificação de tipos
Manipulação de listas com ArrayList

## 💡 Exemplo de uso

Digite o número de funcionários: 2

Dados do funcionário #1
É funcionário físico ou remoto (f/r)? f
Primeiro nome: Lucas
Cargo (Junior/Pleno/Senior): Pleno
Número (0000): 1234
Salário: 3500.00

Dados do funcionário #2
É funcionário físico ou remoto (f/r)? r
Primeiro nome: Ana
Cargo (Junior/Pleno/Senior): Senior
Número (0000): 5678
Salário: 4800.00
