package tmps.drinks.builders;

public interface CoffeeBuilder {
    void create();
    void setName(String name);
    void setCoffeeQuantity(int quantity);
    void setSize(int size);
    void setPrice(double price);
}
