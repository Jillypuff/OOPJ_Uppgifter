package Sprint2.Uppgift8;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Temperature {

    String fileName = "src/Sprint2/Uppgift8/temp.txt";
    String data;
    List<Double> temperatures = new ArrayList<Double>();

    public Temperature(){

        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)){

            while((data = bufferedReader.readLine()) != null){
                data = data.replaceAll(",",".");
                temperatures.add(Double.parseDouble(data));
            }
        } catch (Exception e){
            e.printStackTrace();
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
        new Temperature();
    }
}
