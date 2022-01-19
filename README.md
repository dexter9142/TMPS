# TMPS

## Quick note:
Patterns used:
Factory method, 
Builder,
Singleton,
Abstract Factory.


## Quick note 2:
Tea and Coffee types are inherited from one single type, as they share the same properties, just different values which are set in the builder. 
```
public class Fruit extends Green implements Tea {

}
```



## Implementation:
In this laboratory work I have created a Coffee Bar, which sells Coffee and Tea. Straight to the point:
The Abstract Factory:
```
public interface AbstractFactory {

    Coffee sellCoffee();
    Tea sellTea();

}
```
Basically, this Factory works this way: The Tea and Coffee factory both require a method to run. sellTea and sellCoffee. Thus, this interface forces the classes that implement it to have these methods in. Which created a problem. In TeaFactory there is a redundant sellCoffee, which is simply being skipped, and vice-versa for the CoffeeFactory, I found no better soltuion for this problem.

Also, the singleton pattern is applied here.

```
public class CoffeeFactory implements AbstractFactory{

    public Tea sellTea(){
        return null; //it has to be here as Abstract Factory argues.
    }

    private static CoffeeFactory coffeeFactory;
    private final Creator creator = new Creator();

    public static CoffeeFactory getCoffeeFactory(){             //singleton implementation
        if(coffeeFactory == null){
            coffeeFactory = new CoffeeFactory();
        }
        return coffeeFactory;
    }

    private CoffeeFactory(){}


        public Coffee sellCoffee(){

        Scanner input = new Scanner(System.in);
            System.out.println("1. Espresso\n" +
                    "2. Cappuccino\n" +
                    "3. Latte\n");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                EspressoBuilder espressoBuilder = new EspressoBuilder();
                creator.sellEspresso(espressoBuilder);
                return espressoBuilder.getCoffee();
            case 2:
                CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
                creator.sellCappuccino(cappuccinoBuilder);
                return cappuccinoBuilder.getCoffee();
            case 3:
                LatteBuilder latteBuilder = new LatteBuilder();
                creator.sellLatte(latteBuilder);
                return latteBuilder.getCoffee();
        }

        return null;

    }

}

```

Tea Factory:
```
public class TeaFactory implements AbstractFactory {

    private static TeaFactory teaFactory;
    private final Creator creator = new Creator();

    public static TeaFactory getTeaFactory(){             //singleton implementation
        if(teaFactory == null){
            teaFactory = new TeaFactory();
        }
        return teaFactory;
    }

    private TeaFactory(){}
        public Coffee sellCoffee(){
        return null; //it has to be here, idk. Abstract factory arues
        }

        public Tea sellTea(){

        Scanner input = new Scanner(System.in);
            System.out.println("1. Green\n" +
                    "2. Black\n" +
                    "3. Fruit\n");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                GreenBuilder greenBuilder = new GreenBuilder();
                creator.sellGreen(greenBuilder);
                return greenBuilder.getTea();
            case 2:
                BlackBuilder blackBuilder = new BlackBuilder();
                creator.sellBlack(blackBuilder);
                return blackBuilder.getTea();
            case 3:
                FruitBuilder fruitBuilder = new FruitBuilder();
                creator.sellFruit(fruitBuilder);
                return fruitBuilder.getTea();
        }

        return null;

    }

}

````
* Builder
```
public interface CoffeeBuilder {
    void create();
    void setName(String name);
    void setCoffeeQuantity(int quantity);
    void setSize(int size);
    void setPrice(double price);
}
```
Same goes for the tea builder.

## Part 2
Patterns implemented:
* Decorator
````
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
````
* Bridge
``
public class Arabica extends Caffeine{
    private int size, coffeeQuantity, price;
    private String name;

    public Arabica(String name, int coffeeQuantity, int size, int price, Coffee coffee){
        super(coffee);
        this.name = name;
        this.size = size;
        this.coffeeQuantity = coffeeQuantity;
        this.price = price;
    }


    public void pour(){
        coffee.setName("Arabica");
        coffee.setSize(size);
    }
``

* Proxy, in two stages
``
public ProxyCoffee(String name){
    this.name = name;
}

    @Override
    public void setName(String name) {

    if(realCoffee == null){
        realCoffee = new RealCoffee(name);
    }
    realCoffee.setName("Proxy Digital Coffee");
    }

    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {

    }

    @Override
    public void setSize(int page) {

    }

    @Override
    public void setPrice(double price) {

    }
}
``
## And

``
public RealCoffee(String name){
        this.name = name;
        pour(name);
    }

    private void pour(String name){
        System.out.println("Pouring: " + name);
    }

    @Override
    public void setName(String name) {
        System.out.println("Sold: " + name);
    }

    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {
    }

    @Override
    public void setSize(int page) {

    }
``
