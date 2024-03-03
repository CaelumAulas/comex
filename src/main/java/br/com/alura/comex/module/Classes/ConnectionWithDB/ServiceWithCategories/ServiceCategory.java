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

    public Set<Category> showAccount(){
        Connection conn = connection.reconnection();
        return new DAOCategory(conn).show();
    }

    private void alterCategory(Category categoryId){
        Connection conn = connection.reconnection();
        new DAOCategory(conn).alter(categoryId.getId(),categoryId.getDescription());
    }

    private Category findWithId(int number) {
        Connection conn = connection.reconnection();
        Category category = new DAOCategory(conn).categoryListener(number);
        if(category != null) {
            return category;
        } else {
            throw new RuntimeException("Não existe conta cadastrada com esse número!");
        }
    }

    public void deleteCategory(int idCategory){
        var account = findWithId(idCategory);
        Connection conn = connection.reconnection();
        new DAOCategory(conn).delete(idCategory);
    }
}