package tmps.builders;

import tmps.drinks.Cappuccino;


public class CappuccinoBuilder implements CoffeeBuilder{

    private Cappuccino cappuccino;

    public CappuccinoBuilder(){
        this.create();
    }

    public void create(){
        this.cappuccino = new Cappuccino();
    }

    @Override
    public void setName(String name){
        this.cappuccino.setName(name);
    }

    public void setCoffeeQuantity(int quantity){
        this.cappuccino.setCoffeeQuantity(quantity);
    }

    public void setSize(int size){
        this.cappuccino.setSize(size);
    }

    public void setPrice(double price){
        this.cappuccino.setPrice(price);
    }

    public Cappuccino getCoffee(){
        Cappuccino coffee = this.cappuccino;
        this.create();
        return coffee;
    }



}
