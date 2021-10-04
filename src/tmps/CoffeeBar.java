package tmps;

import java.io.IOException;
import java.util.Scanner;

public class CoffeeBar {


    public static void main(String[] args) {
    while(true) {

        System.out.println("Choose your desired type of drink: ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
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
            case 0:
                System.out.println("I hate LAVAZZA");
                return;
            default:
                System.out.println("\nEnter a valid input!\n");
            }
        }
    }
}
