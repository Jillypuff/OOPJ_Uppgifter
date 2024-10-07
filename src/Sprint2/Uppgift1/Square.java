package Sprint2.Uppgift1;

public class Square implements Figure{

    int length = 5;
    int height = 10;

    public double getArea(int length, int height){
        return length * height;
    }

    public double getCircumference(int length, int height){
        return 2 * length + 2 * height;
    }

}
