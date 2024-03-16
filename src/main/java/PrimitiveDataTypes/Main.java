package PrimitiveDataTypes;

import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doubleValues();
        System.out.println(numbers.getValue1());
        System.out.println(numbers.getValue2());
        //
        SimpleInterestCalculator calculator =
                new SimpleInterestCalculator("4500.00","7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
        //
        MyChar myChar = new MyChar('y');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
        Student student = new Student("Mark",10,23,23);
        student.removeMarkAtIndex(1);
        student.addNewMark(11);
        student.print(1,2,4,6);
        System.out.println(student);
        System.out.println(getStats(1000000));
    }

    public static int getStats(int number){
        Random randomGenerator = new Random();
        int iterator= 0;
        int counterOfWins = 0;
        int choice;
        while (iterator < number){
            choice = randomGenerator.nextInt(3);
            if(choice < 2){
                counterOfWins++;
            }
            iterator++;
        }
        return counterOfWins;
    }
}