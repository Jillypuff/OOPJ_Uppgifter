package Sprint1.Uppgift6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    final private List<Animals> allAnimals = new ArrayList<Animals>();

    public Main(){
        allAnimals.add(new Zebra());
        allAnimals.add(new Cod());
        allAnimals.add(new Bass());
        allAnimals.add(new Elephant());
        for (Animals animal : allAnimals) {
            animal.sound();
        }
    }


    public static void main(String[] args) {
        Main _ = new Main();
    }
}
