# Programa de Cálculo de Impostos

Este projeto em Java foi desenvolvido para calcular o imposto a ser pago por contribuintes, utilizando conceitos de orientação a objetos com classes e métodos abstratos. Implementado como parte do aprendizado em programação, segue as diretrizes de modelagem de classes e cálculos específicos para cada tipo de contribuinte.

## Descrição do Projeto

O projeto consiste em um programa Java para calcular e exibir o imposto a ser pago por contribuintes, sejam eles pessoas físicas ou jurídicas. As principais funcionalidades incluem:

1. ### Cadastro de Contribuintes:
   - O programa permite ao usuário cadastrar um número específico de contribuintes (pessoas físicas ou jurídicas).
   - Para cada contribuinte, são fornecidos os dados necessários como nome, renda anual e informações específicas adicionais dependendo do tipo (gastos com saúde para pessoas físicas e número de funcionários para pessoas jurídicas).
2. ### Cálculo de Imposto:
   - Com base nos dados fornecidos (renda anual e informações adicionais), o programa calcula o imposto devido por cada contribuinte.
   - As regras de cálculo são distintas para pessoas físicas e jurídicas, conforme descrito no enunciado do exercício.
3. ### Exibição dos Resultados:
   - Após o cadastro e cálculo dos impostos, o programa exibe o valor do imposto pago por cada contribuinte.
   - Além disso, é apresentado o total de impostos arrecadados pelo programa.

## Funcionalidades Implementadas

- Classes Abstratas e Métodos Abstratos: Utilização de classes abstratas para representar contribuintes genéricos e métodos abstratos para calcular impostos específicos de acordo com o tipo de contribuinte.
- Cadastro de contribuintes como pessoas físicas ou jurídicas.
- Cálculo de imposto diferenciado conforme o tipo de contribuinte.
- Exibição detalhada do imposto pago por cada contribuinte e total arrecadado.

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.

## Exemplo de Uso

Ao iniciar o programa, você será solicitado a informar quantos contribuintes deseja cadastrar. Para cada contribuinte, você deverá escolher se é uma pessoa física ou jurídica e fornecer os dados solicitados (nome, renda anual, e dados adicionais como gastos com saúde ou número de funcionários).

Após o cadastro, o programa calculará automaticamente o imposto devido por cada contribuinte e exibirá o valor do imposto pago por cada um, bem como o total de imposto arrecadado pelo sistema.
