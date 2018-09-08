package com.br.felix;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> product = new Map<>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Integer get(Object key) {
            return null;
        }

        @Override
        public Integer put(Product key, Integer value) {
            return null;
        }

        @Override
        public Integer remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends Product, ? extends Integer> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<Product> keySet() {
            return null;
        }

        @Override
        public Collection<Integer> values() {
            return null;
        }

        @Override
        public Set<Entry<Product, Integer>> entrySet() {
            return null;
        }
    };

    public Bill(Customer customer){
        this.customer = customer;
    }

    public void addProduct(Product product, Integer quantity){
        this.product.put(product,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProduct() {
        return product;
    }
}
