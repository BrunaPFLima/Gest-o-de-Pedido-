package com.exemplo.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.gestao.model.OrderManager;
import com.pedido.gestao.service.PaymentStrategy;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderManager orderManager;

    @Autowired
    @Qualifier("creditCardPayment") // ou "payPalPayment" dependendo da implementação que você quer usar
    private PaymentStrategy paymentStrategy;

    @PostMapping("/process")
    public String processOrder(@RequestParam String order, @RequestParam int amount) {
        String orderResult = orderManager.processOrder(order);
        String paymentResult = paymentStrategy.pay(amount);
        return orderResult + " " + paymentResult;
    }
}


