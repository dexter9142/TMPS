package tmps.domain.Visitor;

public class CoffeePartDisplayVisitor implements CoffeePartVisitor{

    @Override
    public void visit(Cup cup) {
        System.out.println("Cup has been added.");
    }

    @Override
    public void visit(Cap cap) {
        System.out.println("Cap has been added");
    }

    @Override
    public void visit(Liquid liquid) {
        System.out.println("Coffee has been poured");
    }

    @Override
    public void visit(CompleteCoffee completeCoffee) {
        System.out.println("Coffee Ready");
    }
}
