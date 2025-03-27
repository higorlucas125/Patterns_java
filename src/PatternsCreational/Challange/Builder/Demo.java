package PatternsCreational.Challange.Builder;

import PatternsCreational.Challange.Builder.director.PizzaDirector;
import PatternsCreational.Challange.Builder.pizza.Pizza;
import PatternsCreational.Challange.Builder.tipos.BordaRecheada;
import PatternsCreational.Challange.Builder.tipos.Massa;
import PatternsCreational.Challange.Builder.tipos.Molho;
import PatternsCreational.Challange.Builder.tipos.Recheios;

public class Demo {

    public static void main(String[] args) {
        Pizza pizza = PizzaDirector.pizzaFrango();
        Pizza pizza2 = PizzaDirector.pizzaSemBordaRecheda();
        Pizza error =  PizzaDirector.throwNewExceptionPizza();
        Pizza b = new Pizza.Builder()
                .withMassa(Massa.TRADICIONAL)
                .withBordaRecheada(BordaRecheada.CHEDDAR)
                .withMolho(Molho.VERMELHO)
                .withRecheios(Recheios.FRANGO)
                .withPossuiBordaRecheada()
                .build();
        System.out.println("Pizza build: " + pizza2);
        System.out.println("Pizza build: " + pizza);
        System.out.println("Pizza build: " + error);
        System.out.println("Pizza build: " + b);
    }
}
