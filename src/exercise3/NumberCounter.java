package exercise3;

import java.util.Scanner;

public class NumberCounter {

  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);

    double sum = 0;
    double positiveCount = 0;
    double negativeCount = 0;
    double number = input.nextInt();;

    while(number != 0)  {

      if(number > 0)  {

        positiveCount++;
      }
      else  {

        negativeCount++;
      }
      sum += number;

    number = input.nextInt();
    }

    double average = sum / (positiveCount + negativeCount);

    System.out.println("Positive numbers: " + positiveCount);
    System.out.println("Negative numbers: " + negativeCount);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}