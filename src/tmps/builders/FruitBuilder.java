package tmps.builders;

import tmps.drinks.Fruit;


public class FruitBuilder implements TeaBuilder{

    private Fruit fruit;

    public FruitBuilder(){
        this.create();
    }

    public void create(){
        this.fruit = new Fruit();
    }

    @Override
    public void setName(String name){
        this.fruit.setName(name);
    }


    public void setSugar(int sugar){
        this.fruit.setSugar(sugar);
    }

    public void setPrice(double price){
        this.fruit.setPrice(price);
    }

    public Fruit getTea(){
        Fruit tea = this.fruit;
        this.create();
        return tea;
    }



}
