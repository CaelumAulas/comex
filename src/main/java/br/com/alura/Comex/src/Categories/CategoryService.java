package org.example.OutraParte.src.Categories;

import org.example.OutraParte.src.DataBase.FactoryConnection;

import java.sql.PreparedStatement;
import java.util.List;

public class CategoryService {
    private FactoryConnection connection;
    private Category category;
     public CategoryService(Category category){
         this.category = category;
         this.connection = new FactoryConnection();
     }

      public void register(){
         CategoryDAO dao = new CategoryDAO(connection.recoveringConnection());
         dao.registerCategory(category);

      }
    public List<Category> consult(){
        CategoryDAO dao = new CategoryDAO(connection.recoveringConnection());
        return dao.consult();
    }
    public List<Category> consultOrde(){
        CategoryDAO dao = new CategoryDAO(connection.recoveringConnection());
        return dao.consultOrderName();
    }
    public void delete(int id){
         CategoryDAO dao = new CategoryDAO(connection.recoveringConnection());
         dao.deletingCategory(id);
    }
}
