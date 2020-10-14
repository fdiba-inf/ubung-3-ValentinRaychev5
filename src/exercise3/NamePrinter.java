package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.next();
        int current = name.length();
        for(int i = 0; i <= current; i++) {
          char letter = name.charAt(i);
          System.out.println("* " + letter + " *");
        }
    }

}
