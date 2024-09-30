package Sprint1.Uppgift2;

public class Tåg extends Fordon implements Printable, Hjulburen{
    private int amountOfWagons;
    private int amountOfWheels;

    public Tåg(float speed, int weightInKilos, int amountOfWagons){
        super(speed, weightInKilos);
        this.amountOfWagons = amountOfWagons;
        this.amountOfWheels = amountOfWagons * 8;
    }

    public void connectWagons(int amountOfWagons) {
        this.amountOfWagons += amountOfWagons;
        this.amountOfWheels = this.amountOfWagons * 8;
    }

    public void printMe(){
        System.out.println("Weight:\t" + this.getWeightInKilos() + "\nSpeed:\t" + this.getSpeed() +
                "\nAmount of wagons:\t" + this.amountOfWagons);
    }

    @Override
    public int getAntalHjul() {
        return amountOfWheels;
    }
}
