package visitor;

import model.ComputerT;
import model.Laptop;
import model.TV;
import model.Tablet;

public class SubtotalCalculatorVisitor implements VisitorI {
    private double subtotal = 0.0;

    @Override 
    public void visit(Tablet tablet){
        subtotal += tablet.getPrice();
    }

    @Override 
    public void visit(Laptop laptop){
        subtotal += laptop.getPrice();
    }

    @Override
    public void visit(TV tv){
        subtotal += tv.getPrice();
    }

    @Override 
    public void visit(ComputerT computer){
        subtotal += computer.getPrice();
    }

    public double getSubtotal() {
        return subtotal;
    }
}
