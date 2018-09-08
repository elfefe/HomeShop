package com.br.felix;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import java.util.HashMap;

public class Bill {
    private Client client;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Client client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    public void addProduct(Product product, int quantity) {
        this.products.put(product, quantity);
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
