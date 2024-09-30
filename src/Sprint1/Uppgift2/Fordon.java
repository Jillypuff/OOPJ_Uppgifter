package Sprint1.Uppgift2;

public abstract class Fordon {

    private float speed;
    private int weightInKilos;

    public Fordon(float speed, int weightInKilos) {
        this.speed = speed;
        this.weightInKilos = weightInKilos;
    }

    public abstract void printMe();

    public void changeSpeed(float speed) {
        this.speed = speed;
    }

    public int getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(int weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
