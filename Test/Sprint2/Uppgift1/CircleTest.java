package Sprint2.Uppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c = new Circle();

    int diameter = 10;
    int radius = diameter/2;

    @Test
    public void getAreaTest(){
        assertEquals(78.54, c.getArea(radius), 0.01);
    }

    @Test
    public void getCircumferenceTest(){
        assertEquals(31.4159, c.getCircumference(radius) ,0.0001);
    }
}