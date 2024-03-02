package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithClient.ServiceAccount;

import java.util.Scanner;

public class TestNewAccountWithDAO {
    public static void main(String[] args) {
        ServiceAccount saTest = new ServiceAccount();
        Scanner scanner = new Scanner(System.in);


//        CREATE CLIENT


//        System.out.println("Digite nome do cliente:");
//        String clientName = scanner.next();
//        System.out.println("Digite o cpf do cliente:");
//        String clientCpf = scanner.next();
//        System.out.println("Digite o email do cliente:");
//        String clientEmail = scanner.next();
//
//        saTest.openAccount(new Client(clientName,clientCpf,clientEmail));
//        System.out.println("Conta aberta com sucesso!");


//        CLIENT LIST


        System.out.println("Contas cadastradas:");
        var clientList = saTest.showAccount();
        clientList.stream().forEach(System.out::println);


//        WITHDRAW OR DEPOSIT MONEY


//        System.out.println("Digite o número da conta:");
//        var idAccount = scanner.nextInt();
//
//        System.out.println("Digite o valor do saque:");
//        var value = scanner.nextBigDecimal();

//        saTest.makeWithdrawal(idAccount, value);
//        saTest.makeDeposit(idAccount, value);


//        TRANSFER MONEY


//        System.out.println("Digite o número da conta:");
//        var idAccount = scanner.nextInt();
//
//        System.out.println("Digite o número da outra conta:");
//        var idAccount2 = scanner.nextInt();
//
//        System.out.println("Digite o valor do saque:");
//        var value = scanner.nextBigDecimal();
//        saTest.transferMoney(idAccount,idAccount2,value);


//        DELETE ACCOUNT


//        System.out.println("Digite o número da conta que quer excluir:");
//        var idAccountDelete = scanner.nextInt();
//
//        saTest.deleteAccount(idAccountDelete);
    }
}
