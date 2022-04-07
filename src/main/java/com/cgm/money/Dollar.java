/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {

        return Money.dollar(this.amount * multiplier);

    }

}
