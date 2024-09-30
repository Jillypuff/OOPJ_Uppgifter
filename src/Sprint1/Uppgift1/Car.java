package Sprint1.Uppgift1;

public class Car {

    private String licencePlate;
    private final String model;
    private final String make;
    private CarOwner owner;

    public Car(String licencePlate, String model, String make) {
        this.licencePlate = licencePlate;
        this.model = model;
        this.make = make;
    }

    public void buyCar(CarOwner owner) {
        if(this.owner != null){
            System.out.println("This car is already owned.");
        } else {
            this.owner = owner;
        }
    }

    public void tradeCar(Car car, CarOwner owner) {
        if (this.owner == null || car.owner == null){
            System.out.println("Both cars must be owned to trade.");
            return;
        }
        car.owner = this.owner;
        this.owner = owner;
    }

    public void sellCar(){
        this.owner = null;
    }

    public void changeLicensePlate(String newLicencePlate) {
        this.licencePlate = newLicencePlate;
    }

    @Override
    public String toString() {
        if (owner == null){
            return model + " " + make + "\nLicence plate: " + licencePlate + "\nCurrently not owned.";
        }
        return model + " " + make + "\nLicence plate: " + licencePlate + "\nOwned by " + owner.getName();
    }

    public CarOwner getOwner() {
        return owner;
    }
}
