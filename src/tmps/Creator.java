package tmps;

import tmps.drinks.Black;
import tmps.drinks.builders.*;

public class Creator {

    public void sellEspresso(EspressoBuilder builder) {
        builder.create();
        builder.setName("Espresso");
        builder.setCoffeeQuantity(212);
        builder.setSize(30);
        builder.setPrice(16);
    }

    public void sellCappuccino(CappuccinoBuilder builder){
        builder.create();
        builder.setName("Cappuccino");
        builder.setCoffeeQuantity(173);
        builder.setSize(150);
        builder.setPrice(20);
    }

    public void sellLatte(LatteBuilder builder){
        builder.create();
        builder.setName("Latte");
        builder.setCoffeeQuantity(173);
        builder.setSize(362);
        builder.setPrice(25);
    }

    public void sellGreen(GreenBuilder builder){
        builder.create();
        builder.setName("Green");
        builder.setPrice(15);
        builder.setSugar(2);
    }
    public void sellBlack(BlackBuilder builder){
        builder.create();
        builder.setName("Black");
        builder.setPrice(20);
        builder.setSugar(3);
    }

    public void sellFruit(FruitBuilder builder){
        builder.create();
        builder.setName("Fruit");
        builder.setPrice(23);
        builder.setSugar(1);
    }




    //latte 25
    //cappuccino 20
    //americano 17
}
