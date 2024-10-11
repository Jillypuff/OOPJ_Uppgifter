package Sprint2.Uppgift6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChangeCalculatorTest {

    ChangeCalculator cc = new ChangeCalculator();

    @Test
    public void getChangeTest(){
        assertEquals(561, cc.getChange(1000, 439));
    }

    @Test
    public void getAmountOfDenominationTest(){
        assertEquals(1, cc.getAmountOfDenomination(259, 200));
        assertEquals(5, cc.getAmountOfDenomination(5999, 1000));
        assertEquals(0, cc.getAmountOfDenomination(459, 500));
        assertEquals(1, cc.getAmountOfDenomination(59, 50));
    }

    @Test
    public void coinOrBillTest(){
        String coin = "coins";
        String bill = "bills";
        assertEquals(coin, cc.coinOrBill(19));
        assertEquals(bill, cc.coinOrBill(20));
        assertEquals(coin, cc.coinOrBill(1));
        assertEquals(bill, cc.coinOrBill(1000));
    }

    @Test
    public void createPartOfPrompt(){
        assertEquals("Amount of 20-bills: 2", cc.createPartOfPrompt(20, 49));
        assertEquals("Amount of 5-coins: 1", cc.createPartOfPrompt(5, 9));
    }
}
