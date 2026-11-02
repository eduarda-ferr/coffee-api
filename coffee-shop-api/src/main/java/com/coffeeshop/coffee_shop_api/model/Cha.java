package com.coffeeshop.coffee_shop_api.model;

public class Cha extends Bebida {
    @Override
    public String getNome() {
        return "Chá";
    }

    @Override
    public double getPreco() {
        return 4.0;
    }
}
