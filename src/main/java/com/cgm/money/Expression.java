/*
*  created date: Apr 07, 2022
*  author: cgm
*/
package com.cgm.money;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    
}
