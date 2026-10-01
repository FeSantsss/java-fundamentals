# Projeto: Filtragem de Funcionários por Salário e Soma de Salários por Inicial

![Java](https://img.shields.io/badge/Java-17-blue?logo=java) ![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

## Descrição
Este projeto em **Java** lê dados de funcionários de um arquivo CSV, processa essas informações e exibe resultados de forma organizada.  

O programa realiza duas operações principais:  
1. Exibe **emails dos funcionários** cujo **salário é maior que um valor informado pelo usuário**, em **ordem alfabética**.  
2. Calcula a **soma dos salários** de funcionários cujo **nome começa com a letra 'M'**.  

---

## Estrutura do Projeto
src/
├─ aplicattion/
│ └─ Program.java # Classe principal
└─ model/entities/
└─ Employee.java # Classe modelo de funcionário


- **Program.java** → Lê o arquivo CSV, recebe entradas do usuário e executa operações usando Streams.  
- **Employee.java** → Representa um funcionário com atributos: `name`, `email` e `salary`.  

---

## Funcionalidades

1. **Leitura de Arquivo CSV**  
   - Formato esperado: `Nome,Email,Salario`  
   - Exemplo de arquivo:
     ```
     Maria Silva,maria@email.com,3500.50
     João Souza,joao@email.com,2800.00
     Marcos Lima,marcos@email.com,4000.00
     ```

2. **Filtragem de Funcionários por Salário**  
   - Usuário informa o **salário mínimo**.  
   - O programa exibe os **emails dos funcionários com salário igual ou maior**, ordenados alfabeticamente.

3. **Soma de Salários por Inicial**  
   - Soma os salários de funcionários cujo **nome começa com “M”**, ignorando maiúsculas ou minúsculas.  

---

## Como Executar

### Requisitos
- Java 8 ou superior
- Terminal ou IDE (Eclipse, IntelliJ, VS Code)

### Passos

1. Compile os arquivos:

```
bash
javac -d bin src/aplication/Program.java src/model/entities/Employee.java

Execute o programa:

java -cp bin aplicattion.Program


Siga as instruções do console:

Informe o caminho completo do arquivo CSV.

Informe o salário mínimo para filtragem.

Enter file full path: /home/usuario/funcionarios.csv
Enter salary: 3000

Email of people whose salary is more than 3000:
marcos@email.com
maria@email.com

Sum of salary of people whose name starts with 'M': 7500.50
```

---

## Tecnologias Utilizadas

Java 8+
Streams do Java
Arquivo CSV para armazenamento de dados simples

## Autor

## Felipy Santoss :)
