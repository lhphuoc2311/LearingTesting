/*
*  created date: Apr 07, 2022
*  author: cgm
*/
package com.cgm.money;

public class Sum implements Expression {
    Money augend;
    Money addend;
    /**
     * @param augend
     * @param addend
     */
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to){
        int amount = this.augend.amount + this.addend.amount;
        return new Money(amount, to);


    }

    
    
}
