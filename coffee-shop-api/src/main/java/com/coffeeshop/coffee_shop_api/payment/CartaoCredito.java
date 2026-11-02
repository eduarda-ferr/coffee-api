package com.coffeeshop.coffee_shop_api.payment;

public class CartaoCredito implements PagamentoStrategy {
    @Override
    public String processarPagamento(double valor) {
        return "💳 Pagamento de R$ " + valor + " processado via Cartão de Crédito.";
    }
}