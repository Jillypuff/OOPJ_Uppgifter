package Sprint1.Uppgift2;

public class Huvudprogram {

    private final Fordon cykel = new Cykel(40, 7, 5,1);
    private final Fordon båt = new Båt(75, 300, 25);
    private final Fordon bil = new Bil(160, 900, 7, 1);
    private final Fordon tåg = new Tåg(250, 12000, 20);
    private final Printable p = new Bil(180, 1000, 6,1);

    public Huvudprogram(){
        printAll();
    }

    private void printAll(){
        cykel.printMe();
        båt.printMe();
        bil.printMe();
        tåg.printMe();
        p.printMe();
    }

    public static void main(String[] args) {
        Huvudprogram _ = new Huvudprogram();
    }
}
