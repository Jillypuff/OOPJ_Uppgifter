package Sprint1.Uppgift1;

public class MainProgram {

    public MainProgram(){
        CarOwner alice = new CarOwner("Alice", "Maple Street 12", 45);
        CarOwner bob = new CarOwner("Bob", "Elm Avenue 78", 29);
        CarOwner charlie = new CarOwner("Charlie", "Oak Road 33", 52);

        Car ford = new Car("ABC123", "Mustang", "Ford");
        Car toyota = new Car("XYZ789", "Corolla", "Toyota");
        Car bmw = new Car("LMN456", "X5", "BMW");

        ford.buyCar(alice);
        System.out.println(alice);
        ford.sellCar();
        System.out.println(ford);
        System.out.println();
        ford.buyCar(bob);
        toyota.buyCar(charlie);
        System.out.println(ford + "\n" + toyota);
        ford.tradeCar(toyota, charlie);
        System.out.println(ford + "\n" + toyota);
    }

    public static void main(String[] args) {
        MainProgram _ = new MainProgram();
    }
}
