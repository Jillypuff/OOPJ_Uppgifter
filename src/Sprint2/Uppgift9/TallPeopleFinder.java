package Sprint2.Uppgift9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TallPeopleFinder {

    String dataFilePath = "src/Sprint2/Uppgift9/personuppgifter.txt";
    String outputFilePath = "src/Sprint2/Uppgift9/tallpeople.txt";
    List<Person> persons = new ArrayList<>();
    List<Person> tallPeople = new ArrayList<>();

    public TallPeopleFinder(){
        readDataToList();
        findAllTallPeople();
        String output = getOutputString();
        writeToFile(output);
    }

    public void readDataToList(){
        String data;
        try (FileReader reader = new FileReader(dataFilePath);
             BufferedReader bufferedReader = new BufferedReader(reader)){
            while ((data = bufferedReader.readLine()) != null) {
                data += "\n" + bufferedReader.readLine();
                persons.add(new Person(data));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void findAllTallPeople(){
        for (Person person : persons) {
            if (person.isOverTwoMeter()){
                tallPeople.add(person);
            }
        }
    }

    public String getOutputString(){
        StringBuilder output = new StringBuilder();
        for (Person person : tallPeople) {
            output.append(person.toString());
            output.append("\n");
        }
        output.setLength(output.length()-1);
        return output.toString();
    }

    public void writeToFile(String data){
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write(data);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new TallPeopleFinder();
    }
}
