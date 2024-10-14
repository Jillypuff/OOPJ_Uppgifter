package Sprint2.Uppgift9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TallPeopleFinder {

    String dataFilePath = "src/Sprint2/Uppgift9/personuppgifter.txt";
    String outputFilePath = "src/Sprint2/Uppgift9/tallpeople.txt";
    String data;
    StringBuilder output = new StringBuilder();

    public TallPeopleFinder(){

        try (FileReader reader = new FileReader(dataFilePath);
             BufferedReader bufferedReader = new BufferedReader(reader)){
            while ((data = bufferedReader.readLine()) != null) {
                data += "\n" + bufferedReader.readLine();
                String[] dataParts = data.split("[,\\n]");
                if (isOverTwoMeter(dataParts[5].trim())){
                    output.append(data);
                    output.append("\n");
                }
            }
            output.setLength(output.length()-1);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(output);

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write(output.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOverTwoMeter(String data){
        return Integer.parseInt(data) > 200;
    }

    public static void main(String[] args){
        new TallPeopleFinder();
    }
}
