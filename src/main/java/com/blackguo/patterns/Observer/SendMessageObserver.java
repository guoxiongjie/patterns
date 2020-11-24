package com.blackguo.patterns.Observer;

/**
 * 发送消息观察者
 */
public class SendMessageObserver extends OrderObserver {

    public SendMessageObserver(Order order) {
        this.order = order;
        this.order.attach(this);
    }

    public void execute() {
        if (this.order.isPaid()) {
            System.out.println("The order has been paid,sent a message");
        } else {
            System.out.println("The order has not been paid,don't send message");
        }
    }
}
