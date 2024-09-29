package com.pedido.gestao.service;


import org.springframework.stereotype.Service;

@Service
public class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Pagamento de " + amount + " realizado com PayPal.";
    }
}

