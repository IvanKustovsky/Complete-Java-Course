package exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {12,2,37,4};

            int number = numbers[5];

            System.out.println("Before Scanner close");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Before scanner close");
            if (scanner != null)  {
                scanner.close();
            }
        }
        System.out.println("Just Before closing out main");
    }
}
