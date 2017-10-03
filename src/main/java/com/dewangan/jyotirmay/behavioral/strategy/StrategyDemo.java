package com.dewangan.jyotirmay.behavioral.strategy;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("jyotirmay.iitkgp@gmail.com", "passwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Jyotirmay Dewangan", "1234567890123456", "786", "12/15"));
    }
}