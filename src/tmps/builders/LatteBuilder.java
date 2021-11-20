package tmps.builders;

import tmps.drinks.Latte;


public class LatteBuilder implements CoffeeBuilder{

    private Latte latte;

    public LatteBuilder(){
        this.create();
    }

    public void create(){
        this.latte = new Latte();
    }

    @Override
    public void setName(String name){
        this.latte.setName(name);
    }

    public void setCoffeeQuantity(int quantity){
        this.latte.setCoffeeQuantity(quantity);
    }

    public void setSize(int size){
        this.latte.setSize(size);
    }

    public void setPrice(double price){
        this.latte.setPrice(price);
    }

    public Latte getCoffee(){
        Latte coffee = this.latte;
        this.create();
        return coffee;
    }



}
