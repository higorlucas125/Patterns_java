package PatternsCreational.Challange.Builder.pizza;

import PatternsCreational.Challange.Builder.tipos.BordaRecheada;
import PatternsCreational.Challange.Builder.tipos.Massa;
import PatternsCreational.Challange.Builder.tipos.Molho;
import PatternsCreational.Challange.Builder.tipos.Recheios;

public class Pizza {

    private Massa massa;
    private BordaRecheada bordaRecheada;
    private Molho molho;
    private Recheios recheios;
    private boolean possuiBordaRecheada;

    private Pizza() {}


    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public BordaRecheada getBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(BordaRecheada bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public Molho getMolho() {
        return molho;
    }

    public void setMolho(Molho molho) {
        this.molho = molho;
    }

    public Recheios getRecheios() {
        return recheios;
    }

    public void setRecheios(Recheios recheios) {
        this.recheios = recheios;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada() {
        this.possuiBordaRecheada = true;
    }

    public static class Builder {
        private Pizza pizza;

        public Builder() {
            pizza = new Pizza();
        }

        public Builder withMassa(Massa massa) {
            pizza.setMassa(massa);
            return this;
        }

        public Builder withBordaRecheada(BordaRecheada bordaRecheada) {
            pizza.setBordaRecheada(bordaRecheada);
            return this;
        }

        public Builder withMolho(Molho molho) {
            pizza.setMolho(molho);
            return this;
        }

        public Builder withRecheios(Recheios recheios) {
            pizza.setRecheios(recheios);
            return this;
        }

        public Builder withPossuiBordaRecheada() {
            pizza.setPossuiBordaRecheada();
            return this;
        }

        public Pizza build() {
            validateIsBordaRecheada();
            return pizza;
        }

        private void validateIsBordaRecheada() {
            if( !((pizza.isPossuiBordaRecheada() && pizza.getBordaRecheada() != null) || (!pizza.isPossuiBordaRecheada() && pizza.getBordaRecheada() == null)) ){
                throw new RuntimeException("Pizza build fail - Borda Recheada");
            } else if ( pizza.getBordaRecheada() == null){
                pizza.setBordaRecheada(BordaRecheada.NORMAL);
            }
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa=" + massa +
                ", bordaRecheada=" + bordaRecheada +
                ", molho=" + molho +
                ", recheios=" + recheios +
                '}';
    }
}

