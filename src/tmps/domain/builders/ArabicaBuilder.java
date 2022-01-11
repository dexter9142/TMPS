package tmps.domain.builders;

import tmps.domain.bridge.Arabica;

public class ArabicaBuilder implements CoffeeBuilder{
    private Arabica arabica;

    public ArabicaBuilder(){
        this.create();
    }

    public Arabica getCoffee(){
        Arabica coffee = this.arabica;
        this.create();
        return coffee;
    }

    @Override
    public void create() {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setCoffeeQuantity(int quantity) {

    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public void setPrice(double price) {

    }
}
