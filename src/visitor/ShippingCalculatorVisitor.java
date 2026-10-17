package visitor;

import model.ComputerT;
import model.Laptop;
import model.TV;
import model.Tablet;

public class ShippingCalculatorVisitor implements VisitorI {

    private double shippingCost = 0.0;

    static double calculateShippingCost(double price, double weight) {
        double shippingPercentage = (weight/100)*2;
        double shippingCost = price * shippingPercentage/100;
        return shippingCost;
    }

    @Override
    public void visit(Tablet tablet) {
        shippingCost += calculateShippingCost(tablet.getPrice(), tablet.getWeight());
    }

    @Override 
    public void visit(Laptop laptop) {
        shippingCost += calculateShippingCost(laptop.getPrice(), laptop.getWeight());
    }

    @Override
    public void visit(TV tv) {
        shippingCost += calculateShippingCost(tv.getPrice(), tv.getWeight());
    }

    @Override 
    public void visit(ComputerT computer) {
        shippingCost += calculateShippingCost(computer.getPrice(), computer.getWeight());
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
