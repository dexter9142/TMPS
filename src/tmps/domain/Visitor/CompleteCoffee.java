package tmps.domain.Visitor;

import tmps.domain.decorator.Ornament;

public class CompleteCoffee implements Ornament {

    Ornament[] parts;

    public CompleteCoffee(){
        parts = new Ornament[] {new Cup(), new Cap(), new Liquid()};
    }

    @Override
    public void decorate(CoffeePartVisitor coffeePartVisitor){
        for(int i =0; i<parts.length; i++){
            parts[i].decorate(coffeePartVisitor);
        }
        coffeePartVisitor.visit(this);
    }

}
