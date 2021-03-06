package tmps.domain.factory;

import tmps.domain.builders.Creator;
import tmps.domain.builders.ArabicaBuilder;
import tmps.domain.builders.CappuccinoBuilder;
import tmps.domain.builders.EspressoBuilder;
import tmps.domain.builders.LatteBuilder;
import tmps.models.drinks.Coffee;
import tmps.models.drinks.Tea;

import java.util.Scanner;

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


        public Coffee sellArabica(){
            ArabicaBuilder arabicaBuilder = new ArabicaBuilder();
            creator.sellArabica(arabicaBuilder);
            return (Coffee) arabicaBuilder.getCoffee();

        }

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
