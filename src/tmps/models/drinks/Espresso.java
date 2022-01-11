package tmps.models.drinks;

public class Espresso implements Coffee
{
    private String name;
    private int coffeeQuantity;
    private int size;
    private double price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCoffeeQuantity(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


    public String toString(){
        return "\nOne " + size +" ml " + name + " with " + coffeeQuantity +"mg of caffeine " +"\nPrice: " + price;
    }
}
