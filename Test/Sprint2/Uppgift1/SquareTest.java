package Sprint2.Uppgift1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {

    Square s = new Square();
    int length = 5;
    int height = 10;

    @Test
    public void getAreaTest(){
        assertEquals(50, s.getArea(length, height));
        assert(s.getArea(length, height) == 50);
        assert(s.getArea(length, height) != 100);
    }

    @Test
    public void getCircumferenceTest(){
        assert(s.getCircumference(length, height) == 30);
        assert(s.getCircumference(length, height) != 100);
    }
}
