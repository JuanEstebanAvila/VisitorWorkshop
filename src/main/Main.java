package main;
import model.ComputerT;
import model.Laptop;
import model.Order;
import model.TV;
import model.Tablet;
import visitor.ShippingCalculatorVisitor;
import visitor.SubtotalCalculatorVisitor;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Wtech Store");
        Order order = new Order();

        order.addItem(new Tablet(), 2);
        order.addItem(new Laptop(), 1);
        order.addItem(new ComputerT(), 1);
        order.addItem(new TV(), 1);

        System.out.println("Your order is: 1 Laptop, 1 Computer, 1 TV, and 2 Tablets");

        System.out.println("Calculating subtotal costs...");
        SubtotalCalculatorVisitor subtotalVisitor = new SubtotalCalculatorVisitor();
        order.accept(subtotalVisitor);
        double subtotal = subtotalVisitor.getSubtotal();
        System.out.println("Subtotal: $" + subtotal);


        System.out.println("Calculating shipping costs...");
        ShippingCalculatorVisitor shippingVisitor = new ShippingCalculatorVisitor();
        order.accept(shippingVisitor);
        double shippingCost = shippingVisitor.getShippingCost();
        System.out.println("Shipping costs: $" + shippingCost);

        System.out.println("Total costs: $" + (subtotal + shippingCost));

        System.out.println("Thank you for shopping with us!");
    }
}
