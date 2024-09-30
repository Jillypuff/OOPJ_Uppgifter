package Sprint1.Uppgift9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final List<RomanNumerals> allNumbers = new ArrayList<>();

    public Main(){
        allNumbers.add(RomanNumerals.I);
        allNumbers.add(RomanNumerals.V);
        allNumbers.add(RomanNumerals.X);
        allNumbers.add(RomanNumerals.L);
        allNumbers.add(RomanNumerals.C);
        allNumbers.add(RomanNumerals.D);
        allNumbers.add(RomanNumerals.M);
        printAll();
    }

    private void printAll(){
        for (RomanNumerals numeral : allNumbers) {
            System.out.println(numeral.getValue());
        }
    }

    public static void main(String[] args) {
        Main _ = new Main();
    }
}
