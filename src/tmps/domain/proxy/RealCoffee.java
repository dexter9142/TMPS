package tmps.domain.proxy;

import tmps.models.drinks.Coffee;

public class RealCoffee implements Coffee {
    private String name;

    public RealCoffee(String name){
        this.name = name;
        pour(name);
    }

    private void pour(String name){
        System.out.println("Pouring: " + name);
    }

    @Override
    public void setName(String name) {
        System.out.println("Sold: " + name);
    }

    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {
    }

    @Override
    public void setSize(int page) {

    }

    @Override
    public void setPrice(double price) {

    }
}
