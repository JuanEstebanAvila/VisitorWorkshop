package model;

import java.util.ArrayList;
import java.util.List;

import visitor.VisitorI;

public class Order {

    class OrderItem {
        ProductI product;
        int quantity;

        public OrderItem(ProductI product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    private List<OrderItem> items = new ArrayList<>();

    public void addItem(ProductI product, Integer quantity){
        if(quantity == null){
            throw new IllegalArgumentException("Quantity cannot be null.");
        }
        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        items.add(new OrderItem(product, quantity));
    }

    public void accept(VisitorI visitor){
        for(OrderItem item : items){
            for(int i = 0; i < item.quantity; i++){
                item.product.accept(visitor);
            }
        }
    }
}
