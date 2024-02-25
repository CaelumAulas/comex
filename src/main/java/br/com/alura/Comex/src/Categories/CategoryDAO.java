package org.example.OutraParte.src.Categories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    private Connection connection;

    public CategoryDAO(Connection connection){
        this.connection = connection;
    }
    public void registerCategory(Category category){
        String sql = "insert into categoria(id,nome) value(?,?)";

        try {
            connection.setAutoCommit(false);
          PreparedStatement statement =  connection.prepareStatement(sql);
          statement.setInt(1,category.getId());
          statement.setString(2, category.getNameCategory());
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

    public List<Category> consult(){
        List<Category> categories = new ArrayList<>();
        try {
            String sql = "select * from Categoria";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet set =  statement.executeQuery();
            while (set.next()){
                Integer id = set.getInt(1);
                String name = set.getString(2);
                Category category = new Category(id,name);
                categories.add(category);
            }
            set.close();
            statement.close();
            connection.close();

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }


        return categories;
    }
    public List<Category> consultOrderName(){
        List<Category> categories = new ArrayList<>();
        try {
            String sql = "select * from categoria order by nome asc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet set =  statement.executeQuery();
            while (set.next()){
                Integer id = set.getInt(1);
                String name = set.getString(2);
                Category category = new Category(id,name);
                categories.add(category);
            }
            set.close();
            statement.close();
            connection.close();

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }


        return categories;
    }
    public void updateCategory(String name,int id){
        try {
            String sql = "update categoria set nome = ? where id = ?";
            connection.setAutoCommit(false);
           PreparedStatement statement =  connection.prepareStatement(sql);
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
    public void deletingCategory(int id){
        try {
            String sql = "delete from categoria where id =?";
            connection.setAutoCommit(false);
           PreparedStatement statement =  connection.prepareStatement(sql);
           statement.setInt(1,id);
           statement.execute();
           connection.commit();
           statement.close();
           connection.close();
        }catch (SQLException ex){
            try {
                connection.rollback();
            }catch (SQLException e){
                throw  new RuntimeException(e);
            }

            throw  new RuntimeException(ex);
        }


    }

}
