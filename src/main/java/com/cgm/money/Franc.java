/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
