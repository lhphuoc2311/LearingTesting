/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return this.amount == franc.amount;
    }

}
