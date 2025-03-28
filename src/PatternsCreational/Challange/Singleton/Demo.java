package PatternsCreational.Challange.Singleton;

import PatternsCreational.Challange.Singleton.model.Produto;
import PatternsCreational.Challange.Singleton.service.ProdutoService;

import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        Produto p = new Produto(1L,"Produto 1", 10.0);
        Produto p2 = new Produto(2L,"Produto 2", 35.0);
        Produto p3 = new Produto(3L,"Produto 3", 45.0);

        ProdutoService produtoService = ProdutoService.getInstance(new LinkedList<>());

        produtoService.adicionarProduto(p);
        produtoService.adicionarProduto(p2);
        produtoService.adicionarProduto(p3);


        System.out.printf("Produtos: %s\n", produtoService.getClass().hashCode());

        DemoT.Dandos();

        produtoService.listarProdutos().forEach(System.out::println);
    }
}
