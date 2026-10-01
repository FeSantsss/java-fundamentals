# ExercicioEspecial02

# Sistema de Pedido - Java

Este projeto é um sistema simples de gerenciamento de pedidos desenvolvido em Java, com foco na prática de conceitos fundamentais da Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades
- Cadastro de cliente (nome, email e data de nascimento).
- Criação de pedidos com múltiplos itens.
- Definição de status do pedido (`ESPERANDO_PAGAMENTO`, `PROCESSANDO`, `ENVIADO`, `ENTREGUE`).
- Cálculo automático dos subtotais de cada item e do valor total do pedido.
- Impressão dos dados completos do pedido, incluindo cliente, status e itens.

## 🏗️ Estrutura do Projeto
- **ClassePrincipal**
  - `Pedido.java`: Responsável por armazenar os dados do pedido, como cliente, lista de itens, status e momento.
- **ClasseSecundaria**
  - `Cliente.java`: Dados do cliente.
  - `Produto.java`: Dados dos produtos.
  - `ItemPedido.java`: Relaciona produtos, quantidades e preços dentro de um pedido.
- **Enum**
  - `StatusPedido.java`: Enumeração dos possíveis status de um pedido.
- **Exercicio**
  - `Programa.java`: Classe principal que executa o programa, recebe os dados do usuário e exibe o resumo do pedido.

## 💻 Tecnologias
- Java
- Programação Orientada a Objetos (POO)

## 📚 Conceitos aplicados
- Enumerações
- Manipulação de datas (`LocalDate` e `LocalDateTime`)
- Encapsulamento
- Listas (`ArrayList`)
- Boas práticas de organização em pacotes
- Composições

## 🚧 Melhorias futuras
- Persistência de dados (banco de dados ou arquivos).
- Interface gráfica (GUI) ou API.
- Validação de dados de entrada.

## Criador
- Felipy Santos
