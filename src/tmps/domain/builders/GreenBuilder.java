package tmps.domain.builders;

import tmps.models.drinks.Green;


public class GreenBuilder implements TeaBuilder{

    private Green green;

    public GreenBuilder(){
        this.create();
    }

    public void create(){
        this.green = new Green();
    }

    @Override
    public void setName(String name){
        this.green.setName(name);
    }


    public void setSugar(int sugar){
        this.green.setSugar(sugar);
    }

    public void setPrice(double price){
        this.green.setPrice(price);
    }

    public Green getTea(){
        Green tea = this.green;
        this.create();
        return tea;
    }



}
