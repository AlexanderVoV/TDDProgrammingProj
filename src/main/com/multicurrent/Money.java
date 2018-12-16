package com.multicurrent;

public class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Money moneyObj = (Money) obj;
        return amount == moneyObj.amount
                && getClass().equals(moneyObj.getClass());
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
