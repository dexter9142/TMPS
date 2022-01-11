package tmps.domain.Visitor;
import tmps.domain.decorator.Ornament;

public class Cup implements Ornament {
    @Override
    public void decorate(CoffeePartVisitor coffeePartVisitor){
        coffeePartVisitor.visit(this);
    }
}

