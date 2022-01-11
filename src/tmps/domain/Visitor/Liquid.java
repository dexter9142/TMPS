package tmps.domain.Visitor;
import tmps.domain.decorator.Ornament;

public class Liquid implements Ornament {
    @Override
    public void decorate(CoffeePartVisitor coffeePartVisitor){
        coffeePartVisitor.visit(this);
    }
}

