package tmps.client;

import tmps.domain.factory.AbstractFactory;
import tmps.domain.factory.CoffeeFactory;
import tmps.domain.factory.TeaFactory;
import tmps.domain.Visitor.CoffeePartDisplayVisitor;
import tmps.domain.Visitor.CompleteCoffee;
import tmps.domain.bridge.Arabica;
import tmps.domain.bridge.Caffeine;
import tmps.domain.bridge.bigCoffee;
import tmps.domain.bridge.smallCoffee;
import tmps.domain.decorator.DecorationChoice;
import tmps.domain.proxy.ProxyPattern;

import java.util.Scanner;

public class CoffeeBar {


    public static void main(String[] args) {
    while(true) {

        System.out.println("Choose your desired type of drink: ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. For special Arabica x2 (Bridge Pattern)");
        System.out.println("4. Choose decoration");
        System.out.println("5. Digital Coffee (Proxy)");
        System.out.println("6. Any Coffee (Visitor)");
        System.out.println("Press 0 to exit.");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice){
            case 1:
                AbstractFactory coffeeFactory = CoffeeFactory.getCoffeeFactory();
                System.out.println(coffeeFactory.sellCoffee());
                break;
            case 2:
                AbstractFactory teaFactory = TeaFactory.getTeaFactory();
                System.out.println(teaFactory.sellTea());
                break;
            case 3:
                Caffeine bigCoffee = new Arabica("Arabica", 34, 5, 45, new bigCoffee());
                bigCoffee.pour();
                Caffeine smallCoffee = new Arabica("Arabica", 12, 3, 18, new smallCoffee());
                smallCoffee.pour();
                break;
            case 4:
               DecorationChoice chooseDeco = new DecorationChoice();
               chooseDeco.choice();
               break;
            case 5:
            ProxyPattern proxyPattern = new ProxyPattern();
            proxyPattern.ProxyPattern();
            break;
            case 6:
                CompleteCoffee coffee = new CompleteCoffee();
                coffee.decorate(new CoffeePartDisplayVisitor());
                break;
            case 0:
                System.out.println("I hate LAVAZZA");
                return;
            default:
                System.out.println("\nEnter a valid input!\n");
            }
        }
    }
}
