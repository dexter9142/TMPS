package tmps.domain.decorator;

public abstract class OrnamentDecorator implements Ornament{

    protected Ornament decorationElement;
    private Object CoffeePartVisitor;

    public OrnamentDecorator(Ornament decorationElement){
        this.decorationElement = decorationElement;
    }

    public void decorate(){
        decorationElement.decorate((tmps.domain.Visitor.CoffeePartVisitor) CoffeePartVisitor);
    }

}
