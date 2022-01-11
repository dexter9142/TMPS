package tmps.domain.proxy;

import tmps.models.drinks.Coffee;

public class ProxyPattern {

    public void ProxyPattern(){

        Coffee coffee = new ProxyCoffee("Digital");
        coffee.setName("Digital");
        System.out.println("");
        coffee.setName("ProxyDigital");
    }
}
