package br.com.alura.comex.Categoria;

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

    public void registroCategoria(CategoriaProduto categoria) {
        String sql = "INSERT INTO categoria (produtos, descricao) VALUES (?, ?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, categoria.getNome());
            ps.setString(2, categoria.getDescricao());

            ps.execute();
            System.out.println("Categoria criada com sucesso!");
            ps.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<CategoriaProduto> listaCategoria() {
        List<CategoriaProduto> categorias = new ArrayList<>();

        try {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM CATEGORIA");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                CategoriaProduto categoria = new CategoriaProduto();

                String nome = resultSet.getString("PRODUTOS");
                String descricao = resultSet.getString("DESCRICAO");
                categoria.setNome(nome);
                categoria.setDescricao(descricao);


                categorias.add(categoria);
            }
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categorias;
    }

    public List<CategoriaProduto> listaCategoriaOrdenada() {
        List<CategoriaProduto> categorias = new ArrayList<>();

        try {
            PreparedStatement ps = this.connection.prepareStatement("SELECT produtos FROM categoria ORDER BY produtos ASC");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                CategoriaProduto categoria = new CategoriaProduto();

                String nome = resultSet.getString("PRODUTOS");
                categoria.setNome(nome);


                categorias.add(categoria);
            }
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categorias;

    }

    public void atualizarCategoria(CategoriaProduto categoria) {
        String sql = "UPDATE categoria SET descricao = ? WHERE produtos = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, categoria.getDescricao());
            ps.setString(2, categoria.getNome());

            ps.execute();
            System.out.println("Categoria atualizada com sucesso!");
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void removeCategoria(CategoriaProduto categoria) {
        String sql = "DELETE FROM categoria WHERE produtos = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            ps.setString(1, categoria.getNome());

            ps.execute();
            System.out.println("Categoria removida com sucesso!");
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
