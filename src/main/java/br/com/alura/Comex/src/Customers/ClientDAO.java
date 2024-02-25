package org.example.OutraParte.src.Customers;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO{
    private Connection con;
    public  ClientDAO(Connection con){

        this.con = con;
    }
    public void saveClient(Client client){
        String sql = "insert into cliente(id,nome) value(?,?)";
        try{
            con.setAutoCommit(false);
            PreparedStatement  statement = con.prepareStatement(sql);

            statement.setLong(1,Long.valueOf(client.getCPF()));
            statement.setString(2,client.getName());
            statement.execute();
            con.commit();
            statement.close();
            con.close();

        }catch (SQLException ex){
            try {
                con.rollback();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
           throw new RuntimeException(ex);
        }


    }
    public List<Client> listClient(){
        List<Client> clients = new ArrayList<>();
        String sql = "select * from cliente";
        try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
          ResultSet resultSet =  preparedStatement.executeQuery();
          while (resultSet.next()){
              Long cpf = resultSet.getLong(1);
              String name = resultSet.getNString(2);
              Client client = new Client(name,String.valueOf(cpf));
              clients.add(client);
          }
          resultSet.close();
          preparedStatement.close();
          con.close();

        }catch (SQLException ex){
            throw new RuntimeException(ex);

        }

return clients;
    }

    public void update(String name,String cpf){
        String sql = "update cliente set nome = ? where id = ?";
        try {
            con.setAutoCommit(false);
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,name);
            statement.setLong(2,Long.valueOf(cpf));
            statement.execute();
            con.commit();
            statement.close();
            con.close();

        }catch (SQLException ex){
            try {
                con.rollback();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            throw new RuntimeException(ex);

        }

    }
    public void deleteClient(String id){
        String sql = "delete from cliente where id =?";
        try{
            con.setAutoCommit(false);
          PreparedStatement statement = con.prepareStatement(sql);
          statement.setLong(1,Long.valueOf(id));
          statement.execute();
          con.commit();
          statement.close();
          con.close();



        }catch (SQLException ex){
            try {
                con.rollback();
            }catch (SQLException e){

                throw new RuntimeException(e);

            }
            throw new RuntimeException(ex);
        }


    }
}
