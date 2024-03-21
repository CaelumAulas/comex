import br.com.alura.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseDeTeste {
    public static void main(String[] args) throws SQLException {

        System.out.println("Status: Conectado!");

        Connection connection = ConnectionFactory.getConnection();

        connection.close();

    }

}
