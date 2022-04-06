/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount
                && this.getClass().equals(obj.getClass());
    }

}
