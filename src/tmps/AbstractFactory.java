package tmps;

import tmps.drinks.Coffee;
import tmps.drinks.Tea;
public interface AbstractFactory {

    Coffee sellCoffee();
    Tea sellTea();

}
