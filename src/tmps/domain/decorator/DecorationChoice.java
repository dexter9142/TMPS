package tmps.domain.decorator;

import java.util.Scanner;

public class DecorationChoice {

    private Object CoffeePartVisitor;

    public void choice() {
        Ornament ornament = new Umbrella();
        Ornament redUmbrella = new RedOrnamentDecorator(new Umbrella());
        Ornament redPalm = new RedOrnamentDecorator(new Palm());
        System.out.println("1. Gray Umbrella");
        System.out.println("2. Red Umbrella");
        System.out.println("3. Palm");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        switch (c) {
            case 1:
                ornament.decorate((tmps.domain.Visitor.CoffeePartVisitor) CoffeePartVisitor);
                System.out.println("One Gray Umbrella");
                break;
            case 2:
                redUmbrella.decorate((tmps.domain.Visitor.CoffeePartVisitor) CoffeePartVisitor);
                System.out.println("One red umbrella");
                break;
            case 3:
                redPalm.decorate((tmps.domain.Visitor.CoffeePartVisitor) CoffeePartVisitor);
                System.out.printf("One red Palm");
                break;
            default:
                System.out.println("Wrong input.");
        }
    }
}
