package Sprint1.Uppgift2;

public class Cykel extends Fordon implements Printable, Hjulburen{
    private int amountOfGears;
    private int currentGear;
    private int amountOfWheels = 2;

    public Cykel(float speed, int weightInKilos, int amountOfGears, int currentGear){
        super(speed, weightInKilos);
        this.amountOfGears = amountOfGears;
        this.currentGear = currentGear;
    }

    public void changeGear(int gear){
        if(gear <= amountOfGears && gear >= 1){
            this.currentGear = gear;
        }
    }

    public void printMe(){
        System.out.println("Weight:\t" + this.getWeightInKilos() + "\nSpeed:\t" + this.getSpeed() +
                "\nAmount of gears:\t" + this.amountOfGears + "\nCurrent gear:\t" + this.currentGear);
    }

    @Override
    public int getAntalHjul() {
        return amountOfWheels;
    }
}
