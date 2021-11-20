package tmps;

import tmps.bridge.Arabica;
import tmps.bridge.Caffeine;
import tmps.bridge.bigCoffee;
import tmps.bridge.smallCoffee;
import tmps.decorator.DecorationChoice;
import tmps.proxy.ProxyPattern;

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
            case 0:
                System.out.println("I hate LAVAZZA");
                return;
            default:
                System.out.println("\nEnter a valid input!\n");
            }
        }
    }
}
