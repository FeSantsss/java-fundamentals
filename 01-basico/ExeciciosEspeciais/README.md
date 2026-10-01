# ExeciciosEspeciais
🧾 Sistema de Cálculo de Impostos
Este é um programa simples em Java que calcula os impostos de diferentes tipos de contribuintes — 
Pessoa Física e Pessoa Jurídica — com base em suas rendas anuais e características específicas.

🚀 Funcionalidades
Cadastro de contribuintes do tipo:
Pessoa Física
Pessoa Jurídica

Cálculo de impostos baseado:
Na renda anual
Gastos com saúde (Pessoa Física)
Quantidade de funcionários (Pessoa Jurídica)
Exibição dos impostos pagos por cada contribuinte
Exibição do total de impostos pagos

🏗️ Estrutura do Projeto

/src
│
├── application
│   └── Program.java          // Classe principal (main)
│
└── entities
    ├── Pessoa.java           // Classe abstrata base
    ├── PessoaFisica.java     // Subclasse de Pessoa
    └── PessoaJuridica.java   // Subclasse de Pessoa

📜 Regras de Negócio

🔸 Pessoa Física:

Imposto:

15% da renda anual se a renda for menor que R$ 20.000

25% da renda anual se a renda for igual ou maior que R$ 20.000

Desconto:

50% dos gastos com saúde são abatidos do imposto.

🔸 Pessoa Jurídica:

Imposto:

14% da renda anual se tiver mais de 10 funcionários

16% da renda anual se tiver 10 ou menos funcionários

📦 Tecnologias:

Java (JDK 17 ou superior recomendado)
Programação Orientada a Objetos (POO)
Console para entrada e saída de dados

✍️ Autor
Desenvolvido por Felipy Santos.
