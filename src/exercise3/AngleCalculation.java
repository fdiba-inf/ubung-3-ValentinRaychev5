package exercise3;

import java.util.Scanner;
import java.lang.Math;
public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();
        char type = input.next().charAt(0);
        while(type == 'd' || type == 'r') {

          if(type == 'd') {
            System.out.print("Angle: " + number + "d");
            number = input.nextInt();
            type = input.next().charAt(0);
          }
          else if (type == 'r')  {
            number = (number * Math.PI) / 180.0;
            System.out.print("Angle: " + number + "r");
            number = input.nextInt();
            type = input.next().charAt(0);
          }
          else {
            break;
          }
            
        }
        


    }
  
}
