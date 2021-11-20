package tmps.bridge;

import tmps.drinks.Coffee;

public class bigCoffee implements Coffee {
    @Override
    public void setName(String name) {

    }

    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {

    }

    @Override
    public void setSize(int page) {
        System.out.println("Sold One Big Arabica of size " + page);
    }
    @Override
    public void setPrice(double price) {

    }

}