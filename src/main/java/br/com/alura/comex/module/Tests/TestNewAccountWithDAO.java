package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithClient.ServiceAccount;

import java.util.Scanner;
import java.util.Set;

public class TestNewAccountWithDAO {
    static ServiceAccount saTest = new ServiceAccount();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Qual função gostaria de realizar:
                1 - Criar cliente
                2 - Listar cliente(s)
                3 - Sacar
                4 - Depositar
                5 - Transferencia entre clientes
                6 - Deletar cliente
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                createClient();
                break;
            case 2:
                listClients();
                break;
            case 3:
                makeWithdrawal();
                break;
            case 4:
                makeDeposit();
                break;
            case 5:
                transferMoney();
                break;
            case 6:
                deleteCliente();
                break;
        }
    }

        private static void createClient () {
            System.out.println("Digite nome do cliente:");
            String clientName = scanner.next();
            System.out.println("Digite o cpf do cliente:");
            String clientCpf = scanner.next();
            System.out.println("Digite o email do cliente:");
            String clientEmail = scanner.next();

            saTest.openAccount(new Client(clientName, clientCpf, clientEmail));
            System.out.println("Conta aberta com sucesso!");
        }

        private static void listClients () {
            System.out.println("Contas cadastradas:");
            var clientList = saTest.showAccount();
            clientList.stream().forEach(System.out::println);
        }

        private static void makeWithdrawal () {
            System.out.println("Digite o número da conta:");
            var idAccount = scanner.nextInt();

            System.out.println("Digite o valor do saque:");
            var value = scanner.nextBigDecimal();

            saTest.makeWithdrawal(idAccount, value);
        }

        private static void makeDeposit () {
            System.out.println("Digite o número da conta:");
            var idAccount = scanner.nextInt();

            System.out.println("Digite o valor do saque:");
            var value = scanner.nextBigDecimal();

            saTest.makeDeposit(idAccount, value);
        }

        private static void transferMoney () {
            System.out.println("Digite o número da conta:");
            var idAccount = scanner.nextInt();

            System.out.println("Digite o número da outra conta:");
            var idAccount2 = scanner.nextInt();

            System.out.println("Digite o valor do saque:");
            var value = scanner.nextBigDecimal();
            saTest.transferMoney(idAccount, idAccount2, value);
        }

        private static void deleteCliente () {
            System.out.println("Digite o número da conta que quer excluir:");
            var idAccountDelete = scanner.nextInt();

            saTest.deleteAccount(idAccountDelete);
        }
}
