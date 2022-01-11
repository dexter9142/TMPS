package tmps.domain.decorator;

import tmps.domain.Visitor.CoffeePartVisitor;

public interface Ornament {
    void decorate(CoffeePartVisitor coffeePartVisitor);

}
