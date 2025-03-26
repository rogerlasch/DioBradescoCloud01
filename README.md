# DIO - Trilha Java Básico

## Desafio: Sintaxe - Conta Bancária

## Descrição

Este projeto consiste na criação de um programa simples em Java que recebe informações bancárias do usuário via terminal e exibe uma mensagem formatada com os dados inseridos ao final.

## Tecnologias Utilizadas

- Java

- Scanner para entrada de dados no terminal

- Concatenação de Strings

- Execução via linha de comando

## Estrutura do Projeto

O projeto contém uma única classe:

- ContaTerminal.java: Responsável por solicitar os dados do usuário, armazená-los em variáveis e exibir a mensagem formatada.

## Funcionalidades

### O programa solicita ao usuário os seguintes dados:

- Número da conta (inteiro)

- Número da agência (string)

- Nome do cliente (string)

- Saldo da conta (double)

Após inserir os dados, o sistema exibe a seguinte mensagem formatada:

Olá [Nome Cliente], obrigado por criar uma conta em nosso banco.
Sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.

## Como Executar

Instale o Java Development Kit (JDK) caso ainda não tenha instalado.

Compile o arquivo Java:

javac ContaTerminal.java

Execute o programa:

java ContaTerminal

Insira os dados conforme solicitado e visualize a mensagem final.

## Exemplo de Execução

Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite seu Nome:
MÁRIO ANDRADE
Por favor, digite o saldo:
237.48

Olá MÁRIO ANDRADE, obrigado por criar uma conta em nosso banco.
Sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.

# Autor

Róger Matheus Lasch

Projeto desenvolvido como parte da trilha de Java Básico na DIO - Digital Innovation One.

