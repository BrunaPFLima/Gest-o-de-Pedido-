package com.pedido.gestao.model;


import org.springframework.stereotype.Component;

@Component
public class OrderManager {
    private static OrderManager instance;

    private OrderManager() {}

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public String processOrder(String order) {
        return "Pedido " + order + " processado.";
    }
}

