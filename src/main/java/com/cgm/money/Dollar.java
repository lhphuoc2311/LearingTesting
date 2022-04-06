/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Dollar {

    private int amount;

    public Dollar(int amount){
        this.amount = amount;

    }

    Dollar times(int multiplier){

        return new Dollar(amount * multiplier);

    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return this.amount == dollar.amount;
    }
    
}
