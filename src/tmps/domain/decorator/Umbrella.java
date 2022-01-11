package tmps.domain.decorator;

import tmps.domain.Visitor.CoffeePartVisitor;

public class Umbrella implements Ornament{

    public void decorate(){
        System.out.println("Ornament: Umbrella");
    }

    @Override
    public void decorate(CoffeePartVisitor coffeePartVisitor) {

    }
}
