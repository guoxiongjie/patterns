package com.blackguo.patterns.Observer;

public class Demo {

    public static void main(String[] args) {
        Order order = new Order();

        new IncreasePointObserver(order);
        new SendMessageObserver(order);

        System.out.println("First paid change: false");
        order.setPaid(false);
        System.out.println("Second paid change: true");
        order.setPaid(true);
    }

}
