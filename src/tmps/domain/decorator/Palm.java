package tmps.domain.decorator;

import tmps.domain.Visitor.CoffeePartVisitor;

public class Palm implements Ornament{

    public void decorate(){
        System.out.println("Ornament: Palm");
    }

    @Override
    public void decorate(CoffeePartVisitor coffeePartVisitor) {

    }
}
