package org.example.OutraParte.src.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection){this.connection = connection;}

    public void registerProduct(Product product){
        String sql = "insert into produto(nome,preco) value(?,?)";

        try {
            connection.setAutoCommit(false);
            PreparedStatement statement =  connection.prepareStatement(sql);
            statement.setString(1,product.getName());
            statement.setDouble(2,product.getUnitPrice());
            statement.execute();
            connection.commit();
            statement.close();
            connection.close();


        }catch (SQLException ex){
            try {
                connection.rollback();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            throw  new RuntimeException(ex);

        }

    }
    public List<Product> listProducts(){

        List<Product> products = new ArrayList<>();
        try {
            String sql = "select * from produto";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet set= statement.executeQuery();
            while (set.next()){

                String name = set.getString(2);
                double coin =   set.getDouble(3);
                Product product = new Product(name,coin);
                products.add(product);


            }


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }



        return products;
    }
    public List<Product> listProductsOrder(){

        List<Product> products = new ArrayList<>();
        try {
            String sql = "select * from produto order by nome asc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet set= statement.executeQuery();
            while (set.next()){

                String name = set.getString(2);
                double coin =   set.getDouble(3);
                Product product = new Product(name,coin);
                products.add(product);


            }


        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }



        return products;
    }
    public void updateProduct(String name, int id){

        try {
            String sql = "update produto set nome = ? where id = ?";
            connection.setAutoCommit(false);
            PreparedStatement statement =connection.prepareStatement(sql);
            statement.setString(1,name);
            statement.setInt(2,id);
            statement.execute();
            connection.commit();
            statement.close();
            connection.close();


        }catch (SQLException ex){
            try {
                connection.rollback();

            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            throw new RuntimeException(ex);


        }
    }

    public void deleteProduct(int id){
        try {
            String sql= "delete from produto where id =?";
            connection.setAutoCommit(false);
            PreparedStatement statement =connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.execute();
            connection.commit();
            statement.close();
            connection.close();

        }catch (SQLException ex){
            try {
                connection.rollback();

            }catch (SQLException e){
                throw new RuntimeException(e);

            }

            throw new RuntimeException(ex);
        }


    }
}
