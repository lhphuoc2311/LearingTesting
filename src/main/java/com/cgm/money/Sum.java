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
     * @param addendS
     */
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = this.augend.amount + this.addend.amount;
        return new Money(amount, to);


    }

    
    
}
