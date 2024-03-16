package exceptionHandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {12, 2, 37, 4};
            int number = numbers[55];
        }
    }
}
