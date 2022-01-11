package tmps.domain.bridge;

import tmps.models.drinks.Coffee;

public class smallCoffee implements Coffee {
    @Override
    public void setName(String name) {

    }
    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {

    }

    @Override
    public void setSize(int page) {
        System.out.println("Sold One Small Arabica of size " + page);
    }

    @Override
    public void setPrice(double price) {

    }

}