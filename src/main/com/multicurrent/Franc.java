package com.multicurrent;

public class Franc extends Money {

    public Franc() {}
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
