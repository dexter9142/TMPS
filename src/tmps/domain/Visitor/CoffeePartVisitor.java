package tmps.domain.Visitor;

public interface CoffeePartVisitor{
        public void visit(Cup cup);
        public void visit(Cap cap);
        public void visit(Liquid liquid);

        public void visit(CompleteCoffee completeCoffee);
}