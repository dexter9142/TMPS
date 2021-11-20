package tmps.decorator;

public abstract class OrnamentDecorator implements Ornament{

    protected Ornament decorationElement;

    public OrnamentDecorator(Ornament decorationElement){
        this.decorationElement = decorationElement;
    }

    public void decorate(){
        decorationElement.decorate();
    }

}
