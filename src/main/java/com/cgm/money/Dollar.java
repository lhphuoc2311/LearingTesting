/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount = amount;

    }

    Dollar times(int multiplier){

        return new Dollar(amount * multiplier);

    }
    
}