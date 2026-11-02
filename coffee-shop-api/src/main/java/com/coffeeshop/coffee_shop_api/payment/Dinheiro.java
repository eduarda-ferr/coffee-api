package com.coffeeshop.coffee_shop_api.payment;

public class Dinheiro implements PagamentoStrategy {
    @Override
    public String processarPagamento(double valor) {
        return "💵 Pagamento de R$ " + valor + " processado em Dinheiro.";
    }
}