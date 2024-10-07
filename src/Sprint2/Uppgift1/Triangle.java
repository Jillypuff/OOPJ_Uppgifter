package Sprint2.Uppgift1;

public class Triangle implements Figure{

    int length = 5;
    int height = 10;

    public double getArea(int length, int height) {
        return (double) (length * height) / 2;
    }

    public double getCircumference(int length, int height) {
        return length + (getHypotenuse(length, height) * 2);
    }

    private double getHypotenuse(int length, int height) {
        return Math.sqrt(Math.pow((double) length / 2, 2) + Math.pow(height, 2));
    }
}
