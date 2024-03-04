package br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithClient;

import br.com.alura.comex.module.Classes.Client;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ConnectionFactory;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithClient.DAOAccount;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Set;

public class ServiceAccount {

        private ConnectionFactory connection;

        public ServiceAccount() {
            this.connection = new ConnectionFactory();
        }
    public void openAccount(Client client) {
        Connection conn = connection.reconnection();
        new DAOAccount(conn).save(client);
    }

    public Set<Client> showAccount(){
        Connection conn = connection.reconnection();
        return new DAOAccount(conn).show();
    }

    private void alterAccount(Client clientId, BigDecimal bigDecimal){
            Connection conn = connection.reconnection();
        new DAOAccount(conn).alter(clientId.getId(), bigDecimal);
    }

    public void makeDeposit(int idAccount, BigDecimal value) {
        Client account = findWithId(idAccount);

        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor do deposito deve ser superior a zero!");
        }

        BigDecimal newValue = account.getMoney().add(value);
        alterAccount(account, newValue);
    }

    public void makeWithdrawal(int idAccount, BigDecimal value) {
        var account = findWithId(idAccount);
        BigDecimal moneyAccount = account.getMoney();

        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor do saque deve ser superior a zero!");
        }
        double result = value.compareTo(moneyAccount);
        if (result > 0){
            throw new RuntimeException("O valor de saque não pode ser maior do que o valor na conta!");
        }

        BigDecimal newValue = account.getMoney().subtract(value);
        alterAccount(account, newValue);
        System.out.println("Saque realizado com sucesso!");
    }

    public void transferMoney(int numberAccountPay, int numberAccountReceive,
                                      BigDecimal value) {
        makeWithdrawal(numberAccountPay, value);
        makeDeposit(numberAccountReceive, value);
    }

    private Client findWithId(int number) {
        Connection conn = connection.reconnection();
        Client client = new DAOAccount(conn).clientListener(number);
        if(client != null) {
            return client;
        } else {
            throw new RuntimeException("Não existe conta cadastrada com esse número!");
        }
    }

    public void deleteAccount(int idAccount){
        var account = findWithId(idAccount);
        if (account.moneyInAccount()) {
            throw new RuntimeException("A conta não pode ser encerrada porque ainda possui saldo");
        }

        Connection conn = connection.reconnection();

        new DAOAccount(conn).delete(idAccount);
    }
}
