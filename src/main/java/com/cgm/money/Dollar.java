/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;

    }

    public Money times(int multiplier) {

        return new Dollar(amount * multiplier);

    }

}
