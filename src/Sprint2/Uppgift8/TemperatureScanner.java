package Sprint2.Uppgift8;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TemperatureScanner {

    String fileName = "src/Sprint2/Uppgift8/temp.txt";
    String data;
    List<Double> temperatures = new ArrayList<Double>();

    public TemperatureScanner(){

        try (Scanner scan = new Scanner(new File(fileName))){
            while (scan.hasNextDouble()){
                data = scan.nextLine().replaceAll(",", ".");
                temperatures.add(Double.parseDouble(data));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            System.exit(1);
        }


        System.out.println("Average temperature: " + getAverageTemperature() +
                "\nHighest recorded temperature: " + getHighestTemperature());

    }

    public double getHighestTemperature(){
        return temperatures.stream()
                .max(Comparator.naturalOrder())
                .orElse(Double.NaN);
    }

    public double getAverageTemperature(){
        return temperatures.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);
    }


    public static void main(String[] args){
        new TemperatureScanner();
    }
}
