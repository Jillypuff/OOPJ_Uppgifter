package Sprint2.Uppgift2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuelUsageTest {

    FuelUsage fu = new FuelUsage();

    int carMileage = 1350;
    int carMileageLastYear = 1139;
    double fuelLastYear = 185.68;

    @Test
    public void milesDrivenLastYearTest(){
        assertEquals(211, fu.milesDrivenLastYear(carMileage, carMileageLastYear));
    }

    @Test
    public void fuelPerMileTest(){
        assertEquals(1.13, fu.fuelPerMile(carMileage, carMileageLastYear, fuelLastYear), 0.01);
    }
}
