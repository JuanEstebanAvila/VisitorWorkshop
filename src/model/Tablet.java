package model;

import visitor.VisitorI;

public class Tablet implements ProductI {

    private final String name;
    private final double price;
    private final double weight; 

    public Tablet() {
        this("Tablet", 200.0, 250.0);
    }

    public Tablet(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }

    @Override
    public void accept(VisitorI visitor) {
        visitor.visit(this); 
    }
}
