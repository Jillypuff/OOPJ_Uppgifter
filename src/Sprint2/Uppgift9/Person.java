package Sprint2.Uppgift9;

public class Person {

    String name;
    String address;
    String city;
    int age;
    int weight;
    int length;

    public Person (String name, String address, String city, int age, int weight, int length) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public Person (String data){
        String[] dataParts = data.split("[,\\n]");
        for (int i = 0; i < dataParts.length; i++){
            dataParts[i] = dataParts[i].trim();
        }
        this.name = dataParts[0];
        this.address = dataParts[1];
        this.city = dataParts[2];
        this.age = Integer.parseInt(dataParts[3]);
        this.weight = Integer.parseInt(dataParts[4]);
        this.length = Integer.parseInt(dataParts[5]);
    }

    public boolean isOverTwoMeter(){
        return this.length > 200;
    }

    @Override
    public String toString(){
        return name + ", " + address + ", " + city + "\n" + age + ", " + weight + ", " + length;
    }
}
