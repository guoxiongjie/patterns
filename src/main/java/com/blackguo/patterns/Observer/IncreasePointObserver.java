package com.blackguo.patterns.Observer;

/**
 * 增加积分观察者
 */
public class IncreasePointObserver extends OrderObserver {

    public IncreasePointObserver(Order order) {
        this.order = order;
        this.order.attach(this);
    }

    public void execute() {
        if (this.order.isPaid()) {
            System.out.println("The order has been paid,increased points");
        } else {
            System.out.println("The order has not been paid,don't increase point");
        }
    }
}
