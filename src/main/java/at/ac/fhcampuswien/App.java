package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        double largestNumber = 0;
        double input;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Number " + counter + ": ");
            input = scanner.nextDouble();
            if (input > 0) {
                if (input > largestNumber) largestNumber = input;
            }
            counter++;
        } while (input > 0);
        if (largestNumber == 0) System.out.println("No number entered.");
        else System.out.println(String.format("The largest number is %.2f", largestNumber));
    }

    //todo Task 2
    public void stairs() {
        int input;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        input = scanner.nextInt();

        if (input <= 0) System.out.println("Invalid number!");
        else {
            for (int i = 1; i <= input; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(counter);
                    counter++;
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        final int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = rows - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        int h;
        char c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        h = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.next().charAt(0);

        if (h % 2 == 0) System.out.println("Invalid number!");
        else {
            int spaceCounter = (h - 1) / 2 - 1;
            int letterCounter = 1;
            int letterChangeRate = 1;

            for (int i = 1; i <= h; i++) {
                for (int j = 0; j < i + spaceCounter; j++) {
                    System.out.print(" ");
                }
                if (spaceCounter > -1 * ((h + 1) / 2)) spaceCounter -= 2;

                int asciiValue = c - (letterCounter - 1) / 2;
                boolean increaseAsciiValue = true;
                for (int k = 0; k < letterCounter; k++) {
                    System.out.print((char) asciiValue);
                    if (asciiValue == c) increaseAsciiValue = false;
                    if (increaseAsciiValue) asciiValue++;
                    else asciiValue--;
                }

                if (i < (h + 1) / 2) letterChangeRate += 1;
                else letterChangeRate -= 3;
                letterCounter = i + letterChangeRate;
                System.out.println();
            }
        }
    }


    //todo Task 5
    public void marks() {
        ArrayList list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int input;
        int counter = 1;
        int negativeCounter = 0;

        do {
            System.out.print("Mark " + counter + ": ");
            input = scanner.nextInt();
            if (input >= 1 && input <= 5) {
                list.add(input);
                counter++;
                if (input == 5) negativeCounter++;
            }
            else if (input == 0) {
                if (list.size() == 0) list.add(0);
                System.out.println(String.format("Average: %.2f", list.stream().mapToInt(i -> (int) i).average().getAsDouble()));
                System.out.println("Negative marks: " + negativeCounter);
            }
            else System.out.println("Invalid mark!");
        } while (input != 0);
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}