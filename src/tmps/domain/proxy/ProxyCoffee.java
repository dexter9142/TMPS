package tmps.domain.proxy;

import tmps.models.drinks.Coffee;

public class ProxyCoffee implements Coffee {

private RealCoffee realCoffee;
private String name;

public ProxyCoffee(String name){
    this.name = name;
}

    @Override
    public void setName(String name) {

    if(realCoffee == null){
        realCoffee = new RealCoffee(name);
    }
    realCoffee.setName("Proxy Digital Coffee");
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
