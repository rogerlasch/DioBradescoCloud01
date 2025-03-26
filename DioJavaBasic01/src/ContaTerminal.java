/**
 * Projeto: ContaBanco - Desafio de Sintaxe Java
 * Autor: Róger
 * Data: 25/03/2025
 * <p>
 * Descrição:
 * Este programa recebe dados via terminal para criar uma conta bancária,
 * incluindo número da conta, agência, nome do cliente e saldo inicial.
 * Ao final, exibe uma mensagem formatada confirmando a criação da conta.
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta.");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência.");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite seu nome.");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo.");
        ;
        double saldo = sc.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
        ;
    }
}