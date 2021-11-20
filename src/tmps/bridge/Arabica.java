package tmps.bridge;

import tmps.drinks.Coffee;

public class Arabica extends Caffeine{
    private int size, coffeeQuantity, price;
    private String name;

    public Arabica(String name, int coffeeQuantity, int size, int price, Coffee coffee){
        super(coffee);
        this.name = name;
        this.size = size;
        this.coffeeQuantity = coffeeQuantity;
        this.price = price;
    }


    public void pour(){
        coffee.setName("Arabica");
        coffee.setSize(size);
    }
}
