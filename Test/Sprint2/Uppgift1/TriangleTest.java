package Sprint2.Uppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle t = new Triangle();

    int length = 5;
    int height = 10;

    @Test
    public void getAreaTest(){
        assert(t.getArea(length, height) == 25);
    }

    @Test
    public void getCircumferenceTest(){
        assertEquals(t.getCircumference(length, height), 25.62, 0.01);
    }
}