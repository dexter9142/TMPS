package tmps.domain.factory;

import tmps.models.drinks.Coffee;
import tmps.models.drinks.Tea;
public interface AbstractFactory {

    Coffee sellCoffee();
    Tea sellTea();

}
