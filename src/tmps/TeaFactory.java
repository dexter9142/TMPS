package tmps;

import tmps.drinks.Coffee;
import tmps.drinks.Tea;
import tmps.builders.*;


import java.util.Scanner;

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
