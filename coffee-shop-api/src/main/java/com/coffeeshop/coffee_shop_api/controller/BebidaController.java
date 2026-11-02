package com.coffeeshop.coffee_shop_api.controller;

import com.coffeeshop.coffee_shop_api.model.Bebida;
import com.coffeeshop.coffee_shop_api.model.TipoBebida;
// Importa a tua factory conforme o pacote onde a colocaste
import com.coffeeshop.coffee_shop_api.factory.BebidaFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    @GetMapping
    public List<Bebida> listarBebidas() {
        // Usamos a tua factory para criar as bebidas de exemplo
        Bebida cafe = BebidaFactory.criarBebida(TipoBebida.CAFE);
        Bebida cha = BebidaFactory.criarBebida(TipoBebida.CHA);

        // O Spring Boot converte automaticamente esta lista em formato JSON!
        return List.of(cafe, cha);
    }
}