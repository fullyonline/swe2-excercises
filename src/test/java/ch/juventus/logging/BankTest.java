package ch.juventus.logging;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    public static Bank bank;

    @BeforeEach
    public void initEach(){
        bank = new Bank();
    }

    @Test
    void shouldAddMoneyWhenGivenPositiveAmmount(){
        boolean result = bank.deposit(2.1555d);
        assertTrue(result);
    }

    @Test
    void shouldNotAddMoneyWhenGivenNegativeAmmount(){
        boolean result = bank.deposit(-2.222d);
        assertFalse(result);
    }

    @Test
    void shouldWithdrawMoneyWhenEnougthBalance(){
        bank.deposit(100.1211d);

        boolean result = bank.withdraw(100.d);

        assertTrue(result);
    }

    @Test
    void shouldNotWithdrawMoneyWhenNotEnougthBalance(){
        bank.deposit(99.9999);

        boolean result = bank.withdraw(100.d);

        assertFalse(result);
    }

    @Test
    void shouldDisplayTheCorrectAmmountWhenAddedBeforehand(){
        bank.deposit(1.155);

        Double result = bank.retrieveBalance();

        assertEquals(1.155d, result);
    }

    @Test
    void shouldNotDisplayTheCorrectAmmountWhenAddedSomethingElseBeforehand(){
        bank.deposit(1.155);

        Double result = bank.retrieveBalance();

        assertNotEquals(result, 1.156d);
    }

}