package tmps.drinks;

public class Green implements Tea {

    private String name;
    private int sugar;
    private double price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


    public String toString(){
        return "\nOne " + name + " tea with " + sugar + " spoons of Sugar" +"\nPrice: " + price;
    }

}
