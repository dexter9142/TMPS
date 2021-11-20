package tmps.decorator;

import java.util.Scanner;

public class DecorationChoice {
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
                ornament.decorate();
                System.out.println("One Gray Umbrella");
                break;
            case 2:
                redUmbrella.decorate();
                System.out.println("One red umbrella");
                break;
            case 3:
                redPalm.decorate();
                System.out.printf("One red Palm");
                break;
            default:
                System.out.println("Wrong input.");
        }
    }
}
