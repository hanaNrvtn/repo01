package model.product;

public class Pen extends Stationary {
    private String color;  //

    public Pen(String category, String name, int price, int numberOfSupply, String manufacturingCountry, String color) {
        super(category, name, price, numberOfSupply, manufacturingCountry);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolor: " + color;
    }
}
