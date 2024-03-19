package br.com.alura.comex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Connection connection;

    public CategoriaDAO(Connection connection) {
        this.connection = connection;
    }


    public void salvar(Categoria categoria) {
        String sql = "INSERT INTO Categoria (NOME, DESCRICAO) VALUES (?,?)";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.setString(2, categoria.getDescricao());

            preparedStatement.execute();

            System.out.println("Categoria cadastrado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM CATEGORIA");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                Categoria categoria = new Categoria();

                categoria.setNome(resultSet.getString("NOME"));
                categoria.setDescricao(resultSet.getString("DESCRICAO"));

                categorias.add(categoria);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categorias;
    }

    public void atualizar(Categoria categoria) {
        String sql = "UPDATE Categoria SET NOME = ? , DESCRICAO = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.setString(2, categoria.getDescricao());
            preparedStatement.setInt(3, categoria.getId());

            preparedStatement.execute();

            System.out.println("Categoria atualizado com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(Categoria categoria) {
        String sql = "DELETE FROM Categoria WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setInt(1, categoria.getId());

            preparedStatement.execute();

            System.out.println("Categoria removido com sucesso!!!");

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
