package Sprint1.Uppgift1;

public class CarOwner extends Person{

    public CarOwner(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public String toString() {
        return this.getName() + "\n" + this.getAddress() + "\n" + this.getAge();
    }
}
