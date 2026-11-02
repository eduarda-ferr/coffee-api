package com.coffeeshop.coffee_shop_api.factory;

import com.coffeeshop.coffee_shop_api.model.Bebida;
import com.coffeeshop.coffee_shop_api.model.Cafe;
import com.coffeeshop.coffee_shop_api.model.Cha;
import com.coffeeshop.coffee_shop_api.model.TipoBebida;
import com.coffeeshop.coffee_shop_api.exception.BebidaNaoEncontradaException;


public class BebidaFactory {
    public static Bebida criarBebida(TipoBebida tipo) {
        if (tipo == null) {
            throw new BebidaNaoEncontradaException("vazio");
        }

        switch (tipo) {
            case CAFE:
                return new Cafe();
            case CHA:
                return new Cha();
            case MOCHA:
                // Como adicionamos o Mocha ao enum, podemos criar a classe Mocha ou tratá-lo aqui futuramente
                throw new BebidaNaoEncontradaException("Mocha ainda não disponível no cardápio!");
            default:
                throw new BebidaNaoEncontradaException(tipo.name());
        }
    }
}