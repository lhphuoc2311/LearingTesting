/*
*  created date: Apr 06, 2022
*  author: cgm
*/
package com.cgm.money;

public class Money implements Expression {

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

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount
                && this.currency.equals(money.currency);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Money [amount=" + amount + ", currency=" + currency + "]";
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier,
                this.currency);
    }

    public Expression plus(Money addend){
        return new Sum(this, addend);
    }

    public Money reduce(String to){
        return this;
    }

}
