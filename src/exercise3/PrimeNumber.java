package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int i = 2;
        boolean Prime = true;

        while(number > i) {
          if(number % i == 0)  {
            Prime = false;
            break;
          }
          i++;
        }
        System.out.println("Prime number: " + Prime);
        
         
        
    }

}