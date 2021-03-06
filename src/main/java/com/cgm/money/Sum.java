/*
*  created date: Apr 07, 2022
*  author: cgm
*/
package com.cgm.money;

public class Sum implements Expression {
    Expression augend;
    Expression addend;
    /**
     * @param augend
     * @param addendS
     */
    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = this.augend.reduce(bank, to).amount + this.addend.reduce(bank, to).amount;
        return new Money(amount, to);

    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }

    

    
    
}
