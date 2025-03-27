package PatternsCreational.Challange.Builder.director;

import PatternsCreational.Challange.Builder.tipos.BordaRecheada;
import PatternsCreational.Challange.Builder.tipos.Massa;
import PatternsCreational.Challange.Builder.tipos.Molho;
import PatternsCreational.Challange.Builder.tipos.Recheios;
import PatternsCreational.Challange.Builder.pizza.Pizza;

public class PizzaDirector {

    private PizzaDirector(){}

    public static Pizza pizzaFrango(){
        return new Pizza.Builder()
                .withMassa(Massa.TRADICIONAL)
                .withBordaRecheada(BordaRecheada.CATUPIRY)
                .withMolho(Molho.BRANCO)
                .withRecheios(Recheios.FRANGO)
                .withPossuiBordaRecheada()
                .build();
    }

    public static Pizza pizzaSemBordaRecheda(){
        return new Pizza.Builder()
                .withMassa(Massa.TRADICIONAL)
                .withBordaRecheada(BordaRecheada.CATUPIRY)
                .withMolho(Molho.BRANCO)
                .withRecheios(Recheios.FRANGO)
                .withPossuiBordaRecheada()
                .build();
    }

    public static Pizza throwNewExceptionPizza(){
        return new Pizza.Builder()
                .withMassa(Massa.TRADICIONAL)
                .withMolho(Molho.BRANCO)
                .withRecheios(Recheios.FRANGO)
                .build();
    }
}
