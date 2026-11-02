package com.coffeeshop.coffee_shop_api.model;

public class Cafe extends Bebida {
    @Override
    public String getNome() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
