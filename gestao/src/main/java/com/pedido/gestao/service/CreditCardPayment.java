package com.pedido.gestao.service;


import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Pagamento de " + amount + " realizado com cartão de crédito.";
    }
}
