package tmps.builders;

import tmps.drinks.Espresso;

public class EspressoBuilder implements CoffeeBuilder {

    private Espresso espresso;

    public EspressoBuilder(){
        this.create();
    }

    public void create(){
        this.espresso = new Espresso();
    }

    @Override
    public void setName(String name){
        this.espresso.setName(name);
    }

    public void setCoffeeQuantity(int quantity){
        this.espresso.setCoffeeQuantity(quantity);
    }

    public void setSize(int size){
        this.espresso.setSize(size);
    }

    public void setPrice(double price){
        this.espresso.setPrice(price);
    }

    public Espresso getCoffee(){
        Espresso coffee = this.espresso;
        this.create();
        return coffee;
    }

}
