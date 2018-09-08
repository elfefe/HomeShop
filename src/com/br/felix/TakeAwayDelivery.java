package com.br.felix;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }
    @Override
    public String getInfo(){
        return "TakeAwayDelivery";
    }
}
