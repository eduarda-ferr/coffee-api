package com.coffeeshop.coffee_shop_api.dto;

public class PagamentoRequestDTO {
    private double valor;
    private String tipo;

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}