/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * @return the currency
     */
    protected String currency() {
        return currency;
    }

    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount
                && this.getClass().equals(obj.getClass());
    }

}
