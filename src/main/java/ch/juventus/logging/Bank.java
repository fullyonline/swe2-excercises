package ch.juventus.logging;

public class Bank {

    private Double money;

    public Bank(){
        money = 0.d;
    }

    public boolean withdraw(Double value){
        Double newValue = money - value;

        if (value <= 0 || newValue < 0){
            return false;
        }

        money = newValue;
        return true;
    }

    public boolean deposit(Double value){

        if(value < 0){
            return false;
        }

        money = money + value;
        return true;
    }

    public Double retrieveBalance(){
        return money;
    }

}
