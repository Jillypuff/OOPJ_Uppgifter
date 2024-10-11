package Sprint2.Uppgift2;

import javax.swing.*;

public class FuelUsage {

    int carMileage = 1350;
    int carMileageLastYear = 1139;
    double fuelLastYear = 1235.4;

    public FuelUsage(){
        String prompt = "Total mileage: " +
                carMileage +
                "\nTotal fuel last year: " +
                fuelLastYear +
                "\nFuel per mile: " +
                fuelPerMile(carMileage, carMileageLastYear, fuelLastYear);
        JOptionPane.showMessageDialog(null, prompt);
    }

    public int milesDrivenLastYear(int carMileage, int carMileageLastYear) {
        return carMileage - carMileageLastYear;
    }

    public double fuelPerMile(int carMileage, int carMileageLastYear, double fuelLastYear) {
        return milesDrivenLastYear(carMileage, carMileageLastYear) / fuelLastYear;
    }


    public static void main(String[] args){
        new FuelUsage();
    }
}
