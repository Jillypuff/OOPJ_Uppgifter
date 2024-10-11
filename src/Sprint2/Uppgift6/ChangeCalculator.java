package Sprint2.Uppgift6;

import java.util.*;

public class ChangeCalculator {

    public int[] denominators = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    Random random = new Random();

    public ChangeCalculator() {
        for (int i = 0; i < 10; i++){
            int price = random.nextInt(3000);
            int payed = getPayment(price);
            System.out.println(createChangePrompt(payed, price));
        }
    }

    public String createChangePrompt(int payed, int price){
        int change = getChange(payed, price);
        if (change == 0) return noChange();
        if (change < 0) return notEnoughPayed();

        StringBuilder changePrompt = new StringBuilder();
        for (int i : denominators){
            if (i <= change){
                changePrompt.append(createPartOfPrompt(i, change)).append("\n");
                change -= getAmountOfDenomination(change, i) * i;
            }
        }
        changePrompt.setLength(changePrompt.length()-1);
        return changePrompt.toString();
    }

    public int getChange(int payed, int price){
        return payed - price;
    }

    public String noChange(){
        return "There is no change.";
    }

    public String notEnoughPayed(){
        return "You didn't pay enough.";
    }

    public int getAmountOfDenomination(int changeLeft, int denomination){
        return changeLeft / denomination;
    }

    public String coinOrBill(int denomination){
        return denomination < 20 ? "coins" : "bills";
    }

    public String createPartOfPrompt(int denomination, int changeLeft){
        return "Amount of " + denomination + "-" + coinOrBill(denomination)
                + ": " + getAmountOfDenomination(changeLeft, denomination);
    }

    public int getPayment(int price){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Price is : " + price + "\nHow much will you pay? ");
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scan.next();
            } catch (Exception e){
                System.out.println("Something went wrong. Try again.");
                scan.next();
            }
        }
    }

    public static void main(String[] args) {
        new ChangeCalculator();
    }
}
