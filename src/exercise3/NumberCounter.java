package exercise3;

import java.util.Scanner;

public class NumberCounter {

  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);

    double sum = 0;
    int positiveCount = 0;
    int negativeCount = 0;
    int number = input.nextInt();;

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

    double average = 0.0 + (sum / (positiveCount + negativeCount));

    System.out.println("Positive numbers: " + positiveCount);
    System.out.println("Negative numbers: " + negativeCount);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}