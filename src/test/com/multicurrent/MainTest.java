package com.multicurrent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testDollarMultiplication() {
        Dollar five = Money.dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.getAmount());
        product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    public void testDollarEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(7)));

        Dollar dollar = new Dollar();
        dollar.setAmount(20);
        assertEquals(Money.dollar(20), dollar);
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        Franc product = five.times(2);
        assertEquals(10, product.getAmount());
        product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    public void testFrancEquality() {
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(7)));

        Franc franc = new Franc();
        franc.setAmount(20);
        assertEquals(Money.franc(20), franc);
    }
}
