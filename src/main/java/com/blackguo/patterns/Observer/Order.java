package com.blackguo.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单
 */
public class Order {

    /**
     * 对订单的观察者
     */
    private List<OrderObserver> observerList = new ArrayList<>();

    /**
     * 是否支付成功
     */
    private boolean paid = false;

    /**
     * 是否已支付
     * @return
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * 设置支付成功，并通知观察者
     *
     * @param paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
        notifyObservers();
    }

    /**
     * 增加观察者
     *
     * @param observer
     */
    public void attach(OrderObserver observer) {
        observerList.add(observer);
    }

    /**
     * 通知所有观察者
     */
    private void notifyObservers() {
        for (OrderObserver observer : observerList) {
            observer.execute();
        }
    }
}
