package PatternsCreational.Challange.Singleton;

import PatternsCreational.Challange.Singleton.service.ProdutoService;

import java.util.ArrayList;

public class DemoT {

    public static void Dandos(){
        ProdutoService produtoService = ProdutoService.getInstance(new ArrayList<>());
        System.out.printf("Produtos: %s\n", produtoService.getClass().hashCode());
    }
}
