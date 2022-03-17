package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    final Logger logger = LoggerFactory.getLogger(Bank.class);

    private Double balance;

    public Bank(){
        balance = 0.d;
    }

    public boolean withdraw(Double value){
        logger.info("withdraw: value: {}, current balance: {}", value, balance);

        Double newBalance = balance - value;
        if (value <= 0 || newBalance < 0){
            if(value <= 0){
                logger.error("withdraw: The value to withdraw {} is negative", value);
            }
            else{
                logger.error("withdraw: The new balance after withdrawing {} is negative", newBalance);
            }
            return false;
        }

        logger.info("withdraw: new balance: {}", newBalance);

        balance = newBalance;
        return true;
    }

    public boolean deposit(Double value){
        logger.info("deposit: deposit amount: {}, current balance: {}", value, balance);

        if(value < 0){
            logger.error("deposit: the deposit amount {} is negative", value);
            return false;
        }
        Double newBalance = balance + value;

        logger.info("deposit: new balance: {}", newBalance);

        balance = newBalance;
        return true;
    }

    public Double retrieveBalance(){
        logger.info("retrieveBalance: balace: {}", balance);
        return balance;
    }

}
