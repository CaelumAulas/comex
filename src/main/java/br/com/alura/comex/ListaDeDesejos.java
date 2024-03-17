package br.com.alura.comex;

import java.util.ArrayList;
import java.util.List;

//Card 8

public class ListaDeDesejos {
    List<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }

    public String imprimeProdutos(){
        return produtos.toString();
    }

}
