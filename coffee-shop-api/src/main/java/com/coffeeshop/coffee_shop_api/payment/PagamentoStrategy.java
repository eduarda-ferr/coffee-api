package com.coffeeshop.coffee_shop_api.payment;

public interface PagamentoStrategy {
    String processarPagamento(double valor);
}