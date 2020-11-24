package com.blackguo.patterns.Observer;

/**
 * 订单观察者抽象类
 */
public abstract class OrderObserver {

    protected Order order;

    public abstract void execute();
}
