package com.coffeeshop.coffee_shop_api.exception;

public class BebidaNaoEncontradaException extends RuntimeException {
    public BebidaNaoEncontradaException(String tipo) {
        super("Bebida não encontrada: " + tipo);
    }
}
