package Sprint1.Uppgift2;

public class Båt extends Fordon implements Printable{
    private int deadWeight;

    public Båt(float speed, int weightInKilos, int deadWeight){
        super(speed, weightInKilos);
        this.deadWeight = deadWeight;
    }

    public void turn(){
        System.out.println("Boat turns left");
    }

    public void printMe(){
        System.out.println("Weight:\t" + this.getWeightInKilos() + "\nSpeed:\t" + this.getSpeed() +
                "\nDead weight:\t" + this.deadWeight);
    }
}
