package Sprint2.Uppgift1;

public class Circle {

    int diameter = 10;
    int radius = diameter/2;

    public double getArea(int radius){
        return Math.PI * radius * radius;
    }

    public double getCircumference(int radius){
        return 2 * Math.PI * radius;
    }

}
