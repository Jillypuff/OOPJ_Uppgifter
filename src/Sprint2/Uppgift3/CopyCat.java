package Sprint2.Uppgift3;

import java.util.Scanner;

public class CopyCat {

    Scanner input = new Scanner(System.in);
    StringBuilder output = new StringBuilder();

    public CopyCat(){
        while(true){
            output.setLength(0);
            output.append("You wrote: ");
            output.append(input.nextLine());
            System.out.println(output.toString());
        }
    }




    public static void main(String[] args) {
        new CopyCat();
    }

}
