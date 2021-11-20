package tmps.decorator;

public class RedOrnamentDecorator extends OrnamentDecorator {

    public RedOrnamentDecorator(Ornament decorationOrnament){
        super(decorationOrnament);
    }

    @Override
    public void decorate(){
        decorationElement.decorate();
        setRedTop(decorationElement);
    }

    private void setRedTop(Ornament decoratedOrnament){
        System.out.println("Top color: Red");
    }

}
