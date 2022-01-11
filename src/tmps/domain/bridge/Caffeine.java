package tmps.domain.bridge;

import tmps.models.drinks.Coffee;

public abstract class Caffeine {
protected Coffee coffee;


protected Caffeine(Coffee coffee){
    this.coffee = coffee;
}

    public abstract void pour();
}
