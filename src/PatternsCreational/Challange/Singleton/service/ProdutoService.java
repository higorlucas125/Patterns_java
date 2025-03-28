package PatternsCreational.Challange.Singleton.service;

import PatternsCreational.Challange.Singleton.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private static ProdutoService instance;

    private List<Produto> produtos;

    private ProdutoService() {}

    private ProdutoService(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }


    public static ProdutoService getInstance( List<Produto> produtos ) {
        if (instance == null) {
            System.out.println("APRESENTA UMA UNICA VEZ POR RUN");
            instance = new ProdutoService(produtos);
        }
        System.out.println("TTT -> " + instance.produtos.getClass().getSimpleName());

        return instance;
    }
}
