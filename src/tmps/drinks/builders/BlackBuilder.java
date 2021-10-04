package tmps.drinks.builders;

import tmps.drinks.Black;


public class BlackBuilder implements TeaBuilder{

    private Black black;

    public BlackBuilder(){
        this.create();
    }

    public void create(){
        this.black = new Black();
    }

    @Override
    public void setName(String name){
        this.black.setName(name);
    }


    public void setSugar(int sugar){
        this.black.setSugar(sugar);
    }

    public void setPrice(double price){
        this.black.setPrice(price);
    }

    public Black getTea(){
        Black tea = this.black;
        this.create();
        return tea;
    }



}
