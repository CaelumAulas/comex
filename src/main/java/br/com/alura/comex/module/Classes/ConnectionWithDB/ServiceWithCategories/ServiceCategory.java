package br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithCategories;

import br.com.alura.comex.module.Classes.Category;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ConnectionFactory;

import java.sql.Connection;
import java.util.Set;

public class ServiceCategory {
    private ConnectionFactory connection;

    public ServiceCategory() {
        this.connection = new ConnectionFactory();
    }
    public void openCategory(Category category) {
        Connection conn = connection.reconnection();
        new DAOCategory(conn).save(category);
    }

    public Set<Category> showCategory(){
        Connection conn = connection.reconnection();
        return new DAOCategory(conn).show();
    }

    public void alterDescription(int number, String update){
        Connection conn = connection.reconnection();
        String sql = "UPDATE categoria SET descricao = ? WHERE id = ?";
        new DAOCategory(conn).alter(sql, number,update);
    }

    public void alterName(int number, String update){
        Connection conn = connection.reconnection();
        String sql = "UPDATE categoria SET nome = ? WHERE id = ?";
        new DAOCategory(conn).alter(sql,number,update);
    }

    private Category findWithId(String name) {
        Connection conn = connection.reconnection();
        Category category = new DAOCategory(conn).categoryListener(name);
        if(category != null) {
            return category;
        } else {
            throw new RuntimeException("Não existe conta cadastrada com esse número!");
        }
    }

    public void deleteCategory(String nameCategory){
        var account = findWithId(nameCategory);
        Connection conn = connection.reconnection();
        new DAOCategory(conn).delete(nameCategory);
    }
}