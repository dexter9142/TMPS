package tmps.domain.decorator;

public class RedOrnamentDecorator extends OrnamentDecorator {

    public RedOrnamentDecorator(Ornament decorationOrnament){
        super(decorationOrnament);
    }
    private Object CoffeePartVisitor;
    @Override
    public void decorate(){
        decorationElement.decorate((tmps.domain.Visitor.CoffeePartVisitor) CoffeePartVisitor);
        setRedTop(decorationElement);
    }

    private void setRedTop(Ornament decoratedOrnament){
        System.out.println("Top color: Red");
    }

    @Override
    public void decorate(tmps.domain.Visitor.CoffeePartVisitor coffeePartVisitor) {

    }
}
