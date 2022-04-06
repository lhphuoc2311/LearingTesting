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

    void times(int multiplier){

        this.amount = this.amount * multiplier;

    }
    
}
