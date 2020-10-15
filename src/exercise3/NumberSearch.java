package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i = 100; i < 1001; i++) {
          if(i % 5 == 0 && i % 6 == 0 )  {

            if(count < 9) {
              System.out.print(i + " ");
              count++;
            }
            else if (count == 9) {
              System.out.print(i);
              count++;
            }
            if (count == 10) {
              System.out.println();
              count = 0;
            }

          }
        }

    }

}