package org.example;

import java.util.Scanner;

public class Main {

    static void main() { {

        Scanner scanner = new Scanner(System.in);
        String repeat;

        do {
            System.out.println("Enter value a:");
            int a = scanner.nextInt();

            System.out.println("Enter value b:");
            int b = scanner.nextInt();

            if (a < -20 || a > 20 || b < -20 || b > 20) {
                System.out.println("Error: values must be in range -20 to 20");
            } else {

                EquationSolver solver = new EquationSolver();
                double result = solver.solveEquation(a, b);
                System.out.println("Result: " + result);
            }

            System.out.println("Would you like to repeat the algorithm? (yes/no)");
            repeat = scanner.next();

        } while (repeat.equalsIgnoreCase("yes"));

        scanner.close();
    }
}