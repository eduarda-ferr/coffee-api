package com.coffeeshop.coffee_shop_api.controller;

import com.coffeeshop.coffee_shop_api.dto.PagamentoRequestDTO;
import com.coffeeshop.coffee_shop_api.payment.CartaoCredito;
import com.coffeeshop.coffee_shop_api.payment.Dinheiro;
import com.coffeeshop.coffee_shop_api.payment.PagamentoStrategy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    @PostMapping("/processar")
    public String processarPagamento(@RequestBody PagamentoRequestDTO request) {
        PagamentoStrategy estrategiaPagamento;

        if (request.getTipo().equalsIgnoreCase("CARTAO")) {
            estrategiaPagamento = new CartaoCredito();
        } else if (request.getTipo().equalsIgnoreCase("DINHEIRO")) {
            estrategiaPagamento = new Dinheiro();
        } else {
            return "Método de pagamento inválido!";
        }

        // Executa o comportamento encapsulado pela Strategy
        return estrategiaPagamento.processarPagamento(request.getValor());
    }
}