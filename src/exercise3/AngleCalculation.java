package exercise3;

import java.util.Scanner;
import java.lang.Math;
public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();
        char type = input.next().charAt(0);
        while(type == 'd' || type == 'r') {

          if(type == 'r') {
            double degree = number * (180 / Math.PI);
            System.out.println("Angle: " + degree + "d");
          }
          else if (type == 'd')  {
            double radian = number * (Math.PI / 180.0);
            System.out.println("Angle: " + radian + "r");
          }
          else {
            break;
          }
          number = input.nextInt();
          type = input.next().charAt(0);
            
        }
        


    }
  
}
